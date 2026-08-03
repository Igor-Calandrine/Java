package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex13 {
public static void main(String[] args) {
/*
Exiba o seguinte menu:
1 - Água
2 - Refrigerante
3 - Suco
4 - Café
5 - Chá
Leia a opção escolhida e informe qual bebida foi selecionada.
*/ 
Locale.setDefault(Locale.US);

int escolha;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Menu Bebidas");
System.out.printf("\n1 - Água");
System.out.printf("\n2 - Refrigerante");
System.out.printf("\n3 - Suco");
System.out.printf("\n4 - Café");
System.out.printf("\nQualquer outro número para sair do menu:");
System.out.printf("\n   ");

escolha = input.nextInt();
input.nextLine();

switch (escolha) {
   case 1:
      System.out.printf("Água");
      break;
   case 2:
      System.out.printf("Refrigerante");
      break;
   case 3:
      System.out.printf("Suco");
      break;
   case 4:
      System.out.printf("Café");
      break;
   default:
      System.out.printf("Saindo do menu");
      break;
}

input.close();

}






}
