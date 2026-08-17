package aula10_Vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;
import aula10_Vetores.exercicios.classes.Aluno;

public class ex2p1 {
/*
Crie uma classe Aluno com 4 notas
Método para adicionar nota, média, maior nota, menor nota
Crie no Main um array de 5 alunos, relatório
Desafio Extra: aluno com a maior média, aluno com a menor média, quantidade de alunos com média ≥ 5, média geral da turma
*/

public static void main(String[] args) {

Locale.setDefault(Locale.US);


Scanner input = new Scanner(System.in);
input.useLocale(Locale.US);

Aluno[] alunos = new Aluno[3];
int n = 0;
String resposta = "";

do {
   System.out.printf("\nCadastro Aluno");
   System.out.printf("\nDigite o nome do aluno: ");
   String nome = input.nextLine();
   alunos[n] = new Aluno(nome);
   
   System.out.printf("Digite as notas do aluno");
   System.out.printf("\nNota 1ºB - ");
   double nota = input.nextDouble();
   input.nextLine();
   alunos[n].setNotas(0, nota);
   
   System.out.printf("Nota 2ºB - ");
   nota = input.nextDouble();
   input.nextLine();
   alunos[n].setNotas(1, nota);
   
   System.out.printf("Nota 3ºB - ");
   nota = input.nextDouble();
   input.nextLine();
   alunos[n].setNotas(2, nota);
   
   System.out.printf("Nota 4ºB - ");
   nota = input.nextDouble();
   input.nextLine();
   alunos[n].setNotas(3, nota);

   n += 1;
   System.out.printf("\nDeseja cadastrar um aluno (Y/N): ");
   resposta = input.nextLine().substring(0, 1);
} while (n < alunos.length && resposta.equalsIgnoreCase("y"));

for (int i = 0; i < alunos.length; i++) {
   if (alunos[i] != null) {
      System.out.printf("\n\n===Notas==");
      System.out.printf("\nAluno: %s", alunos[i].getNome());
      System.out.printf("\nNotas:");
      System.out.printf("\n%s", alunos[i].stringNotas());
      System.out.printf("\nMédia: %.1f", alunos[i].mediaNota());
      System.out.printf("\nMaior nota: %.1f", alunos[i].maiorNota());
      System.out.printf("\nMenor nota: %.1f", alunos[i].menorNota());
   }

}

double maiorMedia = alunos[0].mediaNota();
for (int i = 0; i < alunos.length; i++) {
   if (alunos[i].mediaNota() >= maiorMedia) {
      maiorMedia = alunos[i].mediaNota();
   }
}

double menorMedia = alunos[0].mediaNota();
for (int i = 0; i < alunos.length; i++) {
   if (alunos[i].mediaNota() <= menorMedia) {
      menorMedia = alunos[i].mediaNota();
   }
}

int maiores5 = 0;
for (int i = 0; i < alunos.length; i++) {
   if (alunos[i].mediaNota() >= 5) {
      maiores5 += 1;
   }
}

double somaGeral = 0; 
for (int i = 0; i < alunos.length; i++) {
   somaGeral += alunos[i].mediaNota();
}

int m = 0;
for (int i = 0; i < alunos.length; i++) {
   if (alunos[i] != null) {
      m += 1;
   }
}

double mediaGeral = 0;
if (m > 0 ){
   mediaGeral = somaGeral/m;
}

System.out.printf("\n\n===Quadro Geral===");
System.out.printf("\nMedia Geral: %.1f", mediaGeral);
System.out.printf("\nMaior Média: %.1f", maiorMedia);
System.out.printf("\nMenor Média: %.1f", menorMedia);
System.out.printf("\nmaior que 5: %d", maiores5);

input.close();
}
}
