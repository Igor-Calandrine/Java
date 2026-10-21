package aula17_Generics.exercicios.ex4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto implements Comparable<Produto> {
   private String nome;
   private Double preco;
   private LocalDate fabricado;

   public Produto(String nome, Double preco, LocalDate fabricado) {
      this.nome = nome;
      this.preco = preco;
      this.fabricado = fabricado;
   }

   @Override
   public String toString() {
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      StringBuilder sb = new StringBuilder();

      sb.append("Nome: " + nome);
      int qntMax = ("Nome: " + nome).length();
      sb.append(" ".repeat(30 - qntMax));
      sb.append(String.format("Preço: R$%.2f", preco));
      qntMax = (String.format("Preço: R$%.2f", preco)).length();
      sb.append(" ".repeat(30 - qntMax));
      sb.append(("Fabricação: " + fabricado.format(format)));

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
   public LocalDate getFabricado() {
      return fabricado;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public void setPreco(Double preco) {
      this.preco = preco;
   }
   public void setFabricado(LocalDate fabricado) {
      this.fabricado = fabricado;
   }

   

   
}
