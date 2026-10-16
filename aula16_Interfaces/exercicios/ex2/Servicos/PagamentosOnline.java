package aula16_Interfaces.exercicios.ex2.Servicos;

public interface PagamentosOnline {
   double taxaPagamento(double valorParcela);

   double jurosParcela(double valorParcela, int mes);
}
