package aula1_Variaveis;

public class aula1 {
public static void main() {
/*
Em Java para declarar uma variável deve-se utilizar:
tipo nomeDaVariavel = valor
   
Como tipos temos:

 *Armazena números inteiros
byte = 1 byte (8 bits) -128 a 127
short = 2 bytes -32.768 a 32.767
int = 4 bytes -2 bilhões a +2 bilhões
long = 8 bytes

 *Armazena números flutuantes
float = 4 bytes
double = 8 bytes
Por padrão todo tipo é double por ser mais preciso, para declarar um float deve-se utilizar um f minúsculo no final do número o declarar no início.
   
float nome = 2.222f
float nome = (float) 2.222
   
*Armazena um único caractere Unicode
   char
   
*Armazena grupos de caracteres Unicode, palavras, frases
   String

*Armazena valores true e false
   boolean

-Casting
   As vezes é necessário converter os tipos de variáveis

   Ex: 
   int a = 5
   int b = 2
   
   a/b -> terpa como resultado 2, pois as duas variáveis são inteiras. Para termos um resultado com vírgula, é necessário realizar o Casting, ou seja, um conversão

   (double) a/b -> teremos como resultado 2.5

   Podemos também transformar para um tipo inteiro

   a = 5.67
   b = (int) a

   Assim teremos b = 5

-Parsing
   *String -> int
      Integer.parseInt()
   *String -> float
      Float.parseFloat()
   *String -> double
      Double.parseDouble()
   *String -> boolena
      Boolean.parseBoolean()
   *tipo   -> String
      String.valueOf()
   

-Tipos Wrapper
   Wrapper são classes que representam os tipos primitivos do Java como objetos. Isso é importante porque algumas estruturas e recursos do Java trabalham apenas com objetos. 
   O Wrapper pode representar null

*  Primitivo	   Wrapper
   byte	         Byte
   short	         Short
   int	         Integer
   long	         Long
   float	         Float
   double	      Double
   char	         Character
   boolean	      Boolean

-Autoboxing
   O Java consegue transformar automaticamente o primitivo em Wrapper:

*   int numero = 10;
*   Integer valor = numero;

-Unboxing
   O contrário também acontece:

*   Integer valor = 10;
*   int numero = valor;

*/

   }
}
