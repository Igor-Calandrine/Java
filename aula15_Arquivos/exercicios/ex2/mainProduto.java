package aula15_Arquivos.exercicios.ex2;

import java.util.Locale;
import java.util.Scanner;

import aula15_Arquivos.exercicios.ex2.entidades.Produto;
import aula15_Arquivos.exercicios.ex2.entidades.Estoque;

public class mainProduto {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);

System.out.printf("===Menu Produtos===");
System.out.printf("\n1.Cadastrar Produto");
System.out.printf("\n2.Listar Produtos");
System.out.printf("\n3. Calcular Estoque");
System.out.printf("\n0. Sair");
System.out.printf("\nOpção: ");

int opcao = input.nextInt();
input.nextLine();

switch (opcao) {
   case 1: {
      System.out.printf("\nNome do Produto: ");
      String nome = input.nextLine();
      System.out.printf("Valor: R$");
      Double valor = input.nextDouble();
      input.nextLine();
      System.out.printf("Quantidade: ");
      Integer quantidade = input.nextInt();
      input.nextLine();
      Produto produto = new Produto(nome, valor, quantidade);
      produto.saveProduto();
      break;
   }

   case 2: {
      Estoque estoque = new Estoque();
      estoque.carregarEstoque();
      estoque.lerEstoque();
      break;
   }

   case 3: {
      Estoque estoque = new Estoque();
      System.out.printf("\n===Valor Total Estoque===");
      System.out.printf("\nR$: %.2f", estoque.valorEstoque());
      break;
   }

   case 0: {
      System.out.println("Fechando o programa");
      break;
   }

   default:
      System.out.println("Opção inválida");
      break;
}


input.close();
}
}
