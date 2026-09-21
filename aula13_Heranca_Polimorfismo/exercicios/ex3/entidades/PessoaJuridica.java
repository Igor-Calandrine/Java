package aula13_Heranca_Polimorfismo.exercicios.ex3.entidades;

public class PessoaJuridica extends Contribuiente {
   private Integer qntFuncionarios;

   public PessoaJuridica(String nome, Double rendaAnual, Integer qntFuncionarios) {
      super(nome, rendaAnual);
      this.qntFuncionarios = qntFuncionarios;
   }

   public Integer getQntFuncionarios() {
      return qntFuncionarios;
   }

   public void setQntFuncionarios(Integer qntFuncionarios) {
      this.qntFuncionarios = qntFuncionarios;
   }

   public Double impostoTipo1() {
      Double imposto = rendaAnual * 0.16;
      return imposto;
   }

   public Double impostoTipo2() {
      Double imposto = rendaAnual * 0.14;
      return imposto;
   }

   @Override 
   public Double impostoFinal() {
      Integer FuncionarioLimiar = 10;
      if (qntFuncionarios < FuncionarioLimiar) {
         return impostoTipo1();
      }
      else {
         return impostoTipo2();
      }
   }

   @Override 
   public String estatusContribuinte() {
      StringBuilder sb = new StringBuilder("");
      sb.append("\n===Contribuinte - Pessoa Jurídica===");
      sb.append(super.estatusContribuinte());
      sb.append(String.format("\nNúmero de Funcionários: %d", qntFuncionarios));
      sb.append(String.format("\nImposto Deduzido: R$%.2f", impostoFinal()));
      
      return sb.toString();
   }

}
