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
      return preco + preco * alfandega;
   }

   @Override 
   public String produtoString() {
      StringBuilder sb = new StringBuilder("");
      sb.append("\n===Produto Importado===");
      sb.append(super.produtoString());
      sb.append("\nTaxa Alfandegária: " + alfandega);
      sb.append("\nPreco Final: R$ " + precoFinal());

      return sb.toString();
   }


}
