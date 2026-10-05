package aula16_Interfaces.exercicios.ex1.Reserva;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import aula16_Interfaces.exercicios.ex1.interfaces.Reservavel;

public class Reserva {
   private String cliente;
   private final LocalDate INICIOALUGUEL;
   private LocalDate fimAluguel;
   private Reservavel tipoReservavel;

   public Reserva(String cliente, LocalDate INICIOALUGUEL, LocalDate fimAluguel, Reservavel tipoReservavel) {
      this.cliente = cliente;
      this.INICIOALUGUEL = INICIOALUGUEL;
      this.fimAluguel = fimAluguel;
      this.tipoReservavel = tipoReservavel;
   }

   public Double valorFinalContrato() {
      Period periodo = Period.between(INICIOALUGUEL, fimAluguel);
      int anos = periodo.getYears();
      int meses = periodo.getMonths();
      int dias = periodo.getDays();

      return (anos * (tipoReservavel.getValor()*12)) + (meses * tipoReservavel.getValor()) + (dias * tipoReservavel.getValor()/30);
   }

   public Double valorFinalAtual() {
      Period periodo = Period.between(LocalDate.now(), fimAluguel);
      int anos = periodo.getYears();
      int meses = periodo.getMonths();
      int dias = periodo.getDays();

      return (anos * (tipoReservavel.getValor()*12)) + (meses * tipoReservavel.getValor()) + (dias * tipoReservavel.getValor()/30);
   }

   @Override 
   public String toString() {
      StringBuilder sb = new StringBuilder();

      sb.append("Cliente: " + cliente);
      sb.append("\nEspaço: " + tipoReservavel.toString());
      sb.append("\nData Contrato: " + INICIOALUGUEL + " - " + fimAluguel);
      sb.append("\nValor Final: " + valorFinalContrato());
      sb.append("\n");

      return sb.toString();
   }

   public void renovacaoAluguel(LocalDate fimAluguel) {
      if (fimAluguel.isAfter(this.fimAluguel)) {
         this.fimAluguel = fimAluguel;
      }
      else {
         System.out.println("Erro: Data anterior ao contrato vigente.");
      }

   }

   public void salvarProduto() {
      String path = "aula16_Interfaces\\exercicios\\ex1\\RegistroReservas\\RegistroReservas.txt";

      try (BufferedWriter bf = new BufferedWriter (new FileWriter(path, true))) {
         bf.append(toString());
         bf.append("\n");
      }
      catch (IOException e) {
         System.out.printf("Erro: " + e.getMessage());
      }
   }

   public void listarProduto() {
      String path = "aula16_Interfaces\\exercicios\\ex1\\RegistroReservas\\RegistroReservas.txt";

      try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
         
      }
      catch (IOException e) {
         System.out.println("Erro: " + e.getMessage());
      }
   }

   public String getCliente() {
      return cliente;
   }

   public LocalDate getINICIOALUGUEL() {
      return INICIOALUGUEL;
   }

   public LocalDate getFimAluguel() {
      return fimAluguel;
   }

   public Reservavel getTipoReservavel() {
      return tipoReservavel;
   }

   public void setCliente(String cliente) {
      this.cliente = cliente;
   }

   public void setFimAluguel(LocalDate fimAluguel) {
      this.fimAluguel = fimAluguel;
   }

   public void setTipoReservavel(Reservavel tipoReservavel) {
      this.tipoReservavel = tipoReservavel;
   }

   

}


