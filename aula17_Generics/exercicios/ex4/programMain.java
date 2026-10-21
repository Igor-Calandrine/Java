package aula17_Generics.exercicios.ex4;

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
List<Produto> listaProduto = new ArrayList<>();

Produto produto1 = new Produto("Geleia", 20.50, LocalDate.parse("10/10/2020", format));
Produto produto2 = new Produto("Requeijão", 15.50, LocalDate.parse("10/10/2020", format));
Produto produto3 = new Produto("Iogurte", 10.50, LocalDate.parse("20/10/2020", format));

listaProduto.add(produto1);
listaProduto.add(produto2);
listaProduto.add(produto3);

if (listaProduto.isEmpty()) {
      input.close();
      throw new RuntimeException("Lista vazia");
   }

for (Produto e : listaProduto) {
   System.out.println(e);
}

System.out.println("===Maior===");
System.out.println(CalculoServico.maior(listaProduto));
System.out.println("===Menor===");
System.out.println(CalculoServico.menor(listaProduto));


System.out.println("===Maior Delimitado===");
System.out.println(CalculoServico.menorCoisa(listaProduto, Criterio.PRECO));
System.out.println(CalculoServico.menorCoisa(listaProduto, Criterio.FABRICADO));






input.close();
}
}
