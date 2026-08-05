package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
public static void main(String[] args) {
/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

Locale.setDefault(Locale.US);

String senhaEntrada = "";
String senhaUsuario = "1234";
int tentativas = 0;
int tentativasMax = 3;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

while (tentativas <= tentativasMax) {
   
   System.out.printf("Digite sua senha: ");
   senhaEntrada = input.nextLine();

   if (senhaEntrada.equals(senhaUsuario)) {
      System.out.printf("Acesso Permitido\n");
   }
   else {
      tentativas += 1;
      
      if (tentativas <= tentativasMax) {
         System.out.printf("Acesso Negado\n");
         System.out.printf("Número máximo de tantativas: %d\n", tentativasMax);
         System.out.printf("Tentativas: %d\n", tentativas); 
      }
      else {
         System.out.printf("Acesso Bloqueado\n"); 
      }
      
   }
}

input.close();


}
}
