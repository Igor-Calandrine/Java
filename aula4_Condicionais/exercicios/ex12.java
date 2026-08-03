package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex12 {
public static void main(String[] args) {
/*
Leia:
Dois números do tipo float;
Um caractere representando a operação (+, -, * ou /).
Utilize switch para realizar a operação escolhida.
Se a operação for divisão e o segundo número for zero, informe
Se a operação for inválida, informe
*/ 

Locale.setDefault(Locale.US);

double numero1, numero2, resultado;
String operador;

Scanner input = new Scanner(System.in);

System.out.printf("Digite um número: ");
numero1 = input.nextDouble();
input.nextLine();

System.out.printf("Digite uma as quatro operações matemáticas:");
System.out.printf("\n+    -    x    /");
System.out.printf("\n");

operador = input.nextLine();

System.out.printf("Digite outro número: ");
numero2 = input.nextDouble();
input.nextLine();

if (operador.equals("/")  && numero2 == 0) {
   System.out.printf("Não é possível dividir um número por 0");
}
else {
   switch (operador) {
      case "+":
         resultado = numero1 + numero2;
         System.out.printf("%.2f %s %.2f = %.2f", numero1, operador, numero2, resultado );
         break;
      case "-":
         resultado = numero1 - numero2;
         System.out.printf("%.2f %s %.2f = %.2f", numero1, operador, numero2, resultado );
         break;
      case "x":
         resultado = numero1 * numero2;
         System.out.printf("%.2f %s %.2f = %.2f", numero1, operador, numero2, resultado );
         break;
      case "/":
         resultado = numero1 / numero2;
         System.out.printf("%.2f %s %.2f = %.2f", numero1, operador, numero2, resultado );
         break;
      default:
         System.out.printf("Não é possível realizar essa operação");
         break;
   }
}

input.close();


}
}
