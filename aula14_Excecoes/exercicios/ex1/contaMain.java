package aula14_Excecoes.exercicios.ex1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import aula14_Excecoes.exercicios.ex1.modeloEntidade.Conta;
import aula14_Excecoes.exercicios.ex1.modeloException.ValorMaiorQueLimite;
import aula14_Excecoes.exercicios.ex1.modeloException.ValorMaiorQueSaldo;

public class contaMain {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);

Conta conta = new Conta(155533, "Igor", 2000.0, 300.0);

System.out.printf("\n===Menu Conta====");
System.out.printf("\n1.Cadastro de Conta");
System.out.printf("\n2.Depósito");
System.out.printf("\n3.Saque");
System.out.printf("\n4.Dados da Conta");
System.out.printf("\n5.Encerrar Programa");
System.out.printf("\nOpção: ");
int opcao = input.nextInt();
input.nextLine();

switch (opcao) {
   case 1:{
      System.out.printf("\nNome: ");
      String nome = input.nextLine();
      System.out.printf("\nDepósito Inicial: ");
      Double depositoInicial = Math.abs(input.nextDouble());
      input.nextLine();
      conta = new Conta(155533, nome, depositoInicial, 300.0);
      break;
   }
   case 2:{
      try {
         System.out.printf("\nDepósito: ");
         Double deposito = Math.abs(input.nextDouble());
         input.nextLine();
         conta.deposito(deposito);
      } catch (InputMismatchException e){
         System.out.printf("\nDigite números");
      }
      break;
   }
   case 3: {
      try {
      System.out.printf("\nSaque: ");
      Double saque = Math.abs(input.nextDouble());
      input.nextLine();
      conta.retirada(saque);
      } catch (ValorMaiorQueLimite e) {
         System.out.printf("\n%s", e.getMessage());
      } catch (ValorMaiorQueSaldo e) {
         System.out.printf("\n%s", e.getMessage());
      } catch (InputMismatchException e) {
         System.out.printf("\nDigite números", e.getMessage());
      }
      break;
   }
   case 4: {
      System.out.printf("\n%s", conta.toString());
      break;
   }  

   default:
      System.out.printf("Opção Inválida");
      break;
}




input.close();
}
}
