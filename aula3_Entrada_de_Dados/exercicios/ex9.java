package aula3_Entrada_de_Dados.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex9 {
public static void main(String[] args) {
/*
Peça ao usuário:
   Nome do funcionário
   Quantidade de horas trabalhadas
   Valor da hora

Calcule: Salário (Horas × Valor da Hora)
Exiba:
   Funcionário: Maria
   Horas Trabalhadas: 40
   Valor da Hora: R$ 35.50
   Salário da Semana: R$ 1420.00
*/ 
Locale.setDefault(Locale.US);

String nome;
int hrTrabal;
float valTabal, salario;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite o nome do funcionário: ");
nome = input.nextLine();

System.out.printf("Digite a quantidade de horas trabalhada: ");
hrTrabal = input.nextInt();
input.nextLine();

System.out.printf("Digite o valor por hora trabalhada: ");
valTabal = input.nextFloat();
input.nextLine();

salario = hrTrabal * valTabal;

System.out.printf("Funcionário: %s", nome);
System.out.printf("\nHoras Trabalhadas: %d", hrTrabal);
System.out.printf("\nValor da hora: R$ %.2f", valTabal);
System.out.printf("\nSalário da Semana: R$ %.2f", salario);

input.close();



}
}
