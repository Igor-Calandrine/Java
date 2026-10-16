package aula17_Generics.exercicios.ex2;

public class DadosPessoa <Type>{
   private Type dados;

   public DadosPessoa(Type dados) {
      this.dados = dados;
   }

   public Type getDados() {
      return dados;
   }

   public void setDados(Type dados) {
      this.dados = dados;
   }

   @Override 
   public String toString() {
      if(dados instanceof String) {
         return "Nome: " + dados;
      }
      else if (dados instanceof Integer) {
         return "Idade: " + dados;
      }
      else {
         return "Dados: " + dados; 
      }
   }
}
