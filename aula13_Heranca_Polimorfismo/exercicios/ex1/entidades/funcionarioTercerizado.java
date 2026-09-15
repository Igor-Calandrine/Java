package aula13_Heranca_Polimorfismo.exercicios.ex1.entidades;

public class FuncionarioTercerizado extends Funcionario{
   private Double adicional;

   public FuncionarioTercerizado() {
   }

   public FuncionarioTercerizado(String nome, int horas, Double valorHora, Double adicional) {
      super(nome, horas, valorHora);
      this.adicional = adicional;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getHoras() {
      return horas;
   }

   public void setHoras(int horas) {
      this.horas = horas;
   }

   public Double getValorHora() {
      return valorHora;
   }

   public void setValorHora(Double valorHora) {
      this.valorHora = valorHora;
   }

   public Double getAdicional() {
      return adicional;
   }

   public void setAdicional(Double adicional) {
      this.adicional = adicional;
   }

   @Override 
   public Double remuneracao() {
      return super.remuneracao() + adicional * 1.1;
   }

   @Override
   public String funcionarioEstatus() {
      String sb = super.funcionarioEstatus() + 
      String.format("\nAdicional: R$%.2f", getAdicional());
      
      return sb.toString();
   }

   
}
