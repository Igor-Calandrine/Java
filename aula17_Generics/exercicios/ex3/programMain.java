package aula17_Generics.exercicios.ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programMain {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
List<Produto> produtoLista = new ArrayList<>();
String path = "aula17_Generics\\exercicios\\ex3\\produtos.txt";

try (BufferedReader br = new BufferedReader(new FileReader(path))) {
   String linha = br.readLine();

   while (linha != null) {
      int separador1 = linha.indexOf(",");
      int separador2 = linha.indexOf(",", separador1 + 1);

      String nome = linha.substring(0, separador1);
      Double preco = Double.parseDouble(linha.substring(separador1 + 1, separador2));
      LocalDate vencimento = LocalDate.parse(linha.substring(separador2 + 1), format);

      Produto produto = new Produto(nome, preco, vencimento);
      produtoLista.add(produto);

      linha = br.readLine();
   }
} catch (IOException e) {
   System.err.println(e);
}

for (Produto e : produtoLista) {
   System.out.println(e);
   System.out.println("");
}


System.out.println("==Resultado Maior==");
Produto resultaoMaior = CalculoServices.maior(produtoLista);
System.out.println(resultaoMaior);

System.out.println("==Resultado Menor==");
Produto resultadoMenor = CalculoServices.menor(produtoLista);
System.out.println(resultadoMenor);

input.close();
}
}
