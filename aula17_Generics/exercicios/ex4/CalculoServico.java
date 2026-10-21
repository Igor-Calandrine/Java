package aula17_Generics.exercicios.ex4;

import java.util.List;

public class CalculoServico {

   public static <Type extends Comparable<Type>> Type maior(List<Type>lista) {
      if (lista.isEmpty()) {
         throw new RuntimeException("Lista vazia");
      }
      Type maior = lista.get(0);

      for (Type e : lista) {
         if(e.compareTo(maior) > 0) {
            maior = e;
         } 
      }

      return maior;
   }

   public static <Type extends Comparable<Type>> Type menor(List<Type> lista) {
      if (lista.isEmpty()) {
         throw new RuntimeException("Lista vazia");
      }
      Type menor = lista.get(0);

      for (Type e : lista) {
         if (e.compareTo(menor) < 0) {
            menor = e;
         }
      }

      return menor;
   }

   public static <Type extends Produto> Type maiorCoisa(List<Type> lista, Criterio criterio) {
      if (lista.isEmpty()) {
         throw new RuntimeException("Lista vazia");
      }
      Type menor = lista.get(0);

      for (Type e : lista) {
         if(e.comparar(menor, criterio) > 0) {
            menor = e;
         }
      }
      
      return menor;
   }

   public static <Type extends Produto> Type menorCoisa(List<Type> lista, Criterio criterio) {
      if (lista.isEmpty()) {
         throw new RuntimeException("Lista vazia");
      }
      Type menor = lista.get(0);

      for (Type e : lista) {
         if(e.comparar(menor, criterio) < 0) {
            menor = e;
         }
      }
      
      return menor;
   }


}
