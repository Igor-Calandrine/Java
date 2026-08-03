package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
public static void main(String[] args) {
/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/ 
Locale.setDefault(Locale.US);

float numero;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite um número de 0 a 100: ");
numero = input.nextFloat();

if (0 <= numero && numero < 25) {
   System.out.printf("O número %.2f esta no intervalo de [0, 25[", numero);
}
else if (25 <= numero && numero < 50) {
   System.out.printf("O número %.2f esta no intervalo de [25, 50[", numero);
}
else if (50 <= numero && numero < 75){
   System.out.printf("O número %.2f esta no intervalo de [50, 75[", numero);
}
else if (75 <= numero && numero < 100){
   System.out.printf("O número %.2f esta no intervalo de [75, 100]", numero);
}

input.close();

}
}
