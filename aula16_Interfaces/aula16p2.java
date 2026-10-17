package aula16_Interfaces;

public class aula16p2 {
public static void main(String[] args) {
/*
-Comparable<T>
   A interface Comparable<T> faz parte da biblioteca padrão do Java e define um contrato para estabelecer uma ordem natural entre os objetos de uma classe.

   A letra T representa um tipo genérico. Nesse caso, ao escrever Comparable<Produto>, estamos indicando que os objetos da classe Produto serão comparados entre si.

   Quando uma classe implementa essa interface, ela assume a responsabilidade de definir como seus objetos devem ser comparados. Para isso, é necessário implementar o método 

      *compareTo() 

   que determina o critério utilizado na comparação.

   O método compareTo() é utilizado em Java para comparar dois objetos e determinar a ordem entre eles. Essa comparação em seu retorno (int) permite identificar se um objeto considerado é: 
   
      *menor - negativo
      *maior - positivo
      *igual - zero

   a outro, de acordo com um critério previamente definido.

-Aplicação Prática
   A combinação da interface Comparable<T> com o método compareTo() é especialmente útil ao trabalhar com coleções de objetos. Quando definimos uma ordem natural para uma classe, podemos utilizar recursos de ordenação do Java, como Collections.sort() ou List.sort(), para organizar seus elementos conforme o critério estabelecido.


-Exemplo

*Classe
public class Produto implements Comparable<Produto> {

   private String nome;
   private double preco;

   public Produto(String nome, double preco) {
      this.nome = nome;
      this.preco = preco;
   }

   @Override
   public int compareTo(Produto outro) {
      return Double.compare(this.preco, outro.preco);
   }

}

*MainProgram
List<Produto> produtos = new ArrayList<>();

produtos.add(new Produto("Notebook", 3500.00));
produtos.add(new Produto("Mouse", 80.00));
produtos.add(new Produto("Teclado", 150.00));

Collections.sort(produtos);

for (Produto e : produtos) {
   System.out.printf("\s - R$ %.2f\n", e.getNome(), e.getPreco());
}

-Como acontece a ordenação?
   *1. Criamos uma lista de produtos
   *2.Collections.sort(produtos) solicita a ordenação
   *3.O Java utiliza o compareTo() para comparar os produtos afim de realizar a ordenação
   *4.A lista fica ordenada pelo preço

   Se quiséssemos ordenar os produtos pelo nome em vez do preço, poderíamos mudar a implementação do compareTo() para comparar os atributos nome. Assim, a interface Comparable<T> permite que cada classe estabeleça sua própria ordem natural.



*/   


}
}
