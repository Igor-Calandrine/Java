package aula16_Interfaces.exercicios.ex3.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContratoConsultoria implements Contrato{
   private String nomeConsultor;
   private Double valorContrato;
   private LocalDate dataInicio;
   private int meses;
   private Double juros = 5.0;

   public ContratoConsultoria(String nomeConsultor, Double valorContrato, LocalDate dataInicio, int meses) {
      this.nomeConsultor = nomeConsultor;
      this.valorContrato = valorContrato;
      this.dataInicio = dataInicio;
      this.meses = meses;
   }

   public Double getTotalContrato() {
      return valorContrato;
   }
   public int getMeses() {
      return meses;
   }
   public String getNomeConsultor() {
      return nomeConsultor;
   }
   public LocalDate getDataInicio() {
      return dataInicio;
   }
   public Double getJuros() {
      return juros;
   }
   
   @Override 
   public String toString() {
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      StringBuilder sb = new StringBuilder();
      sb.append("\nConsultor: " + nomeConsultor);
      sb.append(String.format("\nValor: R$%.2f", valorContrato) );
      sb.append("\nData de Início: " + dataInicio.format(format));
      sb.append("\nJuros: " + juros + "% a.m");
      sb.append(String.format("\nParcelas: R$%.2f", parcelaContrato()));
      sb.append(String.format("\nValor Final: R$%.2f", valorFinalContrato()));
   
      return sb.toString();
   }

   public void nomeConsultor(String nomeConsultor) {
      this.nomeConsultor = nomeConsultor;
   }
   public void setValorContrato(Double valorContrato) {
      this.valorContrato = valorContrato;
   }
   public void setDataInicio(LocalDate dataInicio) {
      this.dataInicio = dataInicio;
   }
   public void setJuros(Double juros) {
      this.juros = juros;
   }

   
}
