package aula8_POO.exercicios;

import java.util.Locale;
import java.util.Scanner;

import aula8_POO.exercicios.exClasses.Produto;

public class ex4 {
/*
1. Crie uma classe Produto
Ela deve possuir os seguintes atributos:
   nome, preco, quantidade
E os seguintes métodos:
   valorTotal, adicionarEstoque, removerEstoque
*/ 

public static void main(String[] args) {
   Locale.setDefault(Locale.US);

   Scanner input = new Scanner(System.in);
   input.useLocale(Locale.US);

   Produto batata = new Produto();

   System.out.printf("Digite o nome do produto: ");
   batata.nome = input.nextLine();

   System.out.printf("Digite o seu preço: R$ ");
   batata.preco = input.nextDouble();
   input.nextLine();

   System.out.printf("Digite a quantidade no estoque: ");
   batata.estoque = input.nextInt();
   input.nextLine();

   System.out.printf("\nNome: %s", batata.nome);
   System.out.printf("\nPreço: R$ %.2f", batata.preco);
   System.out.printf("\nEstoque: %d unidades", batata.estoque);
   System.out.printf("\nValor em Estoque: R$ %.2f ", batata.valorTotalEstoque());

   System.out.printf("\n" + "-".repeat(20));
   System.out.printf("\nSimulando uma compra");

   batata.quantidade = 0;
   System.out.printf("\nAdicionar unidades ao carrinho: ");
   int quantidade = input.nextInt();
   input.nextLine();
   batata.validarCompra(quantidade);
   batata.adicionarCompra(quantidade);
   double compraTotal = batata.valorTotalCompra();
   batata.removerEstoque(quantidade);

   System.out.printf("\nNome: %s", batata.nome);
   System.out.printf("\nPreço: R$ %.2f", batata.preco);
   System.out.printf("\nUnidades: %d", batata.quantidade);
   System.out.printf("\nValor Total: R$ %.2f", compraTotal);
   System.out.printf("\nEstoque: %d unidades", batata.estoque);
   System.out.printf("\nValor em Estoque: R$ %.2f ", batata.valorTotalEstoque());



   








   input.close();
}
}
