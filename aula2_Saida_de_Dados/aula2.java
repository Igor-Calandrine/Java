package aula2_Saida_de_Dados;

public class aula2 {
   
   /*
   -Imprimindo dados
   Para criar uma saida, primeiramente devamos começar por

   *public static void main(String[] args) {
   
   *}

   Dentro dele podemos utilizar:
      
      *System.out.print()
         Para imprimir algo na mesma linha

      *System.out.println()
         Para imprimir algo na próxima linha

      *System.out.printf()
         Para imprimir algo na de forma formatada

   Para imprimir dados de diferentes tipos, juntar Strings, podemos utilizar concatenação. Ex:

      *System.out.println("Uma frase" + " " + "outra frase")

      *System.out.println("Uma frase" + variavel + "outra frase")

   -Imprimindo números flutuantes

      Devemos utilizar o estilo de formatação. Ex:
      %.2f -> indica a quantidade de casas decimais, no caso temos duas
      %n   -> indica uma quebra de linha caso seja desejado

      float numero = 3.3456789
      double numero

      Para imprimir apenas as duas primeiras casas

      *System.out.printf("Uma frase %.2f" + "outra frase.%n", numero)

      Para declarar os outros tipos, temos:
      %s -> Strings
      %d -> int

      No nossa caso, por termos uma máquina configura em português, temos uma saída com vírgula, para configurar uma saída com ponto devemos incluir a seguinte configuração

      *Locale.setDefault(Locale.US);

      E importar no início do programa:

      *import java.util.Locale;

      !Agora é praticar com muitos exercícios até ficar automático
   */ 
}
