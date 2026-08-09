package aula7_funcoes.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
/*
Crie um método chamado dobrar() que receba um int e retorne o dobro desse número.
No main():
   Crie uma variável numero.
   Passe numero para dobrar().
   Faça a própria variável numero receber o resultado.
   Mostre o novo valor.
*/
public static void main(String[] args) {
   Locale.setDefault(Locale.US);

   double numero, numeroInput;

   Scanner input = new Scanner(System.in);
   input.useLocale(Locale.US);

   System.out.printf("Digite um número: ");
   numeroInput = input.nextDouble();
   input.nextLine();

   numero = dobrar(numeroInput);

   System.out.printf("%.2f x 2 = %.2f", numeroInput, numero);

   input.close();

}

public static double dobrar (double a) {
   return 2 * a;
}

}
