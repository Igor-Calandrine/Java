package aula10_Vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex8p3 {
/*
Crie uma matriz para representar as vendas de 4 produtos durante 5 dias
O programa deve calcular, Total vendido por produto, Total vendido em cada dia, Total geral de vendas, Descobrir qual produto vendeu mais no período inteiro
Encontre a maior venda individual registrada na matriz e mostre:
*Maior venda individual: R$ 850,00
*Produto: 3
*Dia: Quinta-feira
*/ 
public static void main(String[] args) {
Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);

double[][] vendas = new double[4][3];

for (int i = 0; i < vendas.length; i++) {
   System.out.printf("\n\nDigite o total da venda do produto %d", i+1);

   for(int j = 0; j < vendas[i].length; j++) {
      System.out.printf("\nDigite o valor total do dia %d: R$ ", j+1);
      double valor = input.nextDouble();
      input.nextLine();

      vendas[i][j] = valor;
   }
}

// Total por Produto
for (int i = 0; i < vendas.length; i++) {
   double total = 0;

   for (int j = 0; j < vendas[i].length; j++) {
      total += vendas[i][j];
   }

   System.out.printf("\nTotal da vendas do produto %d: R$ %.2f", i+1, total);
}

// Total Vendido por Dia
for (int j = 0; j < vendas[0].length; j++) {
   double total = 0;

   for (int i = 0; i < vendas.length; i++) {
      total += vendas[i][j];
   }

   System.out.printf("\nTotal da vendas Dia %d: R$ %.2f", j+1, total);
   total = 0;
}

// Total Geral de Vendas
double totalGeral = 0.0;
for (int i = 0; i < vendas.length; i++) {

   for (int j = 0; j < vendas[i].length; j++) {
      totalGeral += vendas[i][j];
   }

}
   System.out.printf("\nTotal da vendas Geral: R$ %.2f", totalGeral);

// Maior venda
double maiorVenda = 0;
int prdutoMaiorVenda = 0;
int diaMaiorVenda = 0;

for (int i = 0; i < vendas.length; i++) {

   for (int j = 0; j < vendas[i].length; j++) {
      
      if (vendas[i][j] > maiorVenda) {
         maiorVenda = vendas[i][j];
         prdutoMaiorVenda = i;
         diaMaiorVenda = j;
      }
   }

}

// Dados de maior venda
System.out.printf("\n\n==Dados Maior Venda===\n");
System.out.printf("\nMaior venda individual: R$ %.2f", maiorVenda);
System.out.printf("\nProduto: %d", prdutoMaiorVenda+1);
System.out.printf("\nDia: %d", diaMaiorVenda+1);











input.close();   
}
}
