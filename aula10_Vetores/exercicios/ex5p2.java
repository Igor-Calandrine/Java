package aula10_Vetores.exercicios;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import aula10_Vetores.exercicios.classes.Empregado;

public class ex5p2 {
/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome, salário) de N funcionários, não pode haver repetição de id.
Efetuar o aumento de X por cento no salário de um determinado funcionário. O programa deve ler um id e o valor X. Se o id não existir, mostrar uma mensagem e abortar a operação. AO final, mostrar a listagem atualizada dos funcionários.
*/ 
public static void main(String[] args) {
Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);
String resposta = "";

ArrayList<Empregado> empregadosList = new ArrayList<>();

do {
   System.out.printf("Deseja cadastrar um funcionário (Y/N): ");
   resposta = input.nextLine().substring(0, 1);
   
   // Cadastro Funcionário
   if (resposta.equalsIgnoreCase("Y")) {
      int idFuncionario = 0;

      System.out.printf("Digite o nome do funcionário: ");
      String nome = input.nextLine();
      System.out.printf("Digite o salário inicial: R$ ");
      double salario = input.nextDouble();
      input.nextLine();

      boolean cadastro = false;
      boolean flagID = false;
      do {
         cadastro = false;
         System.out.printf("\nLista de id sendo utilizado:");
   
         if (empregadosList.size() == 0){
               System.out.printf("\nLista vazia, todos IDs disponíveis\n");
               flagID = true;
            }
         else {
            for(Empregado e: empregadosList) {
               System.out.printf("\nID: %s",e.getID_EMPREGADO());
            }
         }

         System.out.printf("\nDigite um id para o funcionário: ");
         idFuncionario = input.nextInt();
         input.nextLine();
   
         if (empregadosList.size() > 0) {
            for (Empregado e: empregadosList) {{
               if(e.getID_EMPREGADO() == idFuncionario){
                  flagID = false;
               }
               else {
                  flagID = true;
               }
            }}
         }
         
         if (flagID == false) {
            System.out.printf("\nID já utilizado, escolha outro");
         }
         else {
            System.out.printf("\nCadastro aceito, sendo realizado\n");
            cadastro = true;
         }
         

      } while (cadastro == false);

      Empregado empregado = new Empregado(idFuncionario, nome, salario);

      empregadosList.add(empregado);

   } ;

} while (resposta.equalsIgnoreCase("Y"));


System.out.printf("\n==Tabela de Funcionários==\n");
   for(Empregado e : empregadosList) {
      System.out.printf(e.toString());
   }

System.out.printf("\nDigite o ID do funcionário: ");

int id_procura = input.nextInt();
input.nextLine();

boolean existID = false;
for (Empregado e: empregadosList) {
   if (e.getID_EMPREGADO() == id_procura) {
      existID = true;
      break;
   }
}

if (existID == true) {
   System.out.printf("\nDigite o aumento do salário (%%): ");
   double aumento = input.nextDouble();

   for (Empregado e : empregadosList) {
      if (e.getID_EMPREGADO() == id_procura) {
         e.aumentoSalario(aumento);
         break;
      }
   }
} else {
   System.out.printf("\nFuncionário não encontrado");
}

System.out.printf("\n===Dados===\n");
for (Empregado e : empregadosList) {
   System.out.printf("\n%s", e.toString());
}

input.close();
}
}

