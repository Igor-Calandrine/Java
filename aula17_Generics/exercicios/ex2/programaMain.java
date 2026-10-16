package aula17_Generics.exercicios.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programaMain {
public static void main(String[] args) {
   
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);

List<DadosPessoa<String>> listaNomes = new ArrayList<>();
List<DadosPessoa<Integer>> listaIdadade = new ArrayList<>();

String path = "aula17_Generics\\exercicios\\ex2\\dados.txt";

try (BufferedReader br = new BufferedReader(new FileReader(path))) {
   String line = br.readLine();
   String nome = null;
   Integer idade = null;
   
   while (line != null) {
      int indexSeparador = line.indexOf(",");
      nome = line.substring(0, indexSeparador);
      idade = Integer.parseInt(line.substring(indexSeparador + 1).trim());

      DadosPessoa<String> nomePessoa = new DadosPessoa<>(nome);
      DadosPessoa<Integer> idadePessoa = new DadosPessoa<>(idade);

      listaNomes.add(nomePessoa);
      listaIdadade.add(idadePessoa);

      line = br.readLine();
   }

} catch (IOException e) {
   System.out.println(e.getMessage());
}

try {
   if (listaNomes.isEmpty()) {
      System.out.println("Lista vazia");
   }
   else {
      for (DadosPessoa<String> e : listaNomes) {
         System.out.println(e.toString());
      }
   }
} catch (RuntimeException e) {
   e.printStackTrace();
}


if(listaIdadade.isEmpty()) {
   System.out.println("Lista vazia");
} 
else {
   for(DadosPessoa<Integer> e : listaIdadade) {
      System.out.println(e.toString());
   }
}

input.close();
}
}
