package aula13_Heranca_Polimorfismo.exercicios.ex1.entidades;

public class funcionario {
   protected String nome;
   protected int horas;
   protected Double valorHora;

   public funcionario () {
   }

   public funcionario (String nome, int horas, Double valorHora) {
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

   public Double getvalorHora() {
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

   public Double pagamento() {
      return valorHora * horas;
   }
}
