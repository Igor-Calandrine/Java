package aula10_Vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

import aula10_Vetores.exercicios.classes.Quarto;

public class ex1p1 {
/*
A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos números 0 a 9. Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
*/
public static void main(String[] args) {
Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);
Quarto[] quartos = new Quarto[5];
String[] estudantes = new String[3];
int i; 

for (i=0; i<quartos.length; i++) {
   quartos[i] = new Quarto(1200); 
}

System.out.printf("Temos os seguintes quartos disponíveis");

for (i=0; i < quartos.length; i++) {
   if (quartos[i].getStatus() == true) {
      int n = i + 1;
      System.out.printf("\nQuarto %d - %d vagas", n, quartos[i].getVagas());
   }
}

System.out.printf("\nDeseja alugar um quarto (Y/N)? ");
String resposta = input.nextLine();
resposta = resposta.substring(0,1);

if(resposta.equalsIgnoreCase("Y")) {
   System.out.printf("\nEscolha um quarto para alugar: ");
   int quarto = input.nextInt();
   input.nextLine();
   quarto -= 1;

   if (quartos[quarto].getStatus() == true) {
      System.out.printf("\nInciando Operação");
   }
   else {
      System.out.printf("\nQuarto ocupado, escolha outro");
   }

   // Nome dos Estudantes
   System.out.printf("\nTemos 3 vagas por quarto");
   System.out.printf("\nDigite o nome dos estudantes para as vagas ");
   System.out.printf("\n   Estudante 1: ");
   estudantes[0] = input.nextLine();
   System.out.printf("   Estudante 2: ");
   estudantes[1] = input.nextLine();
   System.out.printf("   Estudante 3: ");
   estudantes[2] = input.nextLine();

   // Email
   System.out.printf("Digite um email válido para contato: ");
   String email = input.nextLine();

   //Aluguel Negociado
   System.out.printf("Aluguel negociado: R$ ");
   double aluguel = input.nextDouble();
   input.nextLine();

   quartos[quarto] = new Quarto(estudantes, email, aluguel, false);


   System.out.printf("\nQuarto: %d", quarto);
   System.out.printf("\nEstudantes: ");
   System.out.printf("\n%s", quartos[quarto].getNomes());
   System.out.printf("\nemail: %s", quartos[quarto].getEmail());
   System.out.printf("\nAluguel: R$ %.2f", quartos[quarto].getAluguel());
   System.out.printf("\nEstatus: %s", quartos[quarto].getStatus());
   }


   System.out.println("\n---Relatório---");
   for(i=0; i<quartos.length;i++) {
      int n = i + 1;
      System.out.printf("\n\nQuarto: %d", n);
      System.out.printf("\nEstudantes: ");
      System.out.printf("\n%s", quartos[i].getNomes());
      System.out.printf("\nAluguel: R$ %.2f", quartos[i].getAluguel());
      System.out.printf("\nemail: %s", quartos[i].getEmail());
      System.out.printf("\nEstatus: %s", quartos[i].getStatus());
   }


   input.close();

}
}


