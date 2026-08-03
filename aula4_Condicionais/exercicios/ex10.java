package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex10 {
public static void main(String[] args) {
/*
Escreva um programa que pergunte a velocidade do carro de um usuário. Caso ultrapasse 80 km/h, exiba uma mensagem dizendo que o usuário
foi multado. Nesse caso, exiba o valor da multa, cobrando R$ 5 por km acima de 80 km/h
*/ 
Locale.setDefault(Locale.US);

double velocVeiculo, multaTotal;
double multaKm = 5;
int velocLimite = 80;

Scanner input = new Scanner(System.in);

System.out.printf("Digite a velocidade do carro (km/h): ");
velocVeiculo = input.nextDouble();
input.nextLine();

if (velocVeiculo > velocLimite) {
   multaTotal = (Math.floor(velocVeiculo) - velocLimite) * multaKm;
   System.out.printf("Veículo acima da velocidade limite de %d Km/h", velocLimite);
   System.out.printf("\nVelocidade registrada: %.1f Km/h", velocVeiculo);
   System.out.printf("\nMulta: R$ %.2f", multaTotal);
}
else {
   System.out.printf("Veículo dentro do limite de velocidade");
   System.out.printf("\nVelocidade registrada: %.1f Km/h", velocVeiculo);
}

input.close();

}
}
