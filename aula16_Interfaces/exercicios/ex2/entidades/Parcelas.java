package aula16_Interfaces.exercicios.ex2.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {
   private static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

   private LocalDate dataParcela;
   private Double valorParcela;

   public Parcelas(LocalDate dataParcela, Double valorParcela) {
      this.dataParcela = dataParcela;
      this.valorParcela = valorParcela;
   }

   public LocalDate getDataParcela() {
      return dataParcela;
   }

   public Double getValorParcela() {
      return valorParcela;
   }

   public void setDataParcela(LocalDate dataParcela) {
      this.dataParcela = dataParcela;
   }

   @Override 
   public String toString() {
      return dataParcela.format(format) + " - " + String.format("%.2f", valorParcela);
   }
   
}
