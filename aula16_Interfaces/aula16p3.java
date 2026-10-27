package aula16_Interfaces;

public class aula16p3 {
/*
-Set
   É uma interface do Java Collection Framework utilizada para armazenar uma coleção de elementos sem permitir elementos duplicados.
   Além disso, dependendo da implementação utilizada, o Set pode oferecer operações de busca eficientes.

   Existem três implementações que vale a pena conhecer:
   
   *HashSet 
   Não garante uma ordem específica dos elementos

   *LinkedHashSet
   Preserva a ordem de inserção.

   *TreeSet
   Mantém os elementos ordenados conforme um critério de comparação

-Métodos
   Os principais métodos são: 

   *add()
   *remove()
   *contains()
   *size()

-Operações de conjunto
   Assim como na matemática temos operação de conjunto entra Sets, e ao criar uma cópia antes da operação, preserva os conjuntos originais.

   *addAll()
   Equivalente a união

   *retainAll()
   Equivalente a intersção

   *removeAll()
   Equivalente a diferença

-Ordenação com TreeSet e Objetos
   Quando utilizamos um TreeSet para armazenar objetos de uma classe própria, precisamos definir como esses objetos serão comparados para determinar sua ordem.

   Uma das maneiras de definir esse critério é implementar a interface Comparable<T> na classe dos objetos.

   Se a classe Produto não implementar Comparable e não fornecermos um Comparator ao TreeSet, a tentativa de ordenar objetos que não possuem um critério de comparação compatível poderá provocar uma ClassCastException durante a execução.

*/ 
}
