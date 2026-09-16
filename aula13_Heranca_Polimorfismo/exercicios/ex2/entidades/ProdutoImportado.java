package aula13_Heranca_Polimorfismo.exercicios.ex2.entidades;

public class ProdutoImportado extends Produto {
   private Double alfandega;

   public ProdutoImportado (String nome, Double preco, Double alfandega) {
      super(nome, preco);
      this.alfandega = alfandega;
   }

   public Double getAlfandega() {
      return alfandega;
   }

   public void setAlfandega(Double alfandega) {
      this.alfandega = alfandega;
   }

   public Double precoFinal () {
      return preco + preco * alfandega/100;
   }

   @Override 
   public String produtoString() {
      StringBuilder sb = new StringBuilder("");
      sb.append("\n===Produto Importado===");
      sb.append(super.produtoInfo());
      sb.append("\nTaxa Alfandegária: " + alfandega + "%");
      sb.append(String.format("\nPreco Final: R$%.2f ", precoFinal()));

      return sb.toString();
   }


}
