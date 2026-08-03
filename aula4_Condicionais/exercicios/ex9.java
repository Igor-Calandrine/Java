package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex9 {
public static void main(String[] args) {
/*
Escreva um programa para aprovar o empréstimo bancário para compra de uma casa. 
O programa deve perguntar o valor da casa a comprar, o salário e a quantidade de anos a pagar. O valor da prestação mensal não pode ser
superior a 30% do salário. 
Calcule o valor da prestação como sendo o valor da casa a comprar dividido pelo número de meses a pagar.
*/ 

Locale.setDefault(Locale.US);

double salario, prestacaoMensal, valorTotal;
int totalMeses, totalAnos;
boolean validar;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite o salário mensal: R$ ");
salario = input.nextDouble();
input.nextLine();

System.out.printf("Digite o valor da compra: R$");
valorTotal = input.nextDouble();
input.nextLine();

System.out.printf("Digite a quantidade de anos para pagar: ");
totalAnos = input.nextInt();
input.nextLine();

totalMeses = totalAnos * 12;
prestacaoMensal = valorTotal / totalMeses;

if (prestacaoMensal >= salario * 0.3) {
   validar = false;
}
else {
   validar = true;
}

if (validar == true) {
   System.out.printf("Sua compra foi aceita");
   System.out.printf("\nEsta divida em %d parcelas mensais de R$ %.2f", totalMeses, prestacaoMensal);
}
else {
   System.out.printf("Sua compra não foi aceita");
}

input.close();

}   
}
