package aula8_POO.exercicios.exClasses;

public class CurrencyConverter {

   public static final double DOLLAR = 5.1015;
   public static final double IOF = 6;

   public static double converterRealDollar(double real) {
      return real / DOLLAR;
   }

   public static double converterDollarReal(double dollar) {
      return dollar * DOLLAR;
   }

   public static double acrescimoIOF(double dollar) {
      return dollar * DOLLAR * IOF/100;
   }
}
