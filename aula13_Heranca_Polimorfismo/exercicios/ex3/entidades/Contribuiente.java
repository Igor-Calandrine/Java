package aula13_Heranca_Polimorfismo.exercicios.ex3.entidades;

public abstract class Contribuiente {
   protected String nome;
   protected Double rendaAnual;

   public Contribuiente(String nome, Double rendaAnual) {
      this.nome = nome;
      this.rendaAnual = rendaAnual;
   }

   public Contribuiente() {
   }

   public String getNome() {
      return nome;
   }

   public Double getRendaAnual() {
      return rendaAnual;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setRendaAnual(Double rendaAnual) {
      this.rendaAnual = rendaAnual;
   }

   public String estatusContribuinte() {
      StringBuilder sb = new StringBuilder("");
      sb.append("\nNome: " + nome);
      sb.append(String.format("\nRenda Anual: R$%.2f", rendaAnual));
      
      return sb.toString();
   }

   public abstract Double impostoFinal();
}
