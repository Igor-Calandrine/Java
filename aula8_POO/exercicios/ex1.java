package aula8_POO.exercicios;

import java.util.Locale;
import java.util.Scanner;
import aula8_POO.exercicios.exClasses.Retangulo;

public class ex1 {
/*
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
*/ 
public static void main(String[] args) {

   Locale.setDefault(Locale.US);

   Retangulo retangulo = new Retangulo();
   Scanner input = new Scanner(System.in);
   input.useLocale(Locale.US);

   System.out.printf("Digite um lado do retângulo: ");
   retangulo.sideA = input.nextDouble();
   input.nextLine();

   System.out.printf("Digite outro lado do retângulo: ");
   retangulo.sideB = input.nextDouble();
   input.nextLine();

   System.out.printf("\nRetângulo: %.2f X %.2f", retangulo.sideA, retangulo.sideB);
   System.out.printf("\nÁrea: %.2f", retangulo.area());
   System.out.printf("\nPerímetro: %.2f", retangulo.perimeter());
   System.out.printf("\nDiagonal: %.2f", retangulo.diagonal());

   input.close();
}

}
