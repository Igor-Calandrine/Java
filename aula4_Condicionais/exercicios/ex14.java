package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex14 {
public static void main(String[] args) {
/*
Leia um número de 1 a 12 representando um mês.
Utilize switch para informar quantos dias esse mês possui.
Considere:
Fevereiro = 28 dias.
Não considere anos bissextos.
Dica: você pode agrupar vários case quando a resposta é a mesma.
*/
Locale.setDefault(Locale.US);

int mes;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite o número do mês para saber quantos dias tem nele");
System.out.printf("\n   ");

mes = input.nextInt();
input.nextLine();

switch (mes) {
   case 1, 3, 5, 7, 9, 11:
      System.out.printf("O mês tem 31 dias");
      break;
   case 2:
      System.out.printf("O mês tem 28 dias");
      break;
   case 4, 6, 8, 10, 12:
      System.out.printf("O mês tem 30 dias");
      break;
   default:
      System.out.printf("Não existe esse mês");
      break;
}

input.close();

}
}
