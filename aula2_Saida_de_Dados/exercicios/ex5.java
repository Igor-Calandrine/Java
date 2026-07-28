package aula2_Saida_de_Dados.exercicios;

public class ex5 {
   public static void main(String[] args) {
   /*
   Utilizando apenas System.out.print(), produza exatamente esta saída:
   Nome: Igor
   Idade: 30
   Cidade: Belém
   Profissão: Desenvolvedor
   */ 

   String nome = "Igor Araújo";
   int idade = 30;
   String cidade = "Belém";
   String profissao = "Dsenvolvedor";

   System.out.print("Nome: " + nome);
   System.out.print("\nIdade: " + idade);
   System.out.print("\nCidade: " + cidade);
   System.out.print("\nProfissão: " + profissao);
   }
}
