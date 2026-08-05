package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
/*
Faça um programa que pergunte quantas notas serão digitadas.
Depois, utilize um for para ler cada nota (float).
Para cada nota:
Se for maior ou igual a 7, mostre "Aprovado".
Caso contrário, mostre "Reprovado".
*/
public static void main(String[] args) {
   
Locale.setDefault(Locale.US);

int notalQnt, i;
float nota;

Scanner input = new Scanner(System.in);

System.out.printf("\nDigite a quantidade de notas a serem digitadas: ");
notalQnt = input.nextInt();
input.nextLine();



for (i = 0; i < notalQnt; i++) {
   System.out.printf("\nDigite a nota: ");
   nota = input.nextFloat();
   input.nextLine();

   String resultado = (nota > 7) ? "Aprovado" : "Reprovado";
   System.out.printf("%s", resultado);
}


input.close();

}

}
