package aula17_Generics.exercicios.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class mainProgram {
public static void main(String[] args) {
   
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);

List<Caixa<Integer>> listaNumeros = new ArrayList<>();
List<Caixa<String>> listaString = new ArrayList<>();

Caixa<Integer> caixaI1 = new Caixa<>(100);
Caixa<String> caixaS1 = new Caixa<>("Nome");

listaNumeros.add(caixaI1);
listaString.add(caixaS1);


if(listaNumeros.isEmpty()) {
System.out.println("Lista vazia");
} 
else {
   for (Caixa<Integer> e : listaNumeros) { 
      System.out.println(e.toString() );
   }
}

if(listaString.isEmpty()) {
System.out.println("Lista vazia");
}
else {
   for (Caixa<String> e : listaString) {
      System.out.println(e.toString());
   }
   
}



input.close();
}
}