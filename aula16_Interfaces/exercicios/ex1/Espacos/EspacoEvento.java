package aula16_Interfaces.exercicios.ex1.Espacos;

import aula16_Interfaces.exercicios.ex1.interfaces.Reservavel;

public class EspacoEvento implements Reservavel {
   private String espaco;
   private Double valor;

   public EspacoEvento(String espaco, Double valor) {
      this.espaco = espaco;
      this.valor = valor;
   }

   @Override 
   public String toString() {
      StringBuilder sb = new StringBuilder();

      sb.append("\nEspaço: " + espaco);
      sb.append("\nValor/Mês: " + valor);

      return sb.toString();
   }

   public String getEspaco() {
      return espaco;
   }

   @Override 
   public Double getValor() {
      return valor;
   }

   public void setEspaco(String espaco) {
      this.espaco = espaco;
   }

   public void setvalor(Double valor) {
      this.valor = valor;
   }

}
