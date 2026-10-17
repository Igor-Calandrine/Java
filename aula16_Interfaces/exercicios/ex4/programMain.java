package aula16_Interfaces.exercicios.ex4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programMain {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in); 

String path = "aula16_Interfaces\\exercicios\\ex4\\funcionarios.txt";
List<Funcionario> funcionarioList = new ArrayList<>();

try (BufferedReader br = new BufferedReader(new FileReader(path))) {
   String line = br.readLine();

   while(line != null) {
      int indexSeparador = line.indexOf(",");
      String nome = line.substring(0, indexSeparador).trim();
      Double salario = Double.parseDouble(line.substring(indexSeparador + 1).trim());

      Funcionario funcionario = new Funcionario(nome, salario);

      funcionarioList.add(funcionario);

      line = br.readLine();
   }
} catch (IOException e) {
   System.err.println(e.getMessage());
}

Collections.sort(funcionarioList);

for (Funcionario e : funcionarioList) {
   System.out.println(e.toString());
}

input.close();
}
}
