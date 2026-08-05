package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/ 

Locale.setDefault(Locale.US);

int coordenadaX, coordenadaY;
String inputString = "";

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

while (true) {

   System.out.printf("\nDigite a Coordenada do Eixo X ");
   System.out.printf("\nOu digite nada para encerrar o programa: ");

   inputString = input.nextLine();
   if (inputString.equals("")) {
      System.out.printf("\nPrograma Ecerrado");
      break;
   }

   coordenadaX = Integer.parseInt(inputString);

   System.out.printf("\nDigite a Coordenada do Eixo Y");
   System.out.printf("\nOu digite nada para encerrar o programa: ");

   inputString = input.nextLine();
   if (inputString.equals("")) {
      System.out.printf("\nPrograma Ecerrado");
      break;
   }

   coordenadaY = Integer.parseInt(inputString);

   if (coordenadaX > 0 && coordenadaY > 0) {
      System.out.printf("\n1º Quadrante: (%d,%d)", coordenadaX, coordenadaY);
      System.out.printf("\n");
   }
   else if (coordenadaX < 0 && coordenadaY > 0) {
      System.out.printf("\n2º Quadrante: (%d,%d)", coordenadaX, coordenadaY);
      System.out.printf("\n");
   }
   else if (coordenadaX < 0 && coordenadaY < 0) {
      System.out.printf("\n3º Quadrante: (%d,%d)", coordenadaX, coordenadaY);
      System.out.printf("\n");
   }
   else if (coordenadaX > 0 && coordenadaY < 0) {
      System.out.printf("\n4º Quadrante: (%d,%d)", coordenadaX, coordenadaY);
      System.out.printf("\n");
   }

}

input.close();

}



}
