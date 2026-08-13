package aula8_POO.exercicios;

import java.util.Locale;
import java.util.Scanner;
import aula8_POO.exercicios.exClasses.CurrencyConverter;

public class ex5 {
/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.
*/ 
public static void main(String[] args) {
   
Locale.setDefault(Locale.US);

int escolha;
double valor;

Scanner input = new Scanner(System.in);

do {
   System.out.printf("\n" + "-".repeat(30));
   System.out.printf("\nMenu Converter Moedas");
   System.out.printf("\n" + "-".repeat(30));
   System.out.printf("\n1 - Real  --> Dollar");
   System.out.printf("\n2 - Dollar --> Real");
   System.out.printf("\n3 - Compra de Dollar");
   System.out.printf("\n4 - Fechar o programa");
   System.out.printf("\n\tOpção: ");
   escolha = input.nextInt();

   switch (escolha) {
      case 1:
         System.out.printf("\nDigite o valor em Reais: R$ ");
         valor = input.nextDouble();
         double valorReal = CurrencyConverter.converterRealDollar(valor);

         System.out.printf("\nCotação do Dolar: $ %.2f", CurrencyConverter.DOLLAR);
         System.out.printf("\nR$ %.2f", valorReal);
         break;

      case 2:
         System.out.printf("\nDigite o valor em Dolar: $");
         valor = input.nextDouble();
         double valorDolar = CurrencyConverter.converterDollarReal(valor);

         System.out.printf("\nCotação do Dolar: $%.2f", CurrencyConverter.DOLLAR);
         System.out.printf("\n$ %.2f", valorDolar);
         break;

      case 3:
         System.out.printf("\nDigite o valor em Dolar: $");
         valor = input.nextDouble();
         double valorCompra = CurrencyConverter.converterDollarReal(valor);
         double valorIOF = CurrencyConverter.acrescimoIOF(valorCompra);
         double valorTotal = valorCompra + valorIOF;

         System.out.printf("\nCotação do Dolar: $%.2f", CurrencyConverter.DOLLAR);
         System.out.printf("\nReal + IOF:");
         System.out.printf("\nR$%.2f + R$%.2f = R$%.2f", valorCompra, valorIOF, valorTotal);
         break;
      
      case 4:
         System.out.printf("\n\nFechando o programa");
         break;

      default:
         System.out.printf("\n\nOpção inválida");
         break;
   }

} while (escolha != 4);

input.close();
}

}
