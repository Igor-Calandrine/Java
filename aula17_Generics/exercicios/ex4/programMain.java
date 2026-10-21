package aula17_Generics.exercicios.ex4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class programMain {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

Produto produto = new Produto("Geleia", 20.50, LocalDate.parse("20/10/2020", format));

System.out.println(produto);






input.close();
}
}
