package aula17_Generics.exercicios.ex3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto implements Comparable<Produto>{
   private String nome;
   private Double preco;
   private LocalDate validade;

   public Produto(String nome, double preco, LocalDate validade) {
      this.nome = nome;
      this.preco = preco;
      this.validade = validade;
   }

   @Override 
   public String toString() {
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

      StringBuilder sb = new StringBuilder();
      sb.append("Nome: " + nome);
      sb.append(String.format("\nPreço: R$%.2f", preco));
      sb.append(String.format("\nValidade: %s", validade.format(format)));

      return sb.toString();
   }

   @Override 
   public int compareTo(Produto proximo) {
      return preco.compareTo(proximo.getPreco());
   }

   public String getNome() {
      return nome;
   }
   public Double getPreco() {
      return preco;
   }
   public LocalDate getValidade() {
      return validade;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public void setPreco(double preco) {
      this.preco = preco;
   }

   
}
