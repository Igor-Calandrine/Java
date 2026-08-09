package aula7_funcoes.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
/*
Crie um método chamado aumentarSalario() que receba:
o salário (float);
o percentual de aumento (float).
O método deve calcular e retornar o novo salário.
*/   

public static void main(String[] args) {
   Locale.setDefault(Locale.US);

   float salarioInicial, salarioFinal;

   Scanner input = new Scanner(System.in);
   input.useLocale(Locale.US);

   System.out.printf("Digite o salário: ");
   salarioInicial = input.nextFloat();

   float aumento = aumento(salarioInicial, input);
   salarioFinal = salarioInicial + aumento;

   float desconto = desconto(salarioFinal, input);
   salarioFinal = salarioFinal - desconto;
   
   System.out.printf("Salário: R$ %.2f", salarioInicial);
   System.out.printf("\nAumento Salarial: R$ %.2f", aumento);
   System.out.printf("\nDesconto Salarial INSS: R$ %.2f", desconto);
   System.out.printf("\nSalarial Total: R$ %.2f", salarioFinal);

   input.close();

}

public static float aumento(float a, Scanner b) {
   System.out.printf("Digite a porcentagem do aumento: ");
   float aumento = b.nextFloat();

   return a * (aumento/100);
}

public static float desconto(float a, Scanner b) {
   System.out.printf("Digite a porcentagem do INSS: ");
   float desconto = b.nextFloat();

   return a * (desconto/100);
}


}
