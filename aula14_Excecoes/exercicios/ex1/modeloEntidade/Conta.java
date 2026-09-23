package aula14_Excecoes.exercicios.ex1.modeloEntidade;

import aula14_Excecoes.exercicios.ex1.modeloException.ValorMaiorQueLimite;
import aula14_Excecoes.exercicios.ex1.modeloException.ValorMaiorQueSaldo;

public class Conta {
   private final Integer NUMERO;
   private String nome;
   private Double saldo;
   private Double limiteRetirada;

   public Conta(Integer NUMERO, String nome, Double saldo, Double limiteRetirada) {
      this.NUMERO = NUMERO;
      this.nome = nome;
      this.saldo = saldo;
      this.limiteRetirada = limiteRetirada;
   }

   public Integer getNumero() {
      return NUMERO;
   }

   public String getNome() {
      return nome;
   }

   public Double getSaldo() {
      return saldo;
   }

   public Double getLimiteRetirada() {
      return limiteRetirada;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setLimiteRetirada(Double limiteRetirada) {
      this.limiteRetirada = limiteRetirada;
   }

   public void deposito(Double deposito) {
      this.saldo += deposito;
   }

   public void retirada(Double retirada) throws ValorMaiorQueLimite, ValorMaiorQueSaldo {
      if (retirada > limiteRetirada) {
         throw new ValorMaiorQueLimite("\nValor de retirada maior que o limite");
      }
      if (retirada > saldo) {
         throw new ValorMaiorQueSaldo("\nValor de retirada maior que o saldo");
      }

      this.saldo -= retirada;
   }
}
