package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {
public static void main(String[] args) {
/*
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
0 - 2000.00        -  Isento
2000.01 - 3000.00  -  8%
3000.01 - 4500.00  -  18%
acima de 4500.00   -  28%
Se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00
+ 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. 
*/ 
Locale.setDefault(Locale.US);

double salario, impostoRenda;
double impostoC = 0.08f;
double impostoB = 0.18f;
double impostoA = 0.28f;

Scanner entrada = new Scanner(System.in);
entrada.useLocale(Locale.US);

System.out.printf("Digite o salário para calcular o Imposto de Renda:");
System.out.printf("\n\tR$ ");

salario = entrada.nextFloat();
entrada.nextLine();

if (salario <= 2000.00) {
   System.out.printf("Isento do Imposto de Renda");
}
else if (2000.01 <= salario && salario <= 3000) {
   impostoRenda = (salario - 2000) * impostoC;
   System.out.printf("Imposto de Renda: %.2f", impostoRenda);
}
else if (3000.01 < salario && salario <= 4500.00) {
   impostoRenda = (1000 * impostoC) + (salario - 3000.01) * impostoB;
   System.out.printf("Seu imposto de Renda é de R$ %.2f", impostoRenda);
   
}
else if (4500.01 <= salario) {
   impostoRenda = (1000 * impostoC) + (1500 * impostoB) + (salario - 4500) * impostoA;
   System.out.printf("Seu imposto de Renda é de R$ %.2f", impostoRenda);
}

entrada.close();
}
}
