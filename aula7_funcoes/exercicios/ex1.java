package aula7_funcoes.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
/*
Crie um método chamado somar() que receba dois números inteiros e retorne a soma deles.
No main():
Crie duas variáveis int.
Passe as duas para somar().
Armazene o resultado em uma terceira variável.
Mostre o resultado com printf().
*/ 

public static void main(String[] args) {
   Locale.setDefault(Locale.US);

   int num1;
   int num2;

   Scanner input = new Scanner(System.in);
   input.useLocale(Locale.US);

   System.out.printf("\nDigite um número: ");
   num1 = input.nextInt();
   input.nextLine();

   System.out.printf("\nDigite outro número: ");
   num2 = input.nextInt();
   input.nextLine();

   int soma = soma(num1, num2); 
   System.out.printf("%d + %d = %d", num1, num2, soma);

   input.close();

}

public static int soma(int a, int b) {
   int soma = a + b;
   return soma;
}

}
