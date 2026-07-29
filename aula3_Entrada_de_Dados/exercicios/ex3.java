package aula3_Entrada_de_Dados.exercicios;

import java.util.Scanner;

public class ex3 {
   public static void main(String[] args) {
   /*
   Crie um programa que peça:
   Nome
   Sobrenome
   Idade
   Quantidade de disciplinas cursadas 

   Depois mostre uma frase como:
   O aluno Igor tem 25 anos e está cursando 6 disciplinas.
   */ 

   String nome, sobrenome;
   int idade, qnt_discip;

   Scanner entrada = new Scanner(System.in);
   
   System.out.print("Digite seu nome: ");
   nome = entrada.nextLine();

   System.out.print("Digite seu sobrenome: ");
   sobrenome = entrada.nextLine();

   System.out.print("Digite sua idade: ");
   idade = entrada.nextInt();
   entrada.nextLine();

   System.out.print("Digite disciplinas cursando: ");
   qnt_discip = entrada.nextInt();
   entrada.nextLine();

   entrada.close();

   System.out.printf("O aluno %s %s tem %d anos e está cursando %d disciplinas", nome, sobrenome, idade, qnt_discip);







   }
}
