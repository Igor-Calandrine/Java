package aula9_Construtores.exercicios.classes;

public class Usuario {
   private String nome;
   private String pass;
   private final int CONTA_CORRENTE;
   private double saldo;

   public Usuario (String nome, String pass, int contaCorrente, double depositoIncial) {
      this.nome = nome;
      this.CONTA_CORRENTE = contaCorrente;
      this.saldo = depositoIncial;
   }

   public Usuario (String nome, String pass, int contaCorrente) {
      this.nome = nome;
      this.CONTA_CORRENTE = contaCorrente;
      this.saldo = 0;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome){
      this.nome = nome;
   }

   public String setPass(String pass) {
      if (pass != this.pass) {
         this.pass = pass;
         return "Senha alterada";
      }
      else {
         return "Senha inválida";
      }
   }

   public int getContaCorrente() {
      return this.CONTA_CORRENTE;
   }

   public double getSaldo() {
      return this.saldo;
   }

   public void deposito(double deposito) {
      this.saldo += deposito;
   }

   public void saque(double saque) {
      this.saldo -= saque;
   }

   public void dadosUsuario() {
      System.out.printf("\n"+"=".repeat(5)+"Dados da Conta"+"=".repeat(5));
      System.out.printf("\nNome: %s", getNome());
      System.out.printf("\nCC: %d", getContaCorrente());
      System.out.printf("\nSaldo: %.2f", getSaldo());
      System.out.printf("\n"+"=".repeat(10)+"=".repeat("Dados da Conta".length()));
   }




}
