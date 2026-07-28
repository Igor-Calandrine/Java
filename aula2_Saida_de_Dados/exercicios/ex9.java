package aula2_Saida_de_Dados.exercicios;

import java.util.Locale;

public class ex9 {
   public static void main(String[] args) {
   /*
   O salário deve possuir 6 casas decimais.
   Imprima:
   {nome} trabalha como {função} e recebe R$ {salário} por mês.
   Requisito: o salário deve aparecer com 2 casas decimais.
   */ 

   String nome = "Ana";
   String funcao = "Analista";
   double salario = 3900.345678;

   Locale.setDefault(Locale.US);
   System.out.printf("%s trabalha com %s e recebe R$ %.2f por mês.", nome, funcao, salario);
   }
}
