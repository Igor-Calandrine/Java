package aula10_Vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

import aula10_Vetores.exercicios.classes.Pessoa;

public class ex4p1 {
/*
Fazer um programa para ler nome, idade, altura de N pessoas. Mostrar a altura média, a percentagem de pessoas com menos de 16 anos com seus nomes.
*/  
public static void main(String[] args) {

Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);

Pessoa[] pessoas = new Pessoa[5];
int i = 0;
String resposta = "";


do {
   System.out.printf("\nDigite o nome: ");
   String nome = input.nextLine();
   
   System.out.printf("Digite a idade: ");
   int idade = input.nextInt();
   input.nextLine();
   
   System.out.printf("Digite a altura: ");
   double altura = input.nextDouble();
   input.nextLine();
   
   pessoas[i] = new Pessoa(nome, idade, altura);
   i += 1;
   
   if (i < pessoas.length) {
      System.out.printf("Deseja cadastrar uma nova pessoa? (Y/N) ");
      resposta = input.nextLine().substring(0, 1);
   }

} while (i < pessoas.length && resposta.equalsIgnoreCase("y"));


System.out.printf("\n\n===DADOS PESSOAIS===\n");
for (i = 0; i < pessoas.length; i++) {
   if (pessoas[i] != null) {
   System.out.printf("\nNome: %s", pessoas[i].getNome());
   System.out.printf("\nIdade: %d", pessoas[i].getIdade());
   System.out.printf("\nAltura: %.2f", pessoas[i].getAltura());
   }

}

int individuos = 0;
double somaAltura = 0;
for (i = 0; i < pessoas.length; i++) {
   if (pessoas[i] != null) {
      somaAltura += pessoas[i].getAltura();
      individuos += 1;
   }
}

double mediaAltura = somaAltura/individuos;

double maiores16 = 0;

for (i = 0; i < pessoas.length; i++) {
   if (pessoas[i] != null && pessoas[i].getIdade() >= 16) {
         maiores16 += 1;
   }
}

double porcem16 = maiores16/individuos * 100;

System.out.printf("\n\n===DADOS GRUPOS===\n");
System.out.printf("\nMédia Altura: %.2f", mediaAltura);
System.out.printf("\nMaiores 16: %.2f%%", porcem16);

for (i = 0; i < individuos; i++) {
   if (pessoas[i] != null && pessoas[i].getIdade() >= 16) {
      System.out.printf("\n   %s", pessoas[i].getNome());
   }
}








input.close();
}





}
