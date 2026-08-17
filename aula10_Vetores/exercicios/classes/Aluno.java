package aula10_Vetores.exercicios.classes;

public class Aluno {
   private String nome;
   private double[] notas= new double[4];


public Aluno(String nome) {
   this.nome = nome;
}

public Aluno(String nome, double[] notas) {
   this.nome = nome;
   this.notas = notas;
}

public String getNome() {
   if (this.nome != null) {
      return this.nome;
   }
   else {
      return "--";
   }
}

public String stringNotas() {
   int i;
   String notasString = "";

   for(i=0; i<notas.length; i++) {
      int n = i + 1;
      if (i == notas.length - 1) {
         notasString += "   " + n +"ºB- " + notas[i];
      }
      else {
         notasString += "   " + n +"ºB- " + notas[i] + "\n"; 
      }
   }

   return notasString;
}

public void setNotas(int n, double nota) {
   this.notas[n] = nota;
}

public double mediaNota() {
   double soma = 0;
   
   for(int i=0; i<notas.length; i++) {
      soma += notas[i];
   }
   
   double media = soma/notas.length;
   return media;
}

public double maiorNota() {
   double nota = notas[0];

   for(int i=0; i<notas.length; i++) {
      if (notas[i] >= nota) {
         nota = notas[i];
      }
   }

   return nota;
}

public double menorNota() {
   double nota = notas[0];

   for(int i=0; i<notas.length; i++) {
      if (notas[i] <= nota) {
         nota = notas[i];
      }
   }

   return nota;
}



}

