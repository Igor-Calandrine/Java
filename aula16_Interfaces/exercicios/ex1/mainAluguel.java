package aula16_Interfaces.exercicios.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula16_Interfaces.exercicios.ex1.Espacos.EspacoEvento;
import aula16_Interfaces.exercicios.ex1.Espacos.SalaLoja;
import aula16_Interfaces.exercicios.ex1.Reserva.Reserva;

public class mainAluguel {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
List<Reserva> reservaLista = new ArrayList<>();

System.out.printf("===MENU SHOPPING===");
System.out.printf("\n1. Cadastro Aluguel");
System.out.printf("\n2. Renovar Aluguel");
System.out.printf("\n3. Listar Alugueis");
System.out.printf("\n4. Fechar Programa");
System.out.printf("\nOpção: ");
int opcao = input.nextInt();
input.nextLine();

switch (opcao) {
   case 1:
      System.out.printf("Cliente: ");
      String cliente = input.nextLine();
      System.out.printf("Espaço: ");
      String espaco = input.nextLine();
      System.out.printf("Valor/Mês: ");
      Double valor = input.nextDouble();
      input.nextLine();
      System.out.printf("Data de Início (dd/mm/yyyy): ");
      String dataInicioString = input.nextLine();
      LocalDate dataInicio = LocalDate.parse(dataInicioString, format);
      System.out.printf("Data de Fim (dd/mm/yyyy): ");
      String dataFimString = input.nextLine();
      LocalDate dataFim = LocalDate.parse(dataFimString, format);

      System.out.printf("\n1.Eventos");
      System.out.printf("\n2.Espaço Lojas");
      opcao = input.nextInt();
      input.nextLine();

      if(opcao == 1) {
         Reserva reserva = new Reserva(cliente, dataInicio, dataFim, new EspacoEvento(espaco, valor));
         reservaLista.add(reserva);
         reserva.salvarProduto();
      }
      else if(opcao == 2) {
         Reserva reserva = new Reserva(cliente, dataInicio, dataFim, new SalaLoja(espaco, valor));
         reservaLista.add(reserva);
         reserva.salvarProduto();
      }
      else {
         System.out.printf("Erro: Opção Inválida");
      }
      break;

   case 2: 
      break;

   case 3:
      System.out.printf("===Lista de Reservas===\n");
      String path = "aula16_Interfaces\\exercicios\\ex1\\RegistroReservas\\RegistroReservas.txt";

      try (BufferedReader br = new BufferedReader(new FileReader(path))) {
         String line = br.readLine();

         while (line != null) {
            System.out.println(line);
            line = br.readLine();
         }
      }
      catch (IOException e) {
         System.out.println("Erro: " + e.getMessage());
      }
      break;

   default:
      System.out.println("Opção Inválida");
      break;
}




input.close();
}
}
