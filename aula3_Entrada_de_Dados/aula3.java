package aula3_Entrada_de_Dados;

public class aula3 {
   
   public static void main(String[] args) {
      /*
      A forma mais comum de fazer entrada de dados em Java é utilizando a classe Scanner, que pertence ao pacote 
         
        *import java.util.Scanner;

        *Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        *String nome = entrada.nextLine();

        *entrada.close();

        Na maioria dos casos o entrada.close() fica no final do programa. Isso acontece porque, depois que você fecha o Scanner, não é mais possível utilizá-lo.

        Depois, cada método lê um tipo de dado:

         next()            Uma única palavra       Júlia
         nextLine()        Uma linha inteira       Júlia Almeida Silva
         nextInt()         Inteiro                 25
         nextFloat()       Decimal (float)         1.75
         nextDouble()      Decimal (double)        1.75
         nextBoolean()     Booleano                true

   -Observação importante
      Ao misturar nextInt(), nextFloat(), nextDouble(), etc., com nextLine(), é comum ocorrer um problema porque esses métodos deixam o caractere de quebra de linha (\n) no buffer. 
      
      Nesses casos, costuma-se usar um 
      
         *entrada.nextLine(); 
      
      extra para consumir essa quebra de linha antes de chamar outro nextLine(). Esse é um dos erros mais comuns para quem está começando em Java.


      System.out.print("Digite sua idade: ");
      int idade = entrada.nextInt();

      ! limpa o Enter pendente
*      entrada.nextLine(); 

      System.out.print("Digite seu nome: ");
      String nome = entrada.nextLine();

      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);

      !O printf() apenas exibe dados na tela. Ele não participa da leitura do teclado, então ele nunca vai causar esse problema do \n no buffer.

   -Não é recomendado
      Criar vários Scanner para o mesmo System.in:

      Scanner entrada1 = new Scanner(System.in);
      Scanner entrada2 = new Scanner(System.in);
      Scanner entrada3 = new Scanner(System.in);

      Isso pode causar problemas, porque todos estão tentando ler da mesma entrada (o teclado). Além disso, se um deles executar close(), o System.in será fechado e os outros deixarão de funcionar corretamente.
      */ 

   
   }

}
