package aula3_Entrada_de_Dados.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
public static void main(String[] args) {
/*
Peça ao usuário:
   Nome do aluno
   Nota 1
   Nota 2
Calcule: Média
Exiba:
   Aluno:
   Nota 1:
   Nota 2:
   Média:
*/
Locale.setDefault(Locale.US);

String nome;
float nota1, nota2, media;

Scanner entrada = new Scanner(System.in);
entrada.useLocale(Locale.US);

System.out.printf("Digite o nome do aluno: ");
nome = entrada.nextLine();

System.out.printf("Digite a Nota 1: ");
nota1 = entrada.nextFloat();
entrada.nextLine();

System.out.printf("Digite a Nota 2: ");
nota2 = entrada.nextFloat();
entrada.nextLine();

media = (nota1 + nota2) / 2;

System.out.printf("\nAluno: %s ", nome);
System.out.printf("\nNota 1: %.2f", nota1);
System.out.printf("\nNota 2: %.2f", nota2);
System.out.printf("\nMédia: %.2f", media);

entrada.close();
}
}
