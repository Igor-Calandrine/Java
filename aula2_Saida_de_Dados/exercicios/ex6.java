package aula2_Saida_de_Dados.exercicios;

import java.util.Locale;

public class ex6 {
   public static void main(String[] args) {
   /*
   Atribua à nota um valor com 4 casas decimais.
   Imprima exatamente:
   O aluno {nome} obteve nota 9.9.
   */
   Locale.setDefault(Locale.US);

   String nome = "Igor Araújo";
   float nota = 9.8765f;

   System.out.printf("O aluno %s obteve nota %.1f", nome, nota);
   }
}
