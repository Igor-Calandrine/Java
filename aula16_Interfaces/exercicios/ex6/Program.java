package aula16_Interfaces.exercicios.ex6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
public static void main(String[] args) {

String path = "aula16_Interfaces\\exercicios\\ex6\\arquivo.txt";
Map<String, Integer> candidatos = new HashMap<>();
   
try (BufferedReader br = new BufferedReader(new FileReader(path))) {
   String line = br.readLine();


   while (line != null) {
      int iSeparador = line.indexOf(",");

      String nome = line.substring(0, iSeparador).trim();
      Integer votos = Integer.parseInt(line.substring(iSeparador + 1).trim());

      if (candidatos.containsKey(nome)) {
         int votosAtuais = candidatos.get(nome);
         candidatos.put(nome, votosAtuais + votos);
      } else {
         candidatos.put(nome, votos);
      }
      // candidatos.merge(nome, voto, Integer::sum);

      line = br.readLine();
   }
} catch (IOException e) {
   e.getMessage();
}

System.out.println(candidatos);

}
}
