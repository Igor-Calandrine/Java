package aula10_Vetores.exercicios;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ex6p2 {
/*
Crie um ArrayList<String> chamado produtos.
Adicionar 6 produtos, Exibir todos os produtos, Exibir o tamanho da lista, Verificar se "Arroz" está na lista, Descobrir a posição de "Feijão", Alterar o terceiro produto, Remover um produto, Exibir a lista final.
*/

public static void main(String[] args) {
Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);
int opcao;
String produto;

ArrayList<String> produtoLista = new ArrayList<>();

do {
   System.out.printf("\n===Menu===");
   System.out.printf("\n1. Adicionar produto");
   System.out.printf("\n2. Remover produto");
   System.out.printf("\n3. Alterar produto");
   System.out.printf("\n4. Verificar produto");
   System.out.printf("\n5. Procurar produto");
   System.out.printf("\n6. Listar dados");
   System.out.printf("\n7. Ordenar dados");
   System.out.printf("\n8. Encerrar Programa");
   System.out.printf("\nOpção: ");
   opcao = input.nextInt();
   input.nextLine();
   
   
   switch (opcao) {
      case 1:
         System.out.printf("\nDigite o nome do produto:  ");
         produto = input.nextLine();
         produtoLista.add(produto);
         break;
   
      case 2: 
         System.out.printf("\nDigite o nome do produto: ");
         produto = input.nextLine();
         
         if (produtoLista.contains(produto)) {
            produtoLista.remove(produto);
         } 
         else {
            System.out.printf("\nProduto não encontrado");
         }
         break;
   
      case 3:
         System.out.printf("\nDigite o nome do produto: ");
         produto = input.nextLine();
         int posicao = produtoLista.indexOf(produto);
   
         if (posicao >= 0) {
            System.out.printf("\nProduto encontrado");
            System.out.printf("\nDigite o novo nome do produto: ");
            String novoNome = input.nextLine();
   
            produtoLista.set(posicao, novoNome);
         }
         else {
            System.out.printf("\nProduto não encontrado");
         }
         break;
   
      case 4:
         System.out.printf("\nDigite o nome do produto: ");
         produto = input.nextLine();
   
         if (produtoLista.contains(produto)) {
            System.out.printf("\nProduto encontrado");
         }
         else {
            System.out.printf("\nProduto não encontrado");
         }
         break;
   
      case 5: 
         System.out.printf("\nDigite o nome do produto: ");
         produto = input.nextLine();
   
         if (produtoLista.indexOf(produto) >= 0) {
            System.out.printf("\nProduto na posição %d", produtoLista.indexOf(produto));
         }
         else {
            System.out.printf("\nProduto não encontrado");
         }
         break;

      case 6: 
         System.out.printf("Produtos: %d", produtoLista.size());

         if (produtoLista.size() > 0) {
            System.out.println("");
            for (String e : produtoLista) {
               System.out.println(e);
            }
         }
         else {
            System.out.println("Não há produtos listados no momento");
         }
         break;

         case 7: 
         produtoLista.sort((a,b) -> a.compareToIgnoreCase(b));
         
         System.out.println("");
         for(String e : produtoLista) {
            System.out.println(e);
         }
         break;
         
         case 8:
            System.out.println("Encerrando o programa");
            break;

      default:
         System.out.println("Opção inválida");
         break;
   }

} while (opcao != 8);

input.close();
}

}
