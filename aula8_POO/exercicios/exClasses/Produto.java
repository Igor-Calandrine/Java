package aula8_POO.exercicios.exClasses;

public class Produto {
   public String nome;
   public Double preco = 0.0;
   public int estoque = 0;
   public int quantidade = 0;
   public boolean validarCompra = false;

   public Double valorTotalEstoque() {
      return this.preco * this.estoque;
   }

   public Double valorTotalCompra() {
      return this.preco * this.quantidade;
   }

   public void adicionarCompra(int quantidade) {
      this.quantidade = this.quantidade + quantidade;
   }

   public void removerEstoque(int quantidade) {
      this.estoque -= quantidade;
   }

   public void validarCompra(int quantidade) {
      this.validarCompra = false;
      int total = this.estoque - quantidade;
      
      if (total >= 0) {
         this.validarCompra = true;
      }
      else {
         System.out.printf("\nCompra inválida");
         System.out.printf("\nQuantidade além do estoque");
      }
   }

}
