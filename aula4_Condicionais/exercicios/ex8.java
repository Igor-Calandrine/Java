package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
public static void main(String[] args) {
/*
Escreva um programa que pergunte a distância que um passageiro deseja percorrer em km. 
Calcule o preço da passagem, cobrando R$ 0,50 por km para viagens de até de 200 km, e R$ 0,45 para viagens mais longas.
*/ 
Locale.setDefault(Locale.US);

double distancia, precoFinal;
double precoA = 0.5; 
double precoB = 0.45; 
int viagemA = 200;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite a distância que deseja percorrer em Km dutante a viagem: ");
distancia = input.nextDouble();
input.nextLine();

if (distancia <= viagemA) {
   precoFinal = distancia * precoA;
   System.out.printf("O valor da viagem de %.2f Km é de R$%.2f", distancia, precoFinal);
}
else {
   precoFinal = distancia * precoB;
   System.out.printf("O valor da viagem de %.2f Km é de R$%.2f", distancia, precoFinal);
}

input.close();

}
}
