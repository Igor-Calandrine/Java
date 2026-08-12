package aula8_POO.exercicios.exClasses;

public class Retangulo {
   public double sideA, sideB;

   public double area() {
      double area = this.sideA * this.sideB;
      return area;
   }

   public double perimeter() {
      double perimeter = 2 * (this.sideA + this.sideB);
      return perimeter;
   }

   public double diagonal() {
      double diagonal = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
      return diagonal;
   }
}
