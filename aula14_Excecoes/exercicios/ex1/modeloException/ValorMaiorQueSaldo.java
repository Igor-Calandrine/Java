package aula14_Excecoes.exercicios.ex1.modeloException;

public class ValorMaiorQueSaldo extends Exception{
   public ValorMaiorQueSaldo(String msg) {
      super(msg);
   }
}
