package aula16_Interfaces.exercicios.ex3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula16_Interfaces.exercicios.ex3.entities.ContratoConsultoria;
import aula16_Interfaces.exercicios.ex3.entities.ContratoEmpresarial;
import aula16_Interfaces.exercicios.ex3.entities.Contrato;

public class ProgramMain {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

List<Contrato> contratoLista = new ArrayList<>();

String dataString = "01/11/2026";
LocalDate data = LocalDate.parse(dataString, format);

ContratoConsultoria contratoCA = new ContratoConsultoria("ConsultoriaA", 7500.00, data, 5);

dataString = "01/10/2026";
data = LocalDate.parse(dataString, format);

ContratoEmpresarial contratoEA = new ContratoEmpresarial("EmpresaA", 12000.00, data, 12);

contratoLista.add(contratoCA);
contratoLista.add(contratoEA);

System.out.println("===Dados do Contrato===");
for (Contrato e : contratoLista) {
   System.out.printf("%s", e.toString());
   System.out.println(" ");
}

input.close();
}
}
