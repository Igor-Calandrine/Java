package aula14_Excecoes;

public class aula14p2 {
/*
-Boas Práticas
   É uma boa prática capturar exceções específicas, sempre que possível, em vez de utilizar simplesmente Exception, podemos tratar tipos específicos, como IOException, NumberFormatException ou IllegalArgumentException. 
   Dessa forma, o programa consegue reagir de maneira diferente para cada tipo de problema.

   Uma boa prática no desenvolvimento Java é separar a responsabilidade de lançar uma exceção da responsabilidade de tratá-la. A classe que identifica que uma situação inválida aconteceu pode ser responsável por lançar a exceção, enquanto outra camada do programa pode ser responsável por tratá-la.

   O throw é utilizado quando queremos lançar uma exceção naquele ponto específico do código. Ele normalmente aparece junto de uma condição que identifica uma situação inválida.

*   if (valor < 0) {
*   throw new IllegalArgumentException("O valor não pode ser negativo.");
*   }

   O throws é utilizado na assinatura de um método para informar que aquele método pode lançar determinada exceção.

*   public void sacar(double valor) throws IllegalArgumentException { 
*      if (valor > saldo) { 
*         throw new IllegalArgumentException("Saldo insuficiente."); 
*      } 
*   }

-Exceções Personalizadas
   Uma prática interessante é criar classes de exceção próprias, principalmente quando o sistema possui regras específicas de negócio. Dessa forma, podemos criar uma exceção que represente claramente determinado problema.
   Imagine que seu sistema tenha várias regras:

      Depósito inválido
      Saldo insuficiente
      Conta inexistente
      Cliente não encontrado
      Valor de saque inválido

   Você poderia usar Exception, IllegalStateException, etc., mas todas essas situações acabam ficando misturadas.
   Você pode criar uma classe:

*   public class SaldoInsuficienteException extends Exception { 
*      public SaldoInsuficienteException(String mensagem) { 
*         super(mensagem); 
*      } 
*   }

   Sua classe passa a ser uma exceção porque herda de Exception.
   Na Conta:

*   public void retirada(double valor) throws SaldoInsuficienteException {
*
*     if (valor > saldo) {
*        throw new SaldoInsuficienteException("Saldo insuficiente.");
*     }
*     saldo -= valor;
*   }

   E o catch também pode ser específico:

*   try {
*      conta1.retirada(600.0);
*   } catch (SaldoInsuficienteException e) {
*      System.out.println(e.getMessage());
*   }

-Outro Caso
   Se sua exceção personalizada herdasse de RuntimeException:

   public class ValorMaiorQueLimite extends RuntimeException {
   }

   aí não seria obrigatório colocar throws:

   public void retirada(Double retirada) {
      if (retirada > limiteRetirada) {
         throw new ValorMaiorQueLimite("Valor acima do limite.");
      }
   }

-Qualquer caso nao previsto
   Ela é mais usada para falhas em tempo de execução que não precisam ser obrigatoriamente declaradas pelo método, frequentemente relacionadas a argumentos inválidos, estado inadequado ou erros de programação.

   catch (RuntimeException e) {
      System.out.println("Erro inesperado")
   }
*/ 
}
