package aula16_Interfaces.exercicios.ex2.Servicos;

public class PaypalService implements PagamentosOnline {
   
   @Override 
   public double taxaPagamento(double valorParcela) {
      return valorParcela * 0.02;
   }

   @Override
   public double jurosParcela(double valorParcela, int mes) {
      return valorParcela * 0.01 * mes;
   }
}
