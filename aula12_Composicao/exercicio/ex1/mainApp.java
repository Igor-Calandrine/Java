package aula12_Composicao.exercicio.ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import aula12_Composicao.exercicio.ex1.WorkerLevel;
import aula12_Composicao.exercicio.ex1.Worker;
import aula12_Composicao.exercicio.ex1.Department;
import aula12_Composicao.exercicio.ex1.HourContract;

public class mainApp {
public static void main(String[] args) {

Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);
DateTimeFormatter formt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

System.out.printf("\nEnter department name: ");
String departmentName = input.nextLine();
System.out.printf("\nEnter worker data: ");
//
System.out.printf("\nName: ");
String workerName = input.nextLine();
System.out.printf("Level: ");
String workerlevel = input.nextLine();
System.out.printf("Base salary: ");
Double baseSalary = input.nextDouble();
input.nextLine();

Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerlevel), baseSalary, new Department(departmentName));

System.out.printf("\nHow many contracts to his worker? ");
int nContracts = input.nextInt();
input.nextLine();

for (int i=0; i<nContracts; i++) {
   System.out.printf("\nEnter contract #%d DATE: ", nContracts);
   System.out.printf("\n DATE (dd/mm/yyyy): ");
   String dateContractString = input.nextLine();
   LocalDate dateContract = LocalDate.parse(dateContractString, formt);

   System.out.printf("Value por hour: ");
   Double valuePerHour = input.nextDouble();
   input.nextLine();

   System.out.printf("Duration (hours): ");
   int hours = input.nextInt();
   input.nextLine();
   
   HourContract contract = new HourContract(dateContract, valuePerHour, hours);
   worker.addContract(contract);
}

System.out.printf("\n\nEnter month and yaer to calculate income (MM/YYYY): ");
String monthAndYear = input.nextLine();

int month = Integer.parseInt(monthAndYear.substring(0, 2));
int year = Integer.parseInt(monthAndYear.substring(3));

System.out.printf("\n Worker: %s", worker.getName());
System.out.printf("\n Department: %s", worker.getDepartment().getName());
System.out.printf("Income for %s: US$ %.2f", monthAndYear, worker.incomeMonth(year, month));


input.close();
}
}
