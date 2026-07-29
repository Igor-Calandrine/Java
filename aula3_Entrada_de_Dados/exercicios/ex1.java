package aula3_Entrada_de_Dados.exercicios;

import java.util.Scanner;

public class ex1 {
   public static void main(String[] args) {
      /*
      Faça a entrada de dados do seu nome e depois a saída com a variável atribuida
      */ 

      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite seu nome: ");
      String nome = entrada.next();

      System.out.printf("Seu nome é %s", nome);
      
      entrada.close();
   }

}