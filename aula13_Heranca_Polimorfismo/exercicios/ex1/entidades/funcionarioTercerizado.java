package aula13_Heranca_Polimorfismo.exercicios.ex1.entidades;

public class FuncionarioTercerizado extends Funcionario{
   private Double adicional;

   public FuncionarioTercerizado() {
   }

   public FuncionarioTercerizado(String nome, int horas, Double valorHora, Double adicional) {
      super(nome, horas, valorHora);
      this.adicional = adicional;
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
