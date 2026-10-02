package aula15_Arquivos.exercicios.ex2.entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Produto {
   private String produto;
   private Double valor;
   private Integer quantidade;

   public Produto() {
   }

   public Produto(String produto, Double valor, Integer quantidade) {
      this.produto = produto;
      this.valor = valor;
      this.quantidade = quantidade;
   }

   public String getProduto() {
      return produto;
   }

   public Double getValor() {
      return valor;
   }

   public Integer getQuantidade() {
      return quantidade;
   }

   public void setProduto(String produto) {
      this.produto = produto;
   }

   public void setValor(Double valor) {
      this.valor = valor;
   }

   public void setQuantidade(Integer quantidade) {
      this.quantidade = quantidade;
   }

   public Double valorFinal() {
      return valor * quantidade;
   }

   public void saveProduto() {
      String path = "aula15_Arquivos\\exercicios\\ex2\\entidades\\Produto.text";

      StringBuilder sb = new StringBuilder();
      sb.append("Produto: " + produto);
      sb.append("\nQuantidade: " + quantidade);
      sb.append(String.format("\nValor: %.2f", valor));
      sb.append("\n----\n");

      try (BufferedWriter bf = new BufferedWriter(new FileWriter(path, true))) {
         bf.write(sb.toString());
      
      } catch (FileNotFoundException e) {
         System.out.println("\nErro: " + e.getMessage());
      } catch (IOException e){
         System.out.println("\nErro: " + e.getMessage());
      }
   }

   public void lerProduto() {
      String path = "aula15_Arquivos\\exercicios\\ex2\\entidades\\Produto.text";

      try (BufferedReader br = new BufferedReader(new FileReader(path))) {
         String linha = br.readLine();

         while (linha != null) {
            System.out.println(linha);
            br.readLine();
         }

      } catch (IOException e){
         System.out.println("Erro: " + e.getMessage());
      }
   }

   @Override 
   public String toString() {
      StringBuilder sb = new StringBuilder();

      sb.append("Produto: " + produto);
      sb.append(String.format("\nValor: R$%.2f", valor));
      sb.append("\nQuantidade: " + quantidade);
      sb.append(String.format("\nValor Estoque: R$%.2f", valorFinal()));
      sb.append("\n");

      return sb.toString();
   }  
       
}
