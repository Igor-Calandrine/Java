package aula13_Heranca_Polimorfismo.exercicios.ex2.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
   private LocalDate dataFabricado;

   public ProdutoUsado () {
   }

   public ProdutoUsado (String nome, Double preco, LocalDate dataFabricado) {
      super(nome, preco);
      this.dataFabricado = dataFabricado;
   }

   public LocalDate getDataFabricado() {
      return dataFabricado;
   }

   public String localDateFormat() {
      DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String dataString = dataFabricado.format(format1);
      
      return dataString;
   }

   @Override 
   public String produtoString() {
      StringBuilder sb = new StringBuilder("");
      sb.append("\n===Produto Usado===");
      sb.append("\nData de Farbicação: " + localDateFormat());
      sb.append(super.produtoInfo());

      return sb.toString();
   }
   
}
