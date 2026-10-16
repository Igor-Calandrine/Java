package aula16_Interfaces.exercicios.ex2.Servicos;

import java.time.LocalDate;

import aula16_Interfaces.exercicios.ex2.entidades.Contrato;
import aula16_Interfaces.exercicios.ex2.entidades.Parcelas;

public class ContratoServico {
   private PagamentosOnline pagamentosOnline;

   public ContratoServico(PagamentosOnline pagamentosOnline) {
      this.pagamentosOnline = pagamentosOnline;
   }

   public void processoContrato(Contrato contrato, int meses) {

      double parcelaBasica = contrato.getValorTotal() / meses;

      for (int i=1; i <= meses; i++) {
         LocalDate vencimento = contrato.getData().plusMonths(i);

         double juros = pagamentosOnline.jurosParcela(parcelaBasica, i);
         double taxa = pagamentosOnline.taxaPagamento(parcelaBasica + juros);
         double parcelaTotal = parcelaBasica + juros + taxa;

         contrato.getParcelas().add(new Parcelas(vencimento, parcelaTotal));

      }
   }
}
