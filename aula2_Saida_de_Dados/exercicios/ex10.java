package aula2_Saida_de_Dados.exercicios;

import java.util.Locale;

public class ex10 {
   public static void main(String[] args) {
   /*
   Todos os float devem possuir 4 casas decimais.
   Exiba exatamente:

   Nome: {nome}
   Idade: {idade} anos
   Altura: {altura} m
   Peso: {peso} kg
   Nota Final: {nota}
   */
  
   String nome = "Júlia Hannana";
   int idade = 90;
   float altura = (float) 1.2045;
   float peso = (float) 39.3456;
   float nota = 90.6543f;

   Locale.setDefault(Locale.US);

   System.out.printf("Nome: %s", nome);
   System.out.printf("\nIdade: %d", idade);
   System.out.printf("\nAltura: %.2f", altura);
   System.out.printf("\nPeso: %.1f", peso);
   System.out.printf("\nNota Final: %.1f", nota);
   }
}
