package aula3_Entrada_de_Dados.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
   public static void main(String[] args) {
   /*
   Peça ao usuário:
   Nome (String)
   Idade (int)
   Altura (float)
   Depois exiba exatamente neste formato: 
   Nome: Carlos
   Idade: 25 anos
   Altura: 1.78 m
   */ 

   String nome;
   int idade;
   float altura;

   Scanner entrada = new Scanner(System.in);
   entrada.useLocale(Locale.US);

   System.out.printf("Digite o seu nome: ");
   nome = entrada.nextLine();

   System.out.printf("Digite a sua idade: ");
   idade = entrada.nextInt();
   
   System.out.printf("Digite sua altura: ");
   altura = entrada.nextFloat();

   System.out.printf("Nome: %s", nome);
   System.out.printf("\nIdade: %d", idade);
   System.out.printf("\nAltura: ", altura);

   entrada.close();
   }
}
