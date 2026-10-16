package aula17_Generics;

public class aula17 {
public static void main(String[] args) {
/*
-Generics
   Generics (tipos genéricos) são um recurso da linguagem Java que permite criar classes, interfaces e métodos capazes de trabalhar com diferentes tipos de dados, mantendo a segurança dos tipos durante a compilação. Seu principal objetivo é permitir a reutilização de código sem precisar criar uma implementação diferente para cada tipo de dado.

   Se quisermos criar uma estrutura semelhante para armazenar:
   *números ou nomes, 
   poderíamos acabar repetindo boa parte do código. Com Generics, podemos criar uma estrutura genérica que aceita diferentes tipos, definidos no momento em que ela é utilizada.

   Os Generics são representados, normalmente, por letras entre os sinais de menor e maior, como <T>. A letra T é uma convenção que representa um tipo (Type), mas outras letras também podem ser utilizadas, como E para elementos (Element) e K e V para chaves (Key) e valores (Value).

   public class Caixa<T> {
      private T objeto;

      public void setObjeto(T objeto) {
         this.objeto = objeto;
      }

      public T getObjeto() {
         return objeto;
      }
   }

   Nesse exemplo, T representa o tipo de dado que será definido quando a classe for utilizada. Podemos criar uma caixa para armazenar uma String ou um Integer, por exemplo:

      Caixa<String> caixaTexto = new Caixa<>();
      caixaTexto.setObjeto("Java");

      Caixa<Integer> caixaNumero = new Caixa<>();
      caixaNumero.setObjeto(100);

   Por fim, é importante compreender que os Generics não se limitam às classes, também podem ser aplicados a métodos e interfaces, permitindo desenvolver componentes reutilizáveis e flexíveis. Entretanto, em Java, os tipos genéricos possuem algumas restrições, 
   !não podemos utilizar diretamente tipos primitivos, como int e double, como argumentos de tipo. 
   Para isso, utilizamos suas respectivas classes wrapper, como Integer e Double.
*/ 
}
}
