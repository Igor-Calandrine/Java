package aula17_Generics.exercicios.ex1;

public class Caixa <Type> {
   private Type valor;

   public Caixa(Type valor) {
      this.valor = valor;
   }

   public Type getValor() {
      return valor;
   }

   public void setValor(Type valor) {
      this.valor = valor;
   }

   @Override 
   public String toString() {
      return "Valor: " + valor;
   }
}
