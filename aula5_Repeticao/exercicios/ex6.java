package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
public static void main(String[] args) {
/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
*/ 

Locale.setDefault(Locale.US);

int numeroX, i;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("\nDigite um número: ");
numeroX = input.nextInt();
input.nextLine();

System.out.printf("\nNúmero primo: ");
for (i=1; i <= numeroX; i++) {
   if (i % 2 != 0) {
      System.out.printf("%d ", i);
   }
}

input.close();

}  
}
