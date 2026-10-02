package aula15_Arquivos.exercicios.ex1;

import java.util.Locale;
import java.util.Scanner;

import aula15_Arquivos.exercicios.ex1.Entidades.CadastroProduto;

public class mainProduto {
public static void main(String[] args) {
Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);

System.out.printf("\n===CADASTRO PRODUTO===");
System.out.printf("\nNome: ");
String nome = input.nextLine();
System.out.printf("Quantidade: ");
int quantidade = input.nextInt();
input.nextLine();
System.out.printf("Valor: R$");
Double valor = input.nextDouble();
input.nextLine();

CadastroProduto produto = new CadastroProduto(nome, quantidade, valor);

produto.salvarProduto();
produto.lerProduto();


input.close();
}
}
