package aula12_Composicao.exercicio.ex1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import aula12_Composicao.exercicio.ex1.WorkerLevel;
import aula12_Composicao.exercicio.ex1.HourContract;

public class Worker {
   private String name;
   private WorkerLevel level;
   private Double baseSalary;

   private Department department;
   private List<HourContract> contracts = new ArrayList<>();

   public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
      this.name = name;
      this.level = level;
      this.baseSalary = baseSalary;
      this.department = department;
   }

   public Worker() {
   }

   public String getName() {
      return name;
   }

   public WorkerLevel getLevel() {
      return level;
   }

   public Double getBaseSalary() {
      return baseSalary;
   }

   public Department getDepartment() {
      return department;
   }

   public List<HourContract> getContracts() {
      return contracts;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setLevel(WorkerLevel level) {
      this.level = level;
   }

   public void SetBaseSalary(Double baseSalary) {
      this.baseSalary = baseSalary;
   }

   public void setDepartment(Department department) {
      this.department = department;
   }

   // Adicionar Contrato
   public void addContract(HourContract contract) {
      contracts.add(contract);
   }

   // Remover Contrato
   public void removeContract(HourContract contract) {
      contracts.remove(contract);
   }

   // Recebido no mês
   public Double incomeMonth (int year, int month) {
      Double sum = baseSalary;

      for (HourContract e : contracts) {
         int contractYear = e.getDate().getYear();
         int contractMonth = e.getDate().getMonthValue();

         if(year == contractYear && month == contractMonth) {
            sum += e.totalIncoming();

         }
         
      }
      
      return sum;
   }
}
