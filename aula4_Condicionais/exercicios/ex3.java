package aula4_Condicionais.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
public static void main(String[] args) {
/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
*/ 
int horaInicial, horaFinal, horaTotal;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

System.out.printf("Digite o horário do início da partida: ");
horaInicial = input.nextInt();
input.nextLine();

System.out.printf("Digite o horário do fim da partida: ");
horaFinal = input.nextInt();
input.nextLine();

if (horaFinal > horaInicial) {
   horaTotal = horaFinal - horaInicial;
}
else {
   horaTotal = (24 - horaInicial) + horaFinal;
}

System.out.printf("O jogo durou %d horas", horaTotal);

input.close();
}
}
