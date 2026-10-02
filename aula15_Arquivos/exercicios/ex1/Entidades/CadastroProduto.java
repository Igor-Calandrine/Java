package aula15_Arquivos.exercicios.ex1.Entidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroProduto {
   protected String produto;
   protected int quantidade;
   protected Double valor;

   public CadastroProduto() {
   }

   public CadastroProduto(String produto, int quantidade, Double valor) {
      this.produto = produto;
      this.quantidade = quantidade;
      this.valor = valor;
   }

   public String getProduto() {
      return produto;
   }

   public int getQuantidade() {
      return quantidade;
   }

   public Double getValor() {
      return valor;
   }

   public void setProduto(String produto) {
      this.produto = produto;
   }

   public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
   }

   public void setValor(Double valor) {
      this.valor = valor;
   }

   public void salvarProduto() {
      String path = "aula15_Arquivos\\exercicios\\ex1\\Produtos.txt";

      StringBuilder sb = new StringBuilder("");
      sb.append("\nProduto: " + produto);
      sb.append("\nQuantidade: " + quantidade);
      sb.append("\nValor: R$" + valor);
      sb.append("\n----");

      try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
         bw.write(sb.toString());

      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void lerProduto () {
      String path = "aula15_Arquivos\\exercicios\\ex1\\Produtos.txt";

      try (BufferedReader br = new BufferedReader(new FileReader(path))) {
         String linha = br.readLine();
         
         while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
         }
      
      } catch (FileNotFoundException e) {
         System.out.println("Erro: Arquivo não encontrado");
      } catch (IOException e) {
         System.out.println("Erro:" + e.getMessage());
      }
   }
}
