package aula19_Stream;

public class aula19 {
/*
-Stream
   O Stream é um recurso do Java que permite trabalhar com coleções de dados de maneira mais simples, expressiva e funcional.
   A ideia principal é permitir que você manipule uma coleção de dados sem precisar escrever manualmente vários loops (for).

   !Uma característica importante: Stream não é uma coleção
   !Não armazena os elementos como uma ArrayList
   !Trabalha com os elementos de uma fonte de dados, processando-os conforme as operações solicitadas
   !Não modifica a coleção original automaticamente

   Ele permite realizar operações como:
      Filtrar elementos
      Transformar elementos
      Ordenar dados
      Somar valores
      Encontrar elementos
      Agrupar informações
      Calcular estatísticas

   Suponha que você queira encontrar apenas os produtos com preço superior a R$ 1.000

   -Sem Stream:
*   for (Product p : products) {
*      if (p.getPrice() > 1000) {
*         System.out.println(p);
*      }
*   }

   -Com Stream
*  products.stream().filter(p -> p.getPrice() > 1000)
*  .forEach(System.out::println);

   Mas a principal vantagem não é simplesmente economizar linhas. É conseguir descrever o que queremos fazer com os dados, em vez de escrever detalhadamente como percorrer os dados.

-Principais operações do Stream Intermediárias
   Existem diversas operações, mas algumas são especialmente importantes

   -filter()
   Seleciona somente os elementos que atendem a uma condição.

*   products.stream().filter(p -> p.getPrice() >= 1000)
*   .forEach(System.out::println);

   -map()
   Permite transformar cada elemento em outra informação

*  products.stream().map(p -> p.getName())
*  .forEach(System.out::println);

   Também poderíamos escrever:

*  products.stream().map(Product::getName)
*  .forEach(System.out::println);

   -sorted()
   Permite ordenar os elementos do fluxo.

*  products.stream().sorted(Comparator.comparing(Product::getPrice))
*  .forEach(System.out::println);

   !Existe um detalhe interessante: as operações intermediárias são executadas de maneira lazy (preguiçosa). Isso significa que elas não processam imediatamente os elementos.

*   products.stream().filter(p -> p.getPrice() > 1000).map(Product::getName);

   Nesse código, você declarou operações, mas não existe uma operação terminal, portanto, o processamento não é executado.

-Principais operações do Stream Terminais
   São operações responsáveis por finalizar o processamento de um Stream, executando as operações intermediárias e produzindo um resultado, como uma impressão, um valor ou uma coleção.

   -forEach()
   Percorrer os elementos do Stream e executar uma ação para cada um deles.

*  products.stream()
*  .forEach(System.out::println);

   -count()
   Contar a quantidade de elementos existentes no Stream.

*  long total = products.stream().filter(p -> p.getPrice() > 200)
*  .count();

   -collect()
   Reunir os elementos processados pelo Stream em uma estrutura de dados, como uma lista, um conjunto ou um mapa.
   É especialmente útil quando queremos obter uma nova coleção após filtrar ou transformar elementos.

*  List<Product> filtered = products.stream().filter(p -> p.getPrice() > 200)
*  .collect(Collectors.toList()); 

   -toList()
   Reunir os elementos do Stream em uma nova lista, é uma maneira mais simples de obter uma List a partir de um Stream.
   !Uma diferença importante em relação a Collectors.toList() é que a lista produzida por Stream.toList() é não modificável.

*  List<String> names = products.stream().map(Product::getName)
*  .toList();





-  Interface funcional	   Operação Stream	O que faz
   Predicate<T>	         filter()	         Avalia uma condição
   Function<T, R>	         map()	            Transforma um elemento
   Consumer<T>	            forEach()	      Recebe e consome um elemento
   Comparator<T>	         sorted()	         Compara elementos
*/ 
}
