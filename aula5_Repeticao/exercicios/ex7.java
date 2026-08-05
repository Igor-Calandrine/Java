package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {
public static void main(String[] args) {
/*
Faça um programa que peça ao usuário um número inteiro positivo.
Utilize um for para contar de 1 até o número informado.
Para cada número, mostre:
"X é par" se o número for par.
"X é ímpar" se o número for ímpar.
*/

Locale.setDefault(Locale.US);

int numero, i;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("\nDigite um número inteiro positivo: ");
numero = input.nextInt();

for (i=1; i<=numero; i++) {
   if (i % 2 == 0) {
      System.out.printf("\n%d -> Par", i);
   }
   else {
      System.out.printf("\n%d -> Ímpar", i);
   }
}

input.close();

}
}
