package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex10 {
/*
Crie uma senha correta (por exemplo "java123").
O usuário terá 5 tentativas para digitá-la.
Utilize um for para controlar as tentativas.
Se acertar a senha, mostre "Acesso permitido" e interrompa o laço.
Caso contrário, mostre "Senha incorreta".
*/ 
public static void main(String[] args) {
   
Locale.setDefault(Locale.US);

String pass = "java123";
String inputPass;
int tentativas = 3;
int i;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

for (i = 1; i <= tentativas; i++) {
   System.out.printf("\nSenha: ");
   inputPass = input.nextLine();

   if (inputPass.equals(pass)) {
      System.out.printf("\nAcesso Permitido");
      break;
   }
   else if (i < tentativas) {
      System.out.printf("\nAcesso Negado");
      System.out.printf("\nVocê tem mais %d tentativas\n", tentativas - i);
   }
   else if (i == tentativas) {
      System.out.printf("\nAcesso Bloquedo");
   }
}

input.close();

}

}
