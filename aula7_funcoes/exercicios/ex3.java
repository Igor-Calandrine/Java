package aula7_funcoes.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
/*
Crie um método chamado calcularMedia() que receba três números float e retorne a média deles.
No main():
   Digite a primeira nota:
   Digite a segunda nota:
   Digite a terceira nota:
*/ 

public static void main(String[] args) {

Locale.setDefault(Locale.US);
float nota1, nota2, nota3;

Scanner input = new Scanner(System.in);

System.out.printf("Digite a primeira nota: ");
nota1 = input.nextFloat();
System.out.printf("Digite a segunda nota: ");
nota2 = input.nextFloat();
System.out.printf("Digite a terceira nota: ");
nota3 = input.nextFloat();

float media = media(nota1, nota2, nota3);

System.out.printf("(%.2f + %.2f + %.2f) / 3 = %.2f", nota1, nota2, nota3, media);

input.close();
}

public static float media (float a, float b, float c) {
   return (a + b + c)/3;
}
}