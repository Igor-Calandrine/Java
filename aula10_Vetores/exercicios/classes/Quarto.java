package aula10_Vetores.exercicios.classes;

public class Quarto {
   private int vagas = 3;
   private String[] nomes;
   private String email;
   private double aluguel;
   private boolean status = true; 

   public Quarto(String[] nomes, String email, double aluguel, boolean status) {
      this.nomes = nomes;
      this.email = email;
      this.aluguel = aluguel;
      this.status = status;
   }

   public Quarto(double aluguel) {
      this.nomes = new String[this.vagas];
      this.aluguel = aluguel;
   }

   public int getVagas() {
      return this.vagas;
   }
   
   public String getNomes() {
      int i;

      String estudantes = "";

      for(i=0; i<this.vagas; i++) {
         int n = i+1;
         if (nomes[i] != null) {
            estudantes += n + "- " + nomes[i] + "\n";

            if (i == this.vagas -1) {
               estudantes += n + "- " + nomes[i];
            }
         }
         else {
            estudantes += n + "- \n";
            if (i == this.vagas -1) {
               estudantes += n + "- ";
            }
         }
      }

      return estudantes;
   }

   public String getEmail() {
      return this.email;
   }
   
   public double getAluguel() {
      return this.aluguel;
   }
   
   public Boolean getStatus() {
      return this.status;
   }
   
   public void setVagas(int vagas) {
      this.vagas = vagas;
   }

   public void setNomes(String[] nomes) {
      this.nomes = nomes;
   }

   public void setAluguel(double aluguel) {
      this.aluguel = aluguel;
   }

   public void setStatus(boolean status) {
      this.status = status;
   }
}
