package aula13_Heranca_Polimorfismo;

public class aula13p3 {
public static void main(String[] args) {
/*
-@Override
   Quando trabalhamos com Herança em Java, uma classe filha pode receber atributos e métodos de uma classe pai. Porém, em algumas situações, o comportamento herdado não é exatamente o que queremos para a subclasse.

   Imagine uma classe Animal que possui um método makeSound()

   class Animal { 
      public void makeSound() { 
         System.out.println("Som de animal"); 
      } 
   }

   Uma classe Dog pode herdar de Animal
   Nesse caso, Dog possui o método makeSound() porque o herdou de Animal. Porém, podemos querer que um cachorro tenha um comportamento específico:

   class Dog extends Animal { 
*      @Override 
*      public void makeSound() { 
*         System.out.println("Au au!"); 
*      }
   }

   O método continua tendo o mesmo nome e a mesma assinatura, mas seu comportamento foi redefinido pela subclasse.

-Boa prática
   Ele também ajuda o programador e o compilador a identificarem erros, se o método da classe pai se chama makeSound(), e escrevemos makesound(), o Java perceberá que não existe um método correspondente para sobrescrever e apresentará um erro.

   Sem o @Override, esse código poderia simplesmente ser interpretado como um novo método da classe filha, por isso o @Override funciona também como uma espécie de verificação de segurança.

-Super e @Override
   Podemos pensar que @Override está relacionado à redefinição de um comportamento, enquanto super está relacionado ao acesso ao comportamento original da classe pai.

   Agora imagine que não queremos simplesmente substituir o comportamento original, queremos aproveitar o comportamento da classe pai e acrescentar algo a ele.

*      @Override 
*      public void makeSound() { 
*         super.makeSound();
*         System.out.println("Au au!"); 
*      }

   O resultado será:
      Som de animal
      Au au!

*/ 


}
}
