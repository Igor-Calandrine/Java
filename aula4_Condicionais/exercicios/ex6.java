package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
public static void main(String[] args) {
/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
*/
Locale.setDefault(Locale.US);

float x, y;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite o valor da coordenada X: ");
x = input.nextFloat();
input.nextLine();

System.out.printf("Digite o valor da coordenada Y: ");
y = input.nextFloat();
input.nextLine();

if (x == 0 && y == 0) {
   System.out.printf("O ponto (%.0f,%.0f) está na Origem dos Eixos", x, y);
}
else if (x > 0 && y > 0) {
   System.out.printf("O ponto (%.1f,%.1f) está no 1º Quadrante", x, y);
}
else if (x < 0 && y > 0) {
   System.out.printf("O ponto (%.1f,%.1f) está no 2º Quadrante", x, y);
}
else if (x < 0 && y < 0) {
   System.out.printf("O ponto (%.1f,%.1f) está no 3º Quadrante", x, y);
}
else if (x > 0 && y < 0) {
   System.out.printf("O ponto (%.1f,%.1f) está no 4º Quadrante", x, y);
}
else if (x != 0 && y == 0) {
   System.out.printf("O ponto (%.1f,%.0f) está no Eixo X", x, y);
}
else if (x == 0 && y != 0) {
   System.out.printf("O ponto (%.0f,%.1f) está no Eixo Y", x, y);
}

input.close();



}
}
