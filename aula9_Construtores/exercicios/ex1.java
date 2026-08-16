package aula9_Construtores.exercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import aula9_Construtores.exercicios.classes.Usuario;

public class ex1 {
/*
Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo). 
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre 
mostrando os dados da conta após cada operação.
*/ 

public static void main(String[] args) {

Locale.setDefault(Locale.US);
Random random = new Random();
Scanner input = new Scanner(System.in);

Usuario usuario1 = null;
int menuEscolha;

do {
   System.out.printf("\n" + "-".repeat(20));
   System.out.printf("\nMenu Opções");
   System.out.printf("\n" + "-".repeat(20));
   System.out.printf("\n1. Cadastro Conta");
   System.out.printf("\n2. Saldo Conta");
   System.out.printf("\n3. Depósito Conta");
   System.out.printf("\n4. Saque Conta");
   System.out.printf("\n5. Atualizar Cadastro");
   System.out.printf("\n6. Finalizar Menu");
   System.out.printf("\n   Opção: ");

   menuEscolha = input.nextInt();
   input.nextLine();

   switch (menuEscolha) {
      case 1:
         System.out.printf("Digite o nome do usuário: ");
         String nome = input.nextLine();
         System.out.printf("Digite a sua senha: ");
         String pass = input.nextLine();
         
         double depoInicial = 0.0;
         String depoEscolha;

         do {
         System.out.printf("Deseja fazer um depósito inicial? (S/N): ");
         depoEscolha = input.nextLine();

            if (depoEscolha.equalsIgnoreCase("s")) {
               System.out.printf("Digite o valor do depósito inicial");
               System.out.printf("\n\t R$ ");
               depoInicial = input.nextDouble();
               input.nextLine();
            }
            else if (depoEscolha.equalsIgnoreCase("n")){
               depoInicial = 0.0;
            }
            else {
               System.out.printf("Opção inválida");
            }

         } while (!depoEscolha.equalsIgnoreCase("s") && !depoEscolha.equalsIgnoreCase("n"));
         
         int contaCorrente = random.nextInt(1000000);
         usuario1 = new Usuario(nome, pass, contaCorrente, depoInicial);
         usuario1.dadosUsuario();
         break;
 
      case 2:
         usuario1.dadosUsuario();
         break;

      case 3:
         System.out.printf("\nDigite o valor do depósito: R$ ");
         double deposito = input.nextDouble();
         usuario1.deposito(deposito);
         usuario1.dadosUsuario();
         break;

      case 4:
         System.out.printf("\nDigite o valor do saque: R$ ");
         double saque = input.nextDouble();
         usuario1.saque(saque);
         usuario1.dadosUsuario();
         break;

      case 5:
         System.out.printf("\nDigite o novo nome do usuário: ");
         nome = input.nextLine();
         usuario1.setNome(nome);
         usuario1.dadosUsuario();
         break;

      case 6: 
         System.out.printf("\nEncerrando menu...");
         break;
   
      default:
         System.out.printf("\nOpção inválida");
         break;
   }

} while (menuEscolha != 6);

input.close();   
}
}
