package aula10_Vetores.exercicios.classes;

public class Empregado {
   private final int ID_EMPREGADO;
   private String nome;
   private double salario; 
   
   public Empregado(int ID_EMPREGADO, String nome, double salario) {
      this.ID_EMPREGADO = ID_EMPREGADO;
      this.nome = nome;
      this.salario = salario;
   }

   public int getID_EMPREGADO() {
      return ID_EMPREGADO;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public double getSalario() {
      return salario;
   }

   public void aumentoSalario(double aumento) {
      salario = (aumento/100 * salario) + salario;
   }

   @Override
   public String toString() {
      return String.format(
      "ID: %d\nNome: %s\nSalário: R$ %.2f\n\n", ID_EMPREGADO, nome, salario);
   }

   


   
}

