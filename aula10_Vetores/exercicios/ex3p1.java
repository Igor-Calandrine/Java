package aula10_Vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex3p1 {
/*
Faça um programa que leia um número inteiro positivo e negativo (máximo 10), armazene-os em um vetor, em seguida, mostar na tela todos os números negativos e positivos, separadamente.
*/ 
public static void main(String[] args) {
Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);

int[] numeros = new int[6];
int i = 0;

System.out.printf("\nDigite os números: ");

while (i < numeros.length) {
   System.out.printf("\n%d. ", i+1);
   numeros[i] = input.nextInt();
   input.nextLine();

   i += 1;
}

System.out.printf("\n\n===Números Positivos===");

for (i=0; i<numeros.length; i++) {
   if (numeros[i] > 0) {
      System.out.printf("\n" + "%d ", numeros[i]);
   }
}

System.out.printf("\n\n===Números Negativos===");
for (i=0; i<numeros.length; i++) {
   if (numeros[i] < 0) {
      System.out.printf("\n" + "%d ", numeros[i]);
   }
}

input.close();
}
}
