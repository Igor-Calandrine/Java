package aula18_Fauncao_Lambida.exercicios.ex1;

import java.util.Comparator;

public class Funcionario {
   private String nome;
   private double salario;
   private int idade;

   public Funcionario(String nome, double salario, int idade) {
      this.nome = nome;
      this.salario = salario;
      this.idade = idade;
   }

   @Override 
   public String toString() {
      int espaco = 20;
      StringBuilder sb = new StringBuilder();


      sb.append("Nome: " + nome);
      sb.append(" ".repeat(espaco - ("Nome: " + nome).length()));
      sb.append("Salário: " + salario);
      sb.append(" ".repeat(espaco - ("Salário: " + salario).length()));
      sb.append("Idade: " + idade);

      return sb.toString();
   }

   public String getNome() {
      return nome;
   }

   public double getSalario() {
      return salario;
   }

   public int getIdade() {
      return idade;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setSalario(double salario) {
      this.salario = salario;
   }

   public void setIdade(int idade) {
      this.idade = idade;
   }

   
}
