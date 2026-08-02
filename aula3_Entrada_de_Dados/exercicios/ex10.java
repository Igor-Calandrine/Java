package aula3_Entrada_de_Dados.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex10 {
public static void main(String[] args) {
/*
Crie um programa que solicite ao usuário:
   Nome do evento
   Quantidade de ingressos vendidos
   Valor de cada ingresso
Calcule o valor total arrecadado.
A saída deve ficar semelhante a:
   Evento: Show de Rock
   Ingressos Vendidos: 350
   Valor do Ingresso: R$ 120.00
   Arrecadação Total: R$ 42000.00
*/ 
Locale.setDefault(Locale.US);

String nomeEvento;
int ingressoQnt;
float ingressoValor, arrecadacao;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite o nome do evento: ");
nomeEvento = input.nextLine();

System.out.printf("Digite a quantidade de ingressos: ");
ingressoQnt = input.nextInt();
input.nextLine();

System.out.printf("Digite o valor do ingresso: R$ ");
ingressoValor = input.nextFloat();
input.nextLine();

arrecadacao = ingressoQnt * ingressoValor;

System.out.printf("Evento: %s", nomeEvento);
System.out.printf("\nIngressos Vendidos: %d", ingressoQnt);
System.out.printf("\nValor do Ingresso: R$ %.2f", ingressoValor);
System.out.printf("\nArrecadação Total: R$ %.2f", arrecadacao);

input.close();








}
}
