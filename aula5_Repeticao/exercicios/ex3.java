package aula5_Repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
public static void main(String[] args) {
/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido 
(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
Caso o usuário informe um código inválido deve ser solicitado um novo código. No Fim, deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.
*/ 

Locale.setDefault(Locale.US);

int alcool = 0;
int gasolina = 0;
int diesel = 0;
int guestTotal = 0;
int choiceUser = 0;

Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

while (choiceUser != 4) {

   System.out.printf("\n---- Menu Preferências ----");
   System.out.printf("\n1 - Álcool");
   System.out.printf("\n2 - Gasolina");
   System.out.printf("\n3 - Diesel");
   System.out.printf("\n4 - Fim");
   System.out.printf("\n");
   System.out.printf("\nDigite de acordo com o menu acima sua preferência: ");

   choiceUser = input.nextInt();
   input.nextLine();

   switch (choiceUser) {
      case 1:
         alcool += 1;
         guestTotal += 1;
         break;
      case 2:
         gasolina += 1;
         guestTotal += 1;
         break;
      case 3:
         diesel += 1;
         guestTotal += 1;
         break;
      case 4:
         System.out.printf("\nMuito obrigado por participar");
         System.out.printf("\nTotal de Participantes: %d", guestTotal);
         System.out.printf("\nÁlcool: %d", alcool);
         System.out.printf("\nGasolina: %d", gasolina);
         System.out.printf("\nDiesel: %d", diesel);
         break;
      default:
         System.out.printf("\nEscolha inválida, tente novamente.");
         break;
   }
}

input.close();

}
}
