package aula13_Heranca_Polimorfismo.exercicios.ex2;

import java.util.Locale;
import java.time.LocalDate;

import aula13_Heranca_Polimorfismo.exercicios.ex2.entidades.Produto;
import aula13_Heranca_Polimorfismo.exercicios.ex2.entidades.ProdutoImportado;
import aula13_Heranca_Polimorfismo.exercicios.ex2.entidades.ProdutoUsado;

public class mainProduto {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
   
Produto p1 = new Produto("Pera", 5.99);
Produto pi1 = new ProdutoImportado("Maça", 8.99, 10.0);
Produto pu1 = new ProdutoUsado("Porta", 115.0, LocalDate.parse("2021-07-03"));

System.out.printf("%s", p1.produtoString());
System.out.printf("%s", pi1.produtoString());
System.out.printf("%s", pu1.produtoString());



}
}
