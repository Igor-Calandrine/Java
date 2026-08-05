package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
public static void main(String[] args) {
/*
Escreva um programa que pergunte o valor inicial de uma dívida e o juro mensal. Pergunte também o valor mensal que será pago. Imprima o número de meses para que a dívida seja paga, o total pago e o total de juros pago.
*/

Locale.setDefault(Locale.US);

double dividaInicial = 0;
double jurosMensal = 0;
int nMeses = 0;
double dividaTotal = 0;
double pagamentoMensal = 0;
double jurosTotal = 0;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

while (true) {

   System.out.printf("-".repeat(30));
   System.out.printf("\nDigite (0) zero para encerrar o programa ou,");
   System.out.printf("\nDigite o valor da dívida:");
   System.out.printf("\n   R$ ");
   dividaInicial = input.nextDouble();
   input.nextLine();

   if (dividaInicial == 0) {
      System.out.printf("\nPrograma encerrado.");
      break;
   }

   System.out.printf("\nDigite a quantidade de meses a ser dividida:");
   System.out.printf("\n   ");
   nMeses = input.nextInt();
   input.nextLine();

   System.out.printf("\nDigite o juros mensal:");
   System.out.printf("\n   ");
   jurosMensal = input.nextDouble();

   dividaTotal = dividaInicial + (dividaInicial * (jurosMensal/100) * nMeses);
   pagamentoMensal = dividaTotal / nMeses;
   jurosTotal = dividaTotal - dividaInicial;

   System.out.printf("-".repeat(30));
   System.out.printf("\nDivida Inicial: R$ %.2f", dividaInicial);
   System.out.printf("\nTaxa de Juros Mensal: %.2f%%", jurosMensal);
   System.out.printf("\nMeses: %d", nMeses);
   System.out.printf("\nDivida com Juros: R$ %.2f", dividaTotal);
   System.out.printf("\nPagamento Mensal: R$ %.2f", pagamentoMensal);
   System.out.printf("\nJuros total:  R$ %.2f\n", jurosTotal);

}

input.close();










}   
}
