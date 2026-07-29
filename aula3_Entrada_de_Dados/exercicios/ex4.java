package aula3_Entrada_de_Dados.exercicios;

import java.util.Scanner;

public class ex4 {
   public static void main(String[] args) {
   /*
   Crie um programa que peça:
   Nome do produto 
   Código do produto 
   Quantidade em estoque

   Depois mostre uma frase como:
   Produto: Teclado
   Código: 152
   Quantidade: 30
   */
  
   String produto, codigo;
   int qntProduto;

   Scanner entrada = new Scanner(System.in);

   System.out.print("Digite o nome do produto: ");
   produto = entrada.nextLine();

   System.out.print("Digite o código do produto: ");
   codigo = entrada.nextLine();

   System.out.print("Digite a quantidade: ");
   qntProduto = entrada.nextInt();
   entrada.nextLine();

   entrada.close();

   System.out.println("Produto: " + produto);
   System.out.println("Código: " + codigo);
   System.out.println("Quantidade: " + qntProduto);
   }
}
