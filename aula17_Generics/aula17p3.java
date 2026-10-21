package aula17_Generics;

public class aula17p3 {
/*
-Tipos Curinga (?)
   Os wildcards, ou tipos curinga, são representados pelo símbolo ? e permitem trabalhar com tipos genéricos cujo tipo específico não precisa ser conhecido previamente.
   Imagine que você tenha duas listas:

*      List<Integer> numeros = new ArrayList<>();
*      List<Double> decimais = new ArrayList<>();

   Embora Integer e Double sejam subclasses de Number, uma List<Integer> não pode ser tratada diretamente como uma List<Number> e enm List,<Objetc>. Isso acontece porque os Generics em Java não permitem essa conversão automaticamente.

   ?Os curingas existem para oferecer mais flexibilidade ao trabalhar com diferentes tipos parametrizados, permitindo definir quais tipos são aceitos por um método ou variável.

-Sintaxe dos Curingas
   Existem três formas principais:

   -Curinga Ilimitado <?>
   Aceita uma lista de qualquer tipo, sem especificar qual é esse tipo

*      List<?> lista

   -Curinga delimitado superiormente <? extends Tipo>
   Aceita um tipo específico ou um subtipo dele
   Nesse exemplo, a lista pode ser de Integer, Double, Float ou outro subtipo de Number

*     List<? extends Number> lista;

   -Curinga delimitado inferiormente <? super Tipo>
   Aceita um tipo específico ou um supertipo dele
   Nesse caso, a lista pode ser de Integer, Number ou Object.

*     List<? super Integer> lista;

-Adicionar elementos a uma lista com curinga (?)
   Quando declaramos uma lista utilizando o curinga ?, o Java permite trabalhar com diferentes tipos de listas sem precisar conhecer o tipo específico dos seus elementos. Entretanto, essa flexibilidade traz uma restrição importante: não podemos adicionar elementos à lista, exceto null.

   Imagine a seguinte declaração:

*      List<?> lista = new ArrayList<Integer>();

   Agora, imagine que o Java permitisse:

*     lista.add(10);

   O compilador não pode garantir que o tipo aceito pela lista seja Integer. A lista poderia estar referenciando uma List<String>, uma List<Double> ou uma lista de qualquer outro tipo.

-Ler elementos a uma lista com curinga (?)
   Como o tipo específico é desconhecido, o Java permite recuperar os elementos como Object, que é a classe base de todos os objetos:

*     Object elemento = lista.get(0)






*/ 
}
