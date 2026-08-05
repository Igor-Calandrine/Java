package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex9 {
/*
Peça ao usuário quantos números deseja informar.
Utilize um for para ler todos eles.
Ao final, informe:
   Quantos números positivos foram digitados.
   Quantos números negativos foram digitados.
   Quantos zeros foram digitados.
*/ 
public static void main(String[] args) {

Locale.setDefault(Locale.US);

int numeroQnt = 0;
int numeroPosit = 0; 
int numeroNegat = 0; 
int numeroZero = 0; 
int i;
double numero;

Scanner input = new Scanner(System.in);

System.out.printf("Digite a quantidade de números para serem avaliado: ");
numeroQnt = input.nextInt();
input.nextLine();

for (i = 0; i < numeroQnt; i++) {
   System.out.printf("\nDigite o número: ");
   numero = input.nextDouble();
   input.nextLine();

   if (numero < 0) {
      numeroNegat += 1;
   }
   else if (numero > 0) {
      numeroPosit += 1;
   }
   else if (numero == 0) {
      numeroZero += 1;
   }

}

System.out.printf("\nNúmeros Negativos: %d", numeroNegat);
System.out.printf("\nNúmeros Positivos: %d", numeroPosit);
System.out.printf("\nNúmeros Zeros: %d", numeroZero);

input.close();
}
}
