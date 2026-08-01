package aula3_Entrada_de_Dados.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {
   public static void main(String[] args) {
   /*
   Peça ao usuário:
      Nome do produto
      Quantidade
      Preço unitário
   Depois mostre:
      Produto: 
      Quantidade: 
      Preço: 
   */ 
  Locale.setDefault(Locale.US);

   String nome;
   int qntd;
   double preco, total;

   Scanner entrada = new Scanner(System.in);
   entrada.useLocale(Locale.US);

   System.out.printf("Digite o nome do produto: ");
   nome = entrada.nextLine();

   System.out.printf("Digite sua quantidade: ");
   qntd = entrada.nextInt();
   entrada.nextLine();

   System.out.printf("Digite o preço unitário: ");
   preco = entrada.nextDouble();
   entrada.nextLine();

   total = qntd * preco;

   System.out.printf("Produto: %s", nome);
   System.out.printf("\nQuantidade: %d", qntd);
   System.out.printf("\nPreço: %.2f", preco);
   System.out.printf("\nTotal: R$ %.2f", total);

   entrada.close();




   }
}
