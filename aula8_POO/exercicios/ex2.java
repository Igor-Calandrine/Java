package aula8_POO.exercicios;

import java.util.Locale;
import java.util.Scanner;
import aula8_POO.exercicios.exClasses.Funcionario;

public class ex2 {
/*
Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
*/

public static void main(String[] args) {
   Locale.setDefault(Locale.US);

   Scanner input = new Scanner(System.in);
   input.useLocale(Locale.US);

   Funcionario funcionarioA = new Funcionario();

   System.out.printf("\nDigite o nome do funcionário: ");
   funcionarioA.nome = input.nextLine();

   System.out.printf("\nDigite o salário do funcionário: ");
   funcionarioA.salario = input.nextDouble();
   input.nextLine();

   System.out.printf("\nDigite o imposto que será descontado: ");
   funcionarioA.imposto = input.nextDouble();
   input.nextLine();

   System.out.printf("\nDigite caso queira dar um aumento para o funcionário: ");
   funcionarioA.aumento = input.nextDouble();
   input.nextLine();

   System.out.printf("\nNome: %s", funcionarioA.nome);
   System.out.printf("\nSalário Bruto: R$ %.2f", funcionarioA.salario);
   System.out.printf("\nSalário Desconto: R$ %.2f", funcionarioA.salarioDescontos());

   if (funcionarioA.aumento > 0) {
      System.out.printf("\nSalaário Aumento: R$ %.2f", funcionarioA.salarioAumento());
   }

   input.close();



}
}
