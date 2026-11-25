package aula18_Fauncao_Lambida.exercicios.ex2;

public class Produto {
   private String nome;
   private double preco;
   private int quantidade;
   
   public Produto(String nome, double preco, int quantidade) {
      this.nome = nome;
      this.preco = preco;
      this.quantidade = quantidade;
   }

   public String getNome() {
      return nome;
   }

   public double getPreco() {
      return preco;
   }

   public int getQuantidade() {
      return quantidade;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setPreco(double preco) {
      this.preco = preco;
   }

   public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
   }

   @Override 
   public String toString() {
      StringBuilder sb = new StringBuilder();
      int espacamento = 20;

      sb.append("Nome: " + nome);
      sb.append(" ".repeat(espacamento - ("Nome: " + nome).length()));
      sb.append("Preço: R$" + preco);
      sb.append(" ".repeat(espacamento - ("Preço: R$" + preco).length()));
      sb.append("Quantidade: " + quantidade);
      sb.append(" ".repeat(espacamento - ("Quantidade: " + quantidade).length()));

      return sb.toString();
   }

   
}
