package aula16_Interfaces.exercicios.ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import aula16_Interfaces.exercicios.ex2.Servicos.ContratoServico;
import aula16_Interfaces.exercicios.ex2.Servicos.PaypalService;
import aula16_Interfaces.exercicios.ex2.entidades.Contrato;
import aula16_Interfaces.exercicios.ex2.entidades.Parcelas;

public class Program {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
DateTimeFormatter format = DateTimeFormatter.ofPattern( "dd/MM/yyyy");
Scanner input = new Scanner(System.in);

System.out.printf("Entre com os dados do contrato");
System.out.printf("Número: ");
int numero = input.nextInt();
input.nextLine();
System.out.printf("Data (dd/mm/yyy): ");
String dataString = input.nextLine();
LocalDate data = LocalDate.parse(dataString, format);
System.out.printf("Valor do contrato: ");
double valorTotal = input.nextDouble();
input.nextLine();

Contrato contrato = new Contrato(numero, data, valorTotal);

System.out.printf("Entre com o número de parcelas: ");
int numeroParcelas = input.nextInt();
input.nextLine();

ContratoServico contratoServico = new ContratoServico(new PaypalService());
contratoServico.processoContrato(contrato, numeroParcelas);

System.out.printf("Parcelas: ");

for (Parcelas e : contrato.getParcelas()) {
   System.out.println(e);
}




input.close();
}
}
