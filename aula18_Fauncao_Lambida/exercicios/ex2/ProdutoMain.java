package aula18_Fauncao_Lambida.exercicios.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

public class ProdutoMain {
public static void main(String[] args) {

Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);
String path = "aula18_Fauncao_Lambida\\exercicios\\ex2\\produtos.txt";
List<Produto> listaProdutos = new ArrayList<>();
int escolha = 0;

   
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
   String linha = br.readLine();

   while (linha != null) {
      String dados[] = linha.split("[ \\t]{1,}");
      
      String nome = dados[0].trim();
      Double preco = Double.parseDouble(dados[1].trim());
      int quantidade = Integer.parseInt(dados[2].trim());

      Produto produto = new Produto(nome, preco, quantidade);
      listaProdutos.add(produto);

      linha = br.readLine();
   }
} catch (IOException e) {
   e.getStackTrace();
}



do {
   System.out.println("===Menu Produtos===");
   System.out.println("1.Filtrar por Preço Maiores");
   System.out.println("2.Filtrar por Preço Menores");
   System.out.println("3.Filtrar por Quantidade");
   System.out.println("4. Produtos em Ordem Alfabética");
   System.out.println("5. Produtos em Ordem Preço");
   System.out.println("6. Produtos em Ordem Quantidade");
   System.out.println("7.Sair");
   escolha = input.nextInt();
   input.nextLine();

   switch (escolha) {
      case 1:{
         limparTela();
         System.out.println("Digite o valor do filtro");
         double valor = input.nextDouble();
         input.nextLine();

         Predicate<Produto> maiores = e -> e.getPreco() >= valor;
         
         for (Produto e : listaProdutos) {
            if(maiores.test(e)) {
               System.out.println(e);
            }
         }

         System.out.printf("\n\nPressione uma tecla para voltar ao menu anterior");
         input.nextLine();
         limparTela();
         break;}

      case 2:{
         limparTela();
         System.out.println("Digite o valor do filtro");
         double valor = input.nextDouble();
         input.nextLine();

         Predicate<Produto> menores = e -> e.getPreco() <= valor;
         
         for (Produto e : listaProdutos) {
            if(menores.test(e)) {
               System.out.println(e);
            }
         }

         System.out.printf("\n\nPressione uma tecla para voltar ao menu anterior");
         input.nextLine();
         limparTela();
         break;}

      case 3:{
         limparTela();
         System.out.println("Digite o valor do filtro");
         double valor = input.nextInt();
         input.nextLine();

         Predicate<Produto> maiores = e -> e.getQuantidade() >= valor;
         
         for (Produto e : listaProdutos) {
            if(maiores.test(e)) {
               System.out.println(e);
            }
         }

         System.out.printf("\n\nPressione uma tecla para voltar ao menu anterior");
         input.nextLine();
         limparTela();
         break;}

      case 4:{
         limparTela();
         Comparator<Produto> ordem = Comparator.comparing(Produto::getNome, String.CASE_INSENSITIVE_ORDER);
         listaProdutos.sort(ordem);
         
         for (Produto e : listaProdutos) {
            System.out.println(e);
         }

         System.out.printf("\n\nPressione uma tecla para voltar ao menu anterior");
         input.nextLine();
         limparTela();
         break;}

      case 5:{
         limparTela();
         Comparator<Produto> ordem = Comparator.comparing(Produto::getPreco);
         listaProdutos.sort(ordem);
         
         for (Produto e : listaProdutos) {
            System.out.println(e);
         }

         System.out.printf("\n\nPressione uma tecla para voltar ao menu anterior");
         input.nextLine();
         limparTela();
         break;}

      case 6:{
         limparTela();
         Comparator<Produto> ordem = Comparator.comparing(Produto::getQuantidade);
         listaProdutos.sort(ordem);
         
         for (Produto e : listaProdutos) {
            System.out.println(e);
         }

         System.out.printf("\n\nPressione uma tecla para voltar ao menu anterior");
         input.nextLine();
         limparTela();
         break;}

      case 7:
         limparTela();
         System.out.println("Finalizando o programa");

         System.out.printf("\n\nPressione uma tecla para voltar ao menu anterior");
         input.nextLine();
         limparTela();
         break;

      default:
         limparTela();
         System.out.println("Opção inválida");

         System.out.printf("\n\nPressione uma tecla para voltar ao menu anterior");
         input.nextLine();
         limparTela();
         break;
   }

} while (escolha != 7);

input.close();
}

public static void limparTela() {
   System.out.print("\033[H\033[2J");
   System.out.flush();
}
}
