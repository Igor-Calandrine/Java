package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
public static void main(String[] args) {
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar
CODIGO      PRODUTO     PREÇO
*/ 
Locale.setDefault(Locale.US);

double cachorroQuente = 4;
double xSalada = 4.5;
double xBacon = 5.3;
double torrada = 7.5;
double refri = 2.5;
int escolha, qntd;
double total;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("CÓDIGO     PRODUTO             PREÇO");
System.out.printf("\n1          Cachorro Quente     R$ %.2f", cachorroQuente);
System.out.printf("\n2          X-Salada            R$ %.2f", xSalada);
System.out.printf("\n3          X-Bacon             R$ %.2f", xBacon);
System.out.printf("\n4          Torrada             R$ %.2f", torrada);
System.out.printf("\n5          Refrigerante        R$ %.2f", refri);
System.out.printf("\nDigite qualquer outro número para fechar o menu");
System.out.printf("\nDigite o código do produto desejado: ");

escolha = input.nextInt();
input.nextLine();

if (escolha == 1) {
   System.out.printf("Digite a quantidade de produtos para a compra: ");
   qntd = input.nextInt();
   input.nextLine();

   total = cachorroQuente * qntd;
   System.out.printf("%d x Cachorro Quente = R$ %.2f", qntd, total);
}
else if (escolha == 2) {
   System.out.printf("Digite a quantidade de produtos para a compra: ");
   qntd = input.nextInt();
   input.nextLine();

   total = cachorroQuente * qntd;
   total = xSalada * qntd;
   System.out.printf("%d x X-Salada = R$ %.2f", qntd, total);
}
else if (escolha == 3) {
   System.out.printf("Digite a quantidade de produtos para a compra: ");
   qntd = input.nextInt();
   input.nextLine();

   total = xBacon * qntd;
   System.out.printf("%d x X-Bacon = R$ %.2f", qntd, total);
}
else if (escolha == 4) {
   System.out.printf("Digite a quantidade de produtos para a compra: ");
   qntd = input.nextInt();
   input.nextLine();

   total = torrada * qntd;
   System.out.printf("%d x Torrada = R$ %.2f", qntd, total);
}
else if (escolha == 5) {
   System.out.printf("Digite a quantidade de produtos para a compra: ");
   qntd = input.nextInt();
   input.nextLine();

   total = refri * qntd;
   System.out.printf("%d x Refrigerante  = R$ %.2f", qntd, total);
}
else {
   System.out.printf("Menu fechado");   
}

input.close();


}


}
