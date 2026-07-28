package aula2_Saida_de_Dados.exercicios;

import java.util.Locale;

public class ex7 {
   public static void main(String[] args) {
   /*
   O preço deve possuir 4 casas decimais.
   Imprima:
   Foram comprados {numero} {produto} por R$ {preço} cada.
   Requisito: o preço deve aparecer com 2 casas decimais.
   */ 
   
   String produto = "caderno";
   int numero = 4;
   double preco = 29.5432;

   Locale.setDefault(Locale.US);
   
   System.out.printf("Foram comprados %d %s por R$ %.2f cada.", numero, produto, preco);
   System.out.printf("\nO total da compra foi de R$ %.2f", numero * preco);
   }
}
