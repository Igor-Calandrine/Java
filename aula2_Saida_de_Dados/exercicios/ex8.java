package aula2_Saida_de_Dados.exercicios;

public class ex8 {
   public static void main(String[] args) {
   /*
   A altura deve possuir 3 casas decimais.
   Imprima:
   {nome} possui {idade} anos e mede {altura} metros.
   Requisito: a altura deve aparecer com 1 casa decimal.
   */ 

   String nome = "Igor Guimarães";
   int idade = 25;
   float altura = (float) 1.652;

   System.out.printf("%s possui %d anos e mede %.1f metros", nome, idade, altura);
   }
}
