package aula12_Composicao;

public class aula12p2 {
public static void main(String[] args) {
/*
-Composição
   A composição em Java é um relacionamento entre classes em que uma classe possui um objeto de outra classe como atributo, criando uma relação de “tem um” (has-a). Ela é usada para dividir um sistema em objetos menores e especializados, permitindo que cada classe tenha uma responsabilidade bem definida.
   
   A composição é especialmente útil quando queremos evitar colocar muitas responsabilidades dentro de uma única classe. Em vez de criar uma classe enorme, podemos dividir o sistema em várias classes e conectá-las por meio de objetos. Isso torna o código mais organizado, reutilizável e fácil de manter.

   Um ponto importante é que composição não é a mesma coisa que herança. Na herança temos uma relação “é um” (is-a), enquanto na composição temos uma relação “tem um” (has-a). Por exemplo, um Cachorro pode ser um Animal, enquanto um Carro tem um Motor.

   Ex:

   public class Motor {
      public void ligar() {
         System.out.println("Motor ligado!");
      }
}

*   public class Carro {
*      private Motor motor;
*
*      public Carro() {
*         this.motor = new Motor();
*      }
*
*      public void ligarCarro() {
*         motor.ligar();
*         System.out.println("Carro ligado!");
*      }
*   }


*/ 





}
}
