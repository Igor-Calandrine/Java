package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
*/ 
Locale.setDefault(Locale.US);

int valorMenor, valorMaior, organizador;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite a seguir dois números inteiros para saber se eles são múltiplos entre si:");
System.out.printf("\nNúmero A -> ");
valorMenor = input.nextInt();
input.nextLine();

System.out.printf("Número B -> ");
valorMaior = input.nextInt();
input.nextLine();

// Coloca em ordem do menor para maior
if (valorMenor > valorMaior) {
   organizador = valorMaior;
   valorMaior = valorMenor;
   valorMenor = organizador;
}

if (valorMaior % valorMenor == 0) {
   System.out.printf("O número %d é múltiplo de %d", valorMaior, valorMenor);
}
else {
   System.out.printf("O número %d não é múltiplo de %d", valorMaior, valorMenor);
}

input.close();
}

}
