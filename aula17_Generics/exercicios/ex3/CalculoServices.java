package aula17_Generics.exercicios.ex3;

import java.util.List;

public class CalculoServices {

   public static <Type extends Comparable<Type>> Type maior(List<Type> lista) {
      if (lista.isEmpty()) {
         throw new IllegalArgumentException("Lista vazia");
      }
      Type itemMaior = lista.get(0);

      for (Type e : lista) {
         if (e.compareTo(itemMaior) > 0) {
            itemMaior = e;
         }
      }
      return itemMaior;
   }

   public static <Type extends Comparable<Type>> Type menor(List<Type> lista) {
      if (lista.isEmpty()) {
         throw new IllegalArgumentException("Lista vazia");
      }
      Type itemMenor = lista.get(0);

      for (Type e : lista) {
         if (e.compareTo(itemMenor) < 0) {
            itemMenor = e;
         }
      }

      return  itemMenor;
   }


}
