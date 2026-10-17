package aula16_Interfaces.exercicios.ex4;

public class Funcionario implements Comparable<Funcionario> {
   private String nome;
   private Double salario;

   public Funcionario(String nome, Double salario) {
      this.nome = nome;
      this.salario = salario;
   }

   @Override 
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(String.format("Nome: %s", nome));
      sb.append(String.format("\nSalário: R$%.2f", salario));

      return sb.toString();
   }

   @Override 
   public int compareTo(Funcionario proximo) {
      return salario.compareTo(proximo.getSalario());
   }

   public String getNome() {
      return nome;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public Double getSalario() {
      return salario;
   }
   public void setSalario(Double salario) {
      this.salario = salario;
   } 

   
}
