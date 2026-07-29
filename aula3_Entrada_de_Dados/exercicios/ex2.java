package aula3_Entrada_de_Dados.exercicios;

import java.util.Scanner;

public class ex2 {

   public static void main(String[] args) {
      /*
      Faça a entrada de dados do seu nome completo com variáveis diferentes para
      cada nome e depois a saída com as variáveis atribuidas
      */
      String nome1, nome2, nome3;

      Scanner entrada = new Scanner(System.in, "UTF-8");

      System.out.print("Digite seu nome: ");
      System.out.print("\n   ");
      nome1 = entrada.next();

      System.out.print("Digite seu primeiro sobrenome: ");
      System.out.print("\n   ");
      nome2 = entrada.next();

      System.out.print("Digite seu segundo sobrenome: ");
      System.out.print("\n   ");
      nome3 = entrada.next();

      entrada.close();

      System.out.printf("Seu nome é -> %s %s %s", nome1, nome2, nome3);
   }

}
