package aula10_Vetores;

public class aula10P2 {
public static void main(String[] args) {
/*
-ArrayList
   O ArrayList é uma estrutura de dados que funciona como um array de tamanho dinâmico.
   Não aceita tipos primitivos diretamente, trabalha com objetos
   Os elementos permanecem na ordem em que foram adicionados.
   Pode percorrer com For-Each

   Principais métodos:
      add(), add(index, elemento)
      get(index)
      set(index, elemento)
      remove(objeto), 
         *remove(Integer.valueOf(valor_variavel)); 
      size()
      sort() 
         *.sort((a, b) -> a.compareToIgnoreCase(b)); 
         *.sort((a, b) -> a - b);
      contains(elemento)
      indexOf(elemento)
      isEmpty()
      lastIndexOf(elemento)
      clear()
      removeIf()
      toArray()

   Sua sintaxe é:

*     import java.util.ArrayList;

*     ArrayList<TipoWrapper> nome_variavel = new ArrayList<>();

-Criando uma nova lista apartir de um filtro
   Segue a seguinte sintaxe

*     List<TipoWrapper> nome_variaval = nome_array.stream().filter("condição").collect(Collectors.toList());

      ArrayList -> stream() -> filter() -> collect() -> toList


*/ 
}   
}
