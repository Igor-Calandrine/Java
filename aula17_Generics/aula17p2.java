package aula17_Generics;

public class aula17p2 {
/*
-Generics Delimitados
   Até agora, ao utilizar Generics, podemos criar uma classe que aceite diferentes tipos de dados, como String, Integer, Double ou até mesmo objetos de classes próprias.
   Em Java, os Generics Delimitados (Bounded Generics) permitem restringir os tipos que podem ser utilizados em uma classe, interface ou método genérico.

-Utilizando extends para delimitar os tipos
   Para restringir os tipos aceitos por um parâmetro genérico, utilizamos a palavra-chave extends.
   A expressão T extends Number determina que o tipo T deve ser Number ou uma de suas subclasses.

*   public class DadosNumericos<T extends Number> {
*      private T valor;
*
*      public DadosNumericos(T valor) {
*         this.valor = valor;
*      }
*
*      public T getValor() {
*         return valor;
*      }
*   }

   Assim, podemos criar objetos da seguinte maneira:

*   DadosNumericos<Integer> dado1 = new DadosNumericos<>(10);
*   DadosNumericos<Double> dado2 = new DadosNumericos<>(15.5);

-Métodos Genericos Delimitados
   Além de restringir os tipos aceitos, os Generics Delimitados permitem acessar métodos definidos pela classe ou interface que estabelece o limite.

*   public class DadosNumericos<T extends Number> {
*   private T valor;
*
*      public DadosNumericos(T valor) {
*         this.valor = valor;
*      }
*
*      public double quadrado() {
*         return valor.doubleValue() * valor.doubleValue();
*      }
*   }

   O método doubleValue() pertence à classe Number.
   Como T está limitado a Number e suas subclasses, o compilador sabe que qualquer tipo utilizado terá acesso a esse método.

   Podemos utilizar a classe assim:

*   DadosNumericos<Integer> dado1 = new DadosNumericos<>(5);
*   System.out.println(dado1.quadrado());

   Sem o delimitador extends Number, o compilador não poderia garantir que o tipo T possuiria o método doubleValue().
   Portanto, os Generics Delimitados também permitem escrever métodos genéricos com operações específicas, mantendo a segurança de tipos.

-Métodos Genericos Delimitados com Interfaces - 
   -Não Estáticos
   Um método estático pertence ao objeto por isso temos sua declaração na classe

*   public class CalculationService<T extends Comparable<T>> {

*      public T max(List<T> list) {
*      }

*   }
      

   -Estáticos
   Um método estático pertence à classe e pode ser chamado sem a criação de um objeto. Para isso, utilizamos a palavra-chave static, por isso teremos a seguinte sintaxe, observe a cuidado a declaração do método:

*   public class CalculationService {

*      public static <T extends Comparable<T>> T max(List<T> list) {
*      }

*   }   

   Nesse exemplo, o método é estático e a classe CalculationService não possui um parâmetro genérico declarado em sua definição, Por isso, o próprio método declara seu parâmetro de tipo
  

-Múltiplos limites
   Java também permite estabelecer mais de um limite para um parâmetro genérico
   Essa declaração exige que o tipo T seja uma subclasse de Number e também implemente a interface Comparable<T>.

   *<T extends Number & Comparable<T>>
   
   !Regra importante: quando houver uma classe e uma ou mais interfaces, a classe deve aparecer primeiro. As interfaces são separadas pelo símbolo &

*/ 
}
