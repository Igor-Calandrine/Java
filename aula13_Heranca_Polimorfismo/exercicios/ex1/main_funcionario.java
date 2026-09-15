package aula13_Heranca_Polimorfismo.exercicios.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula13_Heranca_Polimorfismo.exercicios.ex1.entidades.Funcionario;
import aula13_Heranca_Polimorfismo.exercicios.ex1.entidades.FuncionarioTercerizado;

public class main_funcionario {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);
List<Funcionario> funcionarios = new ArrayList<>();

String continuar = "N";

do {
   limparTerminal();
   System.out.printf("===Registro de Funcionários===");
   System.out.printf("\nNome: ");
   String nome = input.nextLine();
   System.out.printf("Horas: ");
   int horas = input.nextInt();
   input.nextLine();
   System.out.printf("Valor/Hora: ");
   Double valorHora = input.nextDouble();
   input.nextLine();
   System.out.printf("Funcionário Tercerizado? (S/N): ");
   String tipoFuncionario = input.nextLine().substring(0, 1);

   if (tipoFuncionario.equalsIgnoreCase("N")) {
      Funcionario funcionario = new Funcionario(nome, horas, valorHora);
      funcionarios.add(funcionario);
      limparTerminal();
   }
   else {
      System.out.printf("Adicional: ");
      Double adicional = input.nextDouble();
      input.nextLine();
      Funcionario funcionario = new FuncionarioTercerizado(nome, horas, valorHora, adicional);
      funcionarios.add(funcionario);
      limparTerminal();
   }

   System.out.printf("Cadastrar novo funcionário? (S/N): ");
   continuar = input.nextLine().substring(0, 1);

} while (continuar.equalsIgnoreCase("S"));

limparTerminal();
for (Funcionario e : funcionarios) {
   System.out.printf("%s", e.funcionarioEstatus());
   System.out.printf("\nRemuneração: %s", e.remuneracao());
   System.out.printf("\n\n");
}

input.close();
}
public static void limparTerminal() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
}  
}
