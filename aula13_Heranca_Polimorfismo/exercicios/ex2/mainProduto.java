package aula13_Heranca_Polimorfismo.exercicios.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import aula13_Heranca_Polimorfismo.exercicios.ex2.entidades.Produto;
import aula13_Heranca_Polimorfismo.exercicios.ex2.entidades.ProdutoImportado;
import aula13_Heranca_Polimorfismo.exercicios.ex2.entidades.ProdutoUsado;

public class mainProduto {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);
List<Produto> listaProduto = new ArrayList<>();

int opcao;   

do {
   limparTerminal();
   System.out.printf("===Cadastro de Produtos===");
   System.out.printf("\n1.Produto Novo");
   System.out.printf("\n2.Produto Importado");
   System.out.printf("\n3.Produto Usado");
   System.out.printf("\n4.Encerrar programa");
   System.out.printf("\nOpção: ");
   opcao = input.nextInt();
   input.nextLine();

   switch (opcao) {
      case 1: {
         System.out.printf("Nome: ");
         String nome = input.nextLine();
         System.out.printf("Preço: R$");
         Double preco = input.nextDouble();
         input.nextLine();
         Produto produto = new Produto(nome, preco);
         listaProduto.add(produto);
         break;
      }   
      case 2: {
         System.out.printf("Nome: ");
         String nome = input.nextLine();
         System.out.printf("Preço: R$");
         Double preco = input.nextDouble();
         input.nextLine();
         System.out.printf("Taxa Alfandegária: ");
         Double taxaAlfandegaria = input.nextDouble();
         input.nextLine();
         Produto produto = new ProdutoImportado(nome, preco, taxaAlfandegaria);
         listaProduto.add(produto);
         break;
      }
      case 3: {
         System.out.printf("Nome: ");
         String nome = input.nextLine();
         System.out.printf("Preço: R$");
         Double preco = input.nextDouble();
         input.nextLine();
         System.out.printf("Data de Fabricação (dd/mm/yyyy): ");
         String dataFabricacao = input.nextLine();

         // Formatação de String para LocalDate
         DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate dataFormat = LocalDate.parse(dataFabricacao, format);

         Produto produto = new ProdutoUsado(nome, preco, dataFormat);
         listaProduto.add(produto);
         break;
      }
      case 4:
         System.out.printf("Encerrando o programa");
         break;
      
      default:
         System.out.printf("\n==Opção Inválida==");
         break;
   }

} while (opcao != 4);

limparTerminal();
for (Produto e: listaProduto) {
   System.out.printf("%s", e.produtoString());
   System.out.printf("\n");
}



input.close();
}
public static void limparTerminal() {
   System.out.print("\033[H\033[2J");
   System.out.flush();
} 
}
