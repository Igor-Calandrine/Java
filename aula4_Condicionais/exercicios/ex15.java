package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex15 {
public static void main(String[] args) {
/*
Uma loja oferece descontos de acordo com a categoria do cliente.
Utilize switch para determinar o percentual de desconto.
Depois calcule e exiba:
   Valor da compra.
   Percentual de desconto.
   Valor do desconto.
   Valor final a pagar.
*/
Locale.setDefault(Locale.US);

double compraValor, descontoValor, finalValor;
int clienteCategoria;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite o valor da compra: R$ ");
compraValor = input.nextDouble();
input.nextLine();

System.out.printf("Digite a Categoria do cliente de 1 a 4: ");
clienteCategoria = input.nextInt();
input.nextLine();

switch (clienteCategoria) {
   case 1:
      descontoValor = compraValor * 0.05;
      finalValor = compraValor - (compraValor * 0.05);
      System.out.printf("Valor da compra: R$ %.2f", compraValor);
      System.out.printf("\nPercentual de desconto: 5%%");
      System.out.printf("\nValor do desconto: R$ %.2f", descontoValor);
      System.out.printf("\nValor final a pagar: R$ %.2f", finalValor);
      break;
   case 2:
      descontoValor = compraValor * 0.10;
      finalValor = compraValor - (compraValor * 0.10);
      System.out.printf("Valor da compra: R$ %.2f", compraValor);
      System.out.printf("\nPercentual de desconto: 5%%");
      System.out.printf("\nValor do desconto: R$ %.2f", descontoValor);
      System.out.printf("\nValor final a pagar: R$ %.2f", finalValor);
      break;
   case 3:
      descontoValor = compraValor * 0.15;
      finalValor = compraValor - (compraValor * 0.15);
      System.out.printf("Valor da compra: R$ %.2f", compraValor);
      System.out.printf("\nPercentual de desconto: 5%%");
      System.out.printf("\nValor do desconto: R$ %.2f", descontoValor);
      System.out.printf("\nValor final a pagar: R$ %.2f", finalValor);
      break;
   case 4:
      descontoValor = compraValor * 0.20;
      finalValor = compraValor - (compraValor * 0.20);
      System.out.printf("Valor da compra: R$ %.2f", compraValor);
      System.out.printf("\nPercentual de desconto: 5%%");
      System.out.printf("\nValor do desconto: R$ %.2f", descontoValor);
      System.out.printf("\nValor final a pagar: R$ %.2f", finalValor);
      break;
   default:
      System.out.printf("Categoria de cliente inexistente");
      break;
}

input.close();



}   
}
