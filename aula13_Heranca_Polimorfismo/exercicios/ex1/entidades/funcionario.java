package aula13_Heranca_Polimorfismo.exercicios.ex1.entidades;

public class Funcionario {
   protected String nome;
   protected int horas;
   protected Double valorHora;

   public Funcionario () {
   }

   public Funcionario (String nome, int horas, Double valorHora) {
      this.nome = nome;
      this.horas = horas;
      this.valorHora = valorHora;
   }

   public String getNome() {
      return nome;
   }

   public int getHoras() {
      return horas;
   }

   public Double getValorHora() {
      return valorHora;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setHoras(int horas) {
      this.horas = horas;
   }

   public void setValorHora(Double valorHora) {
      this.valorHora = valorHora;
   }

   public Double remuneracao() {
      return valorHora * horas;
   }

   public String funcionarioEstatus() {
      StringBuilder sb = new StringBuilder("");
      sb.append("===Estatus Funcionário===");
      sb.append(String.format("\nNome: %s", getNome()));
      sb.append(String.format("\nHoras: %d", getHoras()));
      sb.append(String.format("\nValor/Hora: R$%.2f", getValorHora()));

      return sb.toString();
   }
}
