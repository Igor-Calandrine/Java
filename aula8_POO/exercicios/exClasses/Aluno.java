package aula8_POO.exercicios.exClasses;

public class Aluno {
   public String nome;
   public Double nota1 = 0.0; 
   public Double nota2 = 0.0;
   public Double nota3 = 0.0;
   public boolean notaValida = false;

   public Double notaTotal() {
      double notaTotal = this.nota1 + this.nota2 + this.nota3;
      return notaTotal;
   }

   public String status() {
      if (notaTotal() >= 60) {
         return "Aprovado";
      }
      else {
         return "Reprovado";
      }
   }

   public void validarNotas1(Double nota) {
      this.notaValida = false;

      if (0 <=nota && nota <= 30) {
         this.notaValida = true;
      }
      else {
         System.out.printf("Nota inválida");
      }
   }

   public void validarNotas23(Double nota) {
      this.notaValida = false;

      if (0 <=nota && nota <= 35) {
         this.notaValida = true;
      }
      else {
         System.out.printf("Nota inválida");
      }
   }

}


