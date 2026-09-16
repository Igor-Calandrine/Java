package aula13_Heranca_Polimorfismo.exercicios.ex2.entidades;

public class Produto {
   protected String nome;
   protected Double preco;

   public Produto() {
   }

   public Produto(String nome, Double preco) {
      this.nome = nome;
      this.preco = preco;
   }

   public String getNome() {
      return nome;
   }

   public Double getPreco() {
      return preco;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }


   public void setPreco(Double preco) {
      this.preco = preco;
   }

   public String produtoInfo() {
      StringBuilder sb = new StringBuilder("");
      sb.append("\nNome: " + nome);
      sb.append(String.format("\nPreço: R$%.2f", preco));

      return sb.toString();

   }

   public String produtoString() {
      StringBuilder sb = new StringBuilder("");
      sb.append("\n===Novo Produto===");
      sb.append(produtoInfo());
      

      return sb.toString();
   }

   
}
