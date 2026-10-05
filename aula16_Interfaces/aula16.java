package aula16_Interfaces;

public class aula16 {
public static void main(String[] args) {
/*
-Interfaces
   Uma interface em Java serve para definir um conjunto de métodos que uma classe deve implementar, estabelecendo um contrato que determina quais comportamentos essa classe precisa oferecer

   Imagine que estamos desenvolvendo um sistema bancário. Nele, podemos ter diferentes formas de pagamento, como cartão de crédito, Pix e boleto bancário. Embora cada forma de pagamento funcione de maneira diferente, todas precisam oferecer uma operação para realizar o pagamento

   Podemos criar uma interface chamada Pagamento para estabelecer esse contrato. Assim, todas as classes que implementarem essa interface deverão fornecer sua própria implementação do método de pagamento

   *Interface ---> Cartão
   *          ---> Pix
   *          ---> Boleto
   
-Vantagens 
   As interfaces ajudam a organizar o código, reduzir o acoplamento entre classes e facilitar a expansão de um sistema. Imagine que, futuramente, seja necessário adicionar uma nova forma de pagamento. Se o sistema estiver organizado utilizando uma interface, podemos criar uma nova classe que implemente Pagamento, sem precisar modificar toda a estrutura existente

   As principais vantagens são:
   *Padronização: classes diferentes seguem um contrato comum.
   *Polimorfismo: objetos de classes diferentes podem ser tratados por meio do mesmo tipo de interface.
   *Flexibilidade: podemos adicionar novas implementações sem depender de uma única classe concreta.
   *Manutenção: facilita a organização e a evolução do sistema.

-Implementando
   Primeiro, criamos a interface utilizando a palavra-chave interface
   Nesse exemplo, a interface Pagamento estabelece que qualquer classe que a implemente deverá possuir o método pagar().
   ?Observe que em vez de implementar uma class será implementado uma interface

*  public interface Pagamento {

*     void pagar(Double valor);

*  }


   Depois, uma classe implementa essa interface utilizando implements
   A classe Pix agora é obrigada a implementar o método definido pela interface. O @Override indica que estamos implementando um método que foi declarado na interface

*  public class Pix implements Pagamento {

*     @Override
*     public void pagar(Double valor) {
*     System.out.printf("Pagamento de R$ %.2f realizado via Pix.%n", valor);
*     }

*  }

   A classe Pix agora é obrigada a implementar o método definido pela interface. O @Override indica que estamos implementando um método que foi declarado na interface.

*  public class Produto implements Vendavel, Tributavel {
*  }

-Detalhes Importantes
   
   *Interface não é uma classe
      Uma interface é um tipo diferente de estrutura do Java, portanto, ela não é utilizada para criar objetos diretamente
      Quem pode ser instanciada é uma classe concreta que implementa a interface

   *Interface por padrão são public abstract
      Por isso, a classe que implementa a interface precisa fornecer o método como public

      @Override
      public void pagar() {
         // implementação
      }

      Você não pode diminuir a visibilidade para protected ou private.

   *Interface pode ser usada como tipo
      A variável é do tipo Pagamento, mas o objeto é um Pix.

      List<Pagamento> pagamentos = new ArrayList<>();
      pagamentos.add(new Pix());
      pagamentos.add(new Cartao());
      pagamentos.add(new Boleto());

   *Interfaces podem ter default e static
      Interfaces modernas do Java podem possuir métodos com implementação.

   *Interfaces também podem possuir constantes
      Campos declarados em uma interface são, por padrão, public, static e final.



*/ 
}  
}
