package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex11 {
public static void main(String[] args) {
/*
Leia um número inteiro de 1 a 7 e exiba o dia da semana correspondente.
*/ 
Locale.setDefault(Locale.US);

int numero;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite o número correspondente ao dia da semana: ");
numero = input.nextInt();
input.nextLine();

switch (numero) {
   case 1:
      System.out.printf("O dia da semana é Domingo");
      break;
   case 2:
      System.out.printf("O dia da semana é Segunda");
      break;
   case 3:
      System.out.printf("O dia da semana é Terça");
      break;
   case 4:
      System.out.printf("O dia da semana é Quarta");
      break;
   case 5:
      System.out.printf("O dia da semana é Quinta");
      break;
   case 6:
      System.out.printf("O dia da semana é Sexta");
      break;
   case 7:
      System.out.printf("O dia da semana é Sábado");
      break;
   default:
      System.out.printf("Não há dia da semana correspondente");
}

input.close();

}
}
