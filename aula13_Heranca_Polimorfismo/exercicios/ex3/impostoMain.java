package aula13_Heranca_Polimorfismo.exercicios.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula13_Heranca_Polimorfismo.exercicios.ex3.entidades.Contribuiente;
import aula13_Heranca_Polimorfismo.exercicios.ex3.entidades.PessoaFisica;
import aula13_Heranca_Polimorfismo.exercicios.ex3.entidades.PessoaJuridica;

public class impostoMain {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);
List<Contribuiente> listaContribuiente = new ArrayList<>();
int opcao = 4;

do {
   limparTerminal();
   System.out.printf("===MENU CONTRIBUINTE===");
   System.out.printf("\n1.Cadastro Pessoa Física");
   System.out.printf("\n2.Cadastro Pesoa Jurídica");
   System.out.printf("\n3.Listar Contribuintes");
   System.out.printf("\n4.Finalizar Programa");
   System.out.printf("\nOpção: ");
   opcao = input.nextInt();
   input.nextLine();

   switch (opcao) {
      case 1: {
         limparTerminal();
         System.out.printf("Nome: ");
         String nome = input.nextLine();
         System.out.printf("Renda Anual: ");
         Double rendaAnual = input.nextDouble();
         input.nextLine();
         System.out.printf("Gasto com Saúde: ");
         Double gastoSaude = input.nextDouble();
         input.nextLine();
         Contribuiente contribuiente = new PessoaFisica(nome, rendaAnual, gastoSaude);
         listaContribuiente.add(contribuiente);
         break;
      }
      case 2: {
         limparTerminal();
         System.out.printf("Nome: ");
         String nome = input.nextLine();
         System.out.printf("Renda Anual: ");
         Double rendaAnual = input.nextDouble();
         input.nextLine();
         System.out.printf("Quantidade de Funcionários: ");
         Integer qntFuncionarios = input.nextInt();
         input.nextLine();
         Contribuiente contribuiente = new PessoaJuridica(nome, rendaAnual, qntFuncionarios);
         listaContribuiente.add(contribuiente);
         break;
      }
      case 3: {
         limparTerminal();
         for(Contribuiente e : listaContribuiente) {
            System.out.printf("%s", e.estatusContribuinte());
            System.out.printf("\n");
         }
         System.out.printf("\nDigite uma tecla para voltar ao menu anterior");
         input.nextLine();

         break;
      }
      case 4: {
         System.out.printf("\nFinalizando o programa");
         break;
      }
   
      default:
         System.out.printf("Opção inválida");
         break;
   }
   
} while (opcao != 4);

input.close();
}
public static void limparTerminal() {
   System.out.print("\033[H\033[2J");
   System.out.flush();
}
}
