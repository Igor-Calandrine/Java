package aula8_POO.exercicios.exClasses;

public class Funcionario {
   public String nome;
   public Double salario;
   public Double imposto;
   public Double aumento;
   
   public Double salarioDescontos() {
      Double descontoReal = this.salario * (this.imposto/100);
      return this.salario - (descontoReal);
   }

   public Double salarioAumento() {
      Double aumentoReal = salarioDescontos() * (this.aumento/100);
      return salarioDescontos() + aumentoReal;
   }
}
