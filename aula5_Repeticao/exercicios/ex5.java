package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
public static void main(String[] args) {
/*
Escreva um laço que peça ao usuário para fornecer uma série de ingredientes para uma pizza até que o valor 'quit' seja fornecido. 
À medida que cada ingrediente é especificado, apresente uma mensagem informando que você acrescentará esse ingrediente à pizza.
*/ 
Locale.setDefault(Locale.US);

int ingrediente;
String entradaUsuario;
String ingredienteList = "";
Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

while (true) {

   System.out.printf("\n--- Menu Ingredientes ---");
   System.out.printf("\n1 - Mussarela");
   System.out.printf("\n2 - Catupiry");
   System.out.printf("\n3 - Tomate");
   System.out.printf("\n4 - Azeitona");
   System.out.printf("\n");
   System.out.printf("\nEscolha um ingrediente para acrescentar ou,");
   System.out.printf("\n(q) quit para encerrar o menu:");
   System.out.printf("\n   ");

   entradaUsuario = input.nextLine();

   if (entradaUsuario.equals("q") || entradaUsuario.equals("Q")) {
      System.out.printf("Menu encerrado");
      break;
   }

   ingrediente = Integer.parseInt(entradaUsuario);
   
   switch (ingrediente) {
      case 1:
         ingredienteList = ingredienteList + "Mussarela ";
         System.out.printf("\nIngredientes:");
         System.out.printf("\n");
         break;
      case 2:
         ingredienteList = ingredienteList + "Catupiry ";
         break;
      case 3:
         ingredienteList = ingredienteList + "Tomate ";
         break;
      case 4:
         ingredienteList = ingredienteList + "Azeitona ";
         break;
      default:
         System.out.printf("Opção inválida");
         break;
   }

   System.out.printf("\nIngredientes: ");
   System.out.printf("\n%s\n", ingredienteList);
   System.out.printf("-".repeat(30));
   System.out.printf("\n");
}

input.close();


}
}
