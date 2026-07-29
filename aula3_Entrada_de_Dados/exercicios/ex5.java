package aula3_Entrada_de_Dados.exercicios;

import java.util.Scanner;

public class ex5 {
   public static void main(String[] args) {
/*
Crie um programa que peça:

Nome do funcionário
Número de identificação
Anos de experiência

Depois mostre uma frase como:
O funcionário Igor possui o registro 4589 e tem 8 anos de experiência profissional.
*/ 

   String nome;
   int nIdent, xp;

   Scanner entrada = new Scanner(System.in);

   System.out.print("Digite o nome do funcionário:");
   System.out.print("\n    ");
   nome = entrada.nextLine();

   System.out.print("Digite o número de identificação:");
   System.out.print("\n    ");
   nIdent = entrada.nextInt();

   System.out.print("Digite seu tem de experiência em anos:");
   System.out.print("\n    ");
   xp = entrada.nextInt();

   entrada.close();

   System.out.printf("O funcionário %s possui o registro %d e tem %d anos de experiência profissional.", nome, nIdent, xp);
   

   }
}
