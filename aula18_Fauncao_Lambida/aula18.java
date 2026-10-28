package aula18_Fauncao_Lambida;

public class aula18 {
public static void main(String[] args) {
/*
-Expressão Lâmbida
   As expressões lambda foram introduzidas no Java 8 com o objetivo de simplificar a escrita de implementações de interfaces funcionais, permitindo representar um comportamento de maneira mais curta e direta.

   Antes das lambdas, quando precisávamos fornecer um comportamento específico para uma interface, era comum criar uma classe que a implementasse ou utilizar uma classe anônima. Isso podia gerar bastante código para executar tarefas relativamente simples.

   Imagine, por exemplo, que queremos definir uma operação para somar dois números. Em vez de escrever uma implementação extensa, podemos utilizar uma expressão lambda para indicar diretamente o que deve ser feito: 
   
   *(a, b) -> a + b.

   O principal objetivo das lambdas é, portanto, reduzir o código repetitivo e facilitar o uso de comportamentos como argumentos para outros métodos. Isso é especialmente útil ao trabalhar com coleções, ordenação de elementos, filtros e processamento de dados.

   As lambdas estão diretamente relacionadas às interfaces funcionais, que são interfaces com exatamente um método abstrato. A interface define o contrato, isto é, os parâmetros e o retorno esperados, enquanto a expressão lambda fornece a implementação desse método.

-Sintaxe
   Uma expressão lambda possui uma estrutura básica composta por parâmetros, pelo operador -> e pelo corpo da expressão, que define o comportamento a ser executado.
   O operador -> separa os parâmetros do comportamento. À esquerda ficam os parâmetros recebidos pela lambda e, à direita, o código que será executado.

   *(parametros) -> expressão

   O Java permite omitir alguns elementos da sintaxe para tornar as expressões lambda mais curtas. Existem três regras principais.

   *Omitir os parênteses de um único parâmetro
   (String nome) -> System.out.println(nome)
   nome -> System.out.println(nome)

   *Omitir o tipo dos parâmetros
   (int a, int b) -> a + b
   (a, b) -> a + b

   *Omitir as chaves e o return
   Quando o corpo da lambda contém apenas uma expressão, podemos escrever essa expressão diretamente, sem chaves e sem a palavra return.

   (a, b) -> {
      return a + b;
   }
   (a, b) -> a + b



-Lambda e Interface
   *Interface funcional: define um contrato com um único método abstrato.

   *Expressão lambda: fornece uma implementação para esse método.

   *Variável de referência: pode receber essa implementação por meio de uma interface compatível.

-E quando a lambda tem mais de uma instrução?
   Nesse caso, usamos chaves {} e, se o método precisar devolver um valor, usamos return.

*   Operacao calculo = (a, b) -> {
*      int resultado = a + b;
*      System.out.println("Calculando...");
*      return resultado;
*   };

-Referência a métodos em Java: Classe::metodo
   Essa sintaxe é chamada de referência a métodos (Method Reference). Ela permite escrever de forma ainda mais curta determinadas expressões lambda, aproveitando um método que já existe, em vez de escrever sua chamada explicitamente dentro da lambda.

   O operador :: separa o nome da classe ou do objeto do método que queremos referenciar.
   Imagine que temos uma lista de nomes:

*     public class Funcionario {
*        private String nome;
*        private Integer idade;
*     }

   Podemos escrever a lambda:
*     Comparator<Funcionario> compararPorNome = (x, y) -> x.getName().compareTo(y.getName())
*     funcionarios.sort(compararPorNome);

*     funcionarios.sort((x, y) -> x.getName().compareTo(y.getName());



   Ou utilizar a referência a método:
*     Comparator<Funcionario> compararPorNome = Comparator.comparing(Funcionario::getName)
*     funcionarios.sort(compararPorNome);

*     funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

*/ 
}
}
