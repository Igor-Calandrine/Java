package aula16_Interfaces.exercicios.ex3.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContratoEmpresarial implements Contrato{
   private String nomeEmpresa;
   private Double valorTotal;
   private LocalDate dataInicio;
   private int meses;
   private Double juros = 3.0;

   public ContratoEmpresarial(String nomeEmpresa, Double valorTotal, LocalDate dataInicio, int meses) {
      if (valorTotal < 0 || valorTotal == null) {
         throw new IllegalArgumentException("Valor do contrato inválido");
      }
      if (dataInicio.isBefore(LocalDate.now()) || dataInicio == null) {
         throw new IllegalArgumentException("Data de início inválida");
      }
      this.nomeEmpresa = nomeEmpresa;
      this.valorTotal = valorTotal;
      this.dataInicio = dataInicio;
      this.meses = meses;
   }

   public String getNomeEmpresa() {
      return nomeEmpresa;
   }
   public int getMeses() {
      return meses;
   }
   public LocalDate getDataInicio() {
      return dataInicio;
   }
   public Double getTotalContrato() {
      return valorTotal;
   }
   public Double getJuros() {
      return juros;
   }

   @Override 
   public String toString() {
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      StringBuilder sb = new StringBuilder();
      sb.append("\nEmpresa: " + nomeEmpresa);
      sb.append(String.format("\nValor: R$%.2f", valorTotal) );
      sb.append("\nData de Início: " + dataInicio.format(format));
      sb.append("\nJuros: " + juros + "% a.m");
      sb.append(String.format("\nParcelas: R$%.2f", parcelaContrato()));
      sb.append(String.format("\nValor Final: R$%.2f", valorFinalContrato()));
   
      return sb.toString();
   }

   public void setNomeEmpresa(String nomeEmpresa) {
      this.nomeEmpresa = nomeEmpresa;
   }

   public void setValorTotal(double valorTotal) {
      this.valorTotal = valorTotal;
   }

   public void setDataInicio(LocalDate dataInicio) {
      this.dataInicio = dataInicio;
   }

   public void setJuros(Double juros) {
      this.juros = juros;
   }

   



}
