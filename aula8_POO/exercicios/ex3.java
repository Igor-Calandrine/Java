package aula8_POO.exercicios;

import java.util.Locale;
import java.util.Scanner;

import aula8_POO.exercicios.exClasses.Aluno;

public class ex3 {
/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.
*/ 
public static void main(String[] args) {

Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

Aluno aluno1 = new Aluno();

System.out.printf("Digite o nome do aluno: ");
aluno1.nome = input.nextLine();

aluno1.notaValida = false;
while (aluno1.notaValida == false) {
   System.out.printf("Digite a nota1: ");
   Double nota = input.nextDouble();
   input.nextLine();
   aluno1.validarNotas1(nota);

   if (aluno1.notaValida == true) {
      aluno1.nota1 = nota;
   }
}

aluno1.notaValida = false;
while (aluno1.notaValida == false) {
   System.out.printf("Digite a nota2: ");
   Double nota = input.nextDouble();
   input.nextLine();
   aluno1.validarNotas23(nota);

   if (aluno1.notaValida == true) {
      aluno1.nota2 = nota;
   }
}

aluno1.notaValida = false;
while (aluno1.notaValida == false) {
   System.out.printf("Digite a nota3: ");
   Double nota = input.nextDouble();
   input.nextLine();
   aluno1.validarNotas23(nota);

   if (aluno1.notaValida == true) {
      aluno1.nota3 = nota;
   }
}

System.out.printf("\nNome: %s", aluno1.nome);
System.out.printf("\n\tNota 1ºBi: %.2f", aluno1.nota1);
System.out.printf("\n\tNota 2ºBi: %.2f", aluno1.nota2);
System.out.printf("\n\tNota 3ºBi: %.2f", aluno1.nota3);
System.out.printf("\n\nTotal: %.2f", aluno1.notaTotal());
System.out.printf("\nStatus: %s", aluno1.status());

input.close();
}

}
