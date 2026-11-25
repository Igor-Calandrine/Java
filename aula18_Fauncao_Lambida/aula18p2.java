package aula18_Fauncao_Lambida;

public class aula18p2 {
/*
-Interface Funcionais
   Uma interface funcional é uma interface que possui apenas um método abstrato.

   Ela é muito importante porque permite utilizar expressões lambda, tornando o código mais simples e evitando a necessidade de criar classes apenas para implementar um método.

   Como Calculo possui apenas um método abstrato, podemos substituir a implementação da classe por uma expressão lambda:

*   public interface Calculo {
*      double executar(double a, double b);
*   }

*   Calculo calculo = (a, b) -> a + b;
*   System.out.println(calculo.executar(10, 5));

-@FunctionalInterface
   Essa anotação informa ao compilador que a interface deve possuir somente um método abstrato, se você tentar adicionar outro método abstrato, o compilador apresentará um erro.

   !Atenção: uma interface funcional pode possuir outros métodos, desde que não sejam métodos abstratos adicionais. Por exemplo, métodos default e static são permitidos.

*   @FunctionalInterface
*   public interface Calculo {
*      double executar(double a, double b);
*   }

-Predicate
   O Predicate<T> é uma interface funcional do Java utilizada para realizar testes ou verificações sobre determinado valor.
   Sua principal característica é: recebe um valor e retorna um boolean (true ou false).

   -1
*   Predicate<Produto> produtoCaro = produto -> produto.getPreco() > 100;
   
*   if (produtoCaro.test(produto)) {
*      System.out.println(produto.getNome());
*   }

   -2
*   double min = 100.0;
*   Predicate<Product> pred = p -> p.getPrice() >= min;

   -3 in-line
*   lista.removeIf(p -> p.getPrice() >= 100)

-Consumer
   O Consumer<T> é uma interface funcional do pacote java.util.function que representa uma operação que recebe um argumento e executa uma ação sobre ele, mas não retorna nenhum resultado.

   É bastante utilizado com expressões Lambda e referências a métodos, principalmente para percorrer coleções e executar operações sobre seus elementos.

   -1
*   Consumer<Produto> aumentar = e -> e.setPrice(e.getPrice() * 1.1);
*   lista.forEach(aumentar);

   -2 in-line
*   lista.forEach(e -> e.setPrice(e.getPrice() * 1.1))

-Function
   A Function<T, R> é uma interface funcional do pacote java.util.function que recebe um argumento de um determinado tipo e retorna um resultado, que pode ser de outro tipo.

   É utilizada principalmente para transformar dados, extrair informações de objetos e realizar operações que precisam produzir um resultado.

*  Function<Produto, String> maiusculoNome = p -> p.getNome().toUpperCase();

   -Utilização inline
   Assim como Predicate e Consumer, você pode utilizar Function diretamente em métodos que a recebem
   Um exemplo bastante comum é o map() do Stream

*   listaProdutos.stream().map(p -> p.getNome())
*   .forEach(System.out::println);

   -Utilizando referência a método

*   listaProdutos.stream().map(Produto::getNome)
*   .forEach(System.out::println);




*/ 
}
