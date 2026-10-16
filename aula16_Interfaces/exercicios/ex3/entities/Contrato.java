package aula16_Interfaces.exercicios.ex3.entities;

public interface Contrato {
   public Double getTotalContrato();

   public Double getJuros();
   public int getMeses();

   default Double parcelaContrato() {

      if (getMeses() <= 0) {
         throw new IllegalArgumentException("Erro: dado inválido");
      }
      else {
         Double parcela = getTotalContrato() / getMeses();
         parcela = parcela + parcela * getJuros()/100;

         return parcela;
      }
   }

   default Double valorFinalContrato() {
      Double valorFinal = 0.0;

      for (int i=getMeses(); i > 0; i--) {
         valorFinal += parcelaContrato();
      }

      return valorFinal;
   }
}
