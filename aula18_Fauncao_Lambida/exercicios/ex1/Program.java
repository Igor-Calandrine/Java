package aula18_Fauncao_Lambida.exercicios.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program {
public static void main(String[] args) {
Locale.setDefault(Locale.US);

List<Funcionario> listaFuncionario = new ArrayList<>();

Funcionario func1 = new Funcionario("Carlos", 3500.00, 28);
Funcionario func2 = new Funcionario("Ana", 5200.00, 35);
Funcionario func3 = new Funcionario("Bruno", 2800.00, 22);
Funcionario func4 = new Funcionario("Daniela", 6100.00, 41);
Funcionario func5 = new Funcionario("Eduardo", 4500.00, 30);

listaFuncionario.add(func1);
listaFuncionario.add(func2);
listaFuncionario.add(func3);
listaFuncionario.add(func4);
listaFuncionario.add(func5);

for (Funcionario e : listaFuncionario) {
   System.out.println(e);
}

Comparator<Funcionario> listaPorNome = (x, y) -> x.getNome().toUpperCase().compareTo(y.getNome().toUpperCase());
listaFuncionario.sort(listaPorNome);

System.out.println("===Lista por Nome===");
for (Funcionario e : listaFuncionario) {
   System.out.println(e);
}

Comparator<Funcionario> listaPorSalario = Comparator.comparing(Funcionario::getSalario).reversed();
listaFuncionario.sort(listaPorSalario);

System.out.println("===Lista por Salario===");
for (Funcionario e : listaFuncionario) {
   System.out.println(e);
}

Comparator<Funcionario> listaPorIdade = Comparator.comparing(Funcionario::getIdade);
listaFuncionario.sort(listaPorIdade);

System.out.println("===Lista por Idade===");
listaFuncionario.forEach(System.out::println);


}
}
