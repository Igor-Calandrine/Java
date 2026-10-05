package aula16_Interfaces.exercicios.ex1.Espacos;

import aula16_Interfaces.exercicios.ex1.interfaces.Reservavel;

public class SalaLoja implements Reservavel{
   private String espaco;
   private Double valor;

   public SalaLoja(String espaco, Double valor) {
      this.espaco = espaco;
      this.valor = valor;
   }

   public String getespaco() {
      return espaco;
   }

   @Override 
   public Double getValor() {
      return valor;
   }

   public void setespaco(String espaco) {
      this.espaco = espaco;
   }

   public void setValor(Double valor) {
      this.valor = valor;
   }

   @Override 
   public String toString() {
      StringBuilder sb = new StringBuilder();

      sb.append("\nSala: " + espaco);
      sb.append("\nValor/Mês: " + valor);

      return sb.toString();
   }
}
