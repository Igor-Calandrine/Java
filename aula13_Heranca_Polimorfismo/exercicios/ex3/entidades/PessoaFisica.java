package aula13_Heranca_Polimorfismo.exercicios.ex3.entidades;

public class PessoaFisica extends Contribuiente {
   private Double gastoSaude;

   public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
      super(nome, rendaAnual);
      this.gastoSaude = gastoSaude;
   }

   public Double getGastoSaude() {
      return gastoSaude;
   }

   public void setGastoSaude(Double gastoSaude) {
      this.gastoSaude = gastoSaude;
   }

   public Double impostoTipo1() {
      Double imposto = rendaAnual * 0.15;
      return imposto - abatimentoSaude();
   }

   public Double impostoTipo2() {
      Double imposto = rendaAnual * 0.25;
      return imposto - abatimentoSaude();
   }

   public Double abatimentoSaude() {
      return gastoSaude * 0.5;
   }

   @Override
   public Double impostoFinal() {
      Double rendaLimiar = 20000.0;
      if (rendaAnual < rendaLimiar) {
         return impostoTipo1();
      }
      else {
         return impostoTipo2();
      } 
   }

   @Override 
   public String estatusContribuinte() {
      StringBuilder sb = new StringBuilder("");
      sb.append("\n===Contribuinte - Pessoa Física===");
      sb.append(super.estatusContribuinte());
      sb.append(String.format("\nGasto com Saúde: R$%.2f", gastoSaude));
      sb.append(String.format("\nImposto Deduzido: R$%.2f", impostoFinal()));
      
      return sb.toString();
   }

}
