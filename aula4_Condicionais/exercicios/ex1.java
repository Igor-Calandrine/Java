package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
public static void main(String[] args) {
/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
*/
Locale.setDefault(Locale.US);

int numero, resultado;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite um número: ");
numero = input.nextInt();
input.nextLine();

resultado = numero % 2;

if (resultado == 0) {
   System.out.printf("O número %d é par", numero);
}
else {
   System.out.printf("O número %d é ímpar", numero);
}

input.close();



}
}
