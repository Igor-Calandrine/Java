package aula10_Vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex7p3 {
/*
Crie um programa Java que utilize uma matriz double[][] para armazenar as notas de 5 alunos, cada um com 4 notas.
*/ 
public static void main(String[] args) {

Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);


Double[][] notas = new Double[5][4];

for (int i = 0; i < notas.length; i++) {
   System.out.printf("\n\nDigite as notas do aluno %d", (i+1));
   for (int j = 0; j < notas[i].length; j++) {
      System.out.printf("\nDigite a nota %d - ", (j+1));
      double nota = input.nextDouble();
      input.nextLine();

      notas[i][j] = nota;
   }
}

for (int i = 0; i < notas.length; i++) {
   System.out.printf("\n\nNotas do aluno %d", (i+1));
   for (int j = 0; j < notas[i].length; j++) {
      System.out.printf("\nNota %d - %.1f",(j+1), notas[i][j]);
   }
}

  
   



input.close();
}
}