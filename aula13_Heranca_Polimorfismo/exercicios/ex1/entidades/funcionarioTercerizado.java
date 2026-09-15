package aula13_Heranca_Polimorfismo.exercicios.ex1.entidades;

public class funcionarioTercerizado extends funcionario{
   private String nome;
   private int horas;
   private Double valorHora;
   private Double adicional;

   public funcionarioTercerizado() {
   }

   public funcionarioTercerizado(String nome, int horas, Double valorHora, Double adicional) {
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
   public Double pagamento() {
      return super.pagamento() + adicional * 1.1;
   }

   
}
