package aula14_Excecoes;

public class aula14p1 {
/*
-Tratamento de Exceções
   O tratamento de exceções em Java é importante porque permite que o programa reaja a situações inesperadas sem simplesmente encerrar a execução de forma abrupta.

   Sua estrutura é da seguinte forma

*  try {
      código que pode gerar uma exceção
*  } catch (Exception e) {
      tratamento
*  } finally {
      executado ao final independente de ter ocorrido erro ou não
*  }

-Catch
   Uma coisa muito importante, é que você pode tratar diferentes tipos de exceção.
   Isso é melhor do que simplesmente capturar qualquer coisa, Porque você perde informação sobre qual problema realmente aconteceu, como no exemplo abaixo:

*  catch (Exception e) {
*     System.out.println("Deu algum problema.");
*  }

-Throw e Throws

   -throw
      Usado para lançar uma exceção manualmente:

   if (idade < 18) {
      throw new IllegalArgumentException("Idade inválida.");
   }

   -throws
      Usado na declaração do método para indicar que ele pode lançar determinada exceção:

   public void lerArquivo() throws IOException {
   }

-Checked e Unchecked Exceptions

   -Unchecked
      São exceções que herdam de RuntimeException, o compilador não obriga você a tratá-las.
      *Exemplo:
         ArithmeticException
         NullPointerException
         IndexOutOfBoundsException
         NumberFormatException
         IllegalArgumentException

   -Checked
      São exceções que o compilador exige que você trate ou declare.
      *Exemplo:
         requisições HTTP podem falhar
         bancos de dados podem ficar indisponíveis
         registros podem não existir
         arquivos podem não ser encontrados
         dados podem estar em formato incorreto
         serviços externos podem retornar erros

*/ 
}

