package aula15_Arquivos.exercicios.ex2.entidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
   private List<Produto> listaProdutos = new ArrayList<>();


   public Estoque() {
   }

   public void carregarEstoque() {
      String path = "aula15_Arquivos\\exercicios\\ex2\\entidades\\Produto.text";

      try (BufferedReader br = new BufferedReader(new FileReader(path))) {
         String linha = br.readLine();

         int inicioSubstring = linha.indexOf(":") + 1;
         String nome = null;
         Integer quantidade = null;
         Double valor = null;

         while (linha != null) {
            inicioSubstring = linha.indexOf(":") + 1;

            if (linha.startsWith("Produto")) {
               nome = linha.substring(inicioSubstring).trim();
            }
            else if (linha.startsWith("Quantidade")) {
               String quantidadeString = linha.substring(inicioSubstring).trim();
               quantidade = Integer.parseInt(quantidadeString);
            }
            else if (linha.startsWith("Valor")) {
               String valorString = linha.substring(inicioSubstring).trim();
               valor = Double.parseDouble(valorString);
            }

            if (nome != null && quantidade != null && valor != null) {
               Produto produto = new Produto(nome, valor, quantidade);
               listaProdutos.add(produto);

               nome = null;
               quantidade = null;
               valor = null;
            }

            linha = br.readLine();
         }

      } catch (IOException e){
         System.out.println("Erro: " + e.getMessage());
      }
   }

   public void lerEstoque() {
      for (Produto e : listaProdutos) {
         System.out.printf("%s", e.toString());
         System.out.printf("\n");
      }
   }

   public Double valorEstoque() {
      carregarEstoque();
      Double totalEstoque = 0.0;

      for (Produto e : listaProdutos) {
         totalEstoque += e.getValor();
      }

      return totalEstoque;
   }
}
