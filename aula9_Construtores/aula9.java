package aula9_Construtores;

public class aula9 {
public static void main(String[] args) {
/*
-Construtores
   O construtor é um bloco especial da classe que é executado no momento em que o objeto nasce.
   Ele tem o mesmo nome da classe e não possui tipo de retorno.
   Você pode aproveitar o construtor para já colocar valores nos atributos:

public class Aluno {

   String nome;
   double nota;

*  public Aluno() {
*      nome = "Sem nome";
*      nota = 0.0;
   }
}

   Você pode passar informações para o construtor:

public class Aluno {
   String nome;
   double nota;

*  public Aluno(String nome, double nota) {
      this.nome = nome;
      this.nota = nota;
   }
}

   Assim quando for criar uma instância, será necessário passar essas informações:

*  Aluno aluno = new Aluno("Carlos", 8.5);

-Sobrecarga
   Construtor também pode ser sobrecarregado, podemos ter vários tipos de entrada, tanto em atributos quanto em métodos:

public Aluno() {
    nome = "Sem nome";
    nota = 0.0;
}

public Aluno(String nome) {
    this.nome = nome;
    nota = 0.0;
}

public Aluno(String nome, double nota) {
    this.nome = nome;
    this.nota = nota;
}

O Java identifica qual construtor deve utilizar pelos argumentos fornecidos.
Assim podemos chamar de várias formas a instância:

Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno("Carlos");
Aluno aluno3 = new Aluno("Carlos", 8.5);

!Importante
   O Java fornece automaticamente um construtor padrão sem argumentos.
   Se você criar seu próprio construtor, o Java não cria automaticamente o Aluno() sem argumentos.
   Então: 
*  Aluno aluno = new Aluno();
   Passará a dar erro
   Se quiser os dois, precisa declarar os dois:
   
*   public Aluno() {
*   }

*   public Aluno(String nome) {
*      this.nome = nome;
*   }

-Encapsulamento
   Em vez de permitir que qualquer parte do programa altere diretamente os atributos de um objeto, você controla o acesso a eles através de métodos.
   Agora entramos em atributos private

   public class Aluno {
      private String nome;
      private double nota;
   }

   *O get é um método usado para obter o valor de um atributo.
   public double getNota() {
      return this.nota;
   }

   *O set é um método usado para alterar o valor de um atributo.
   public void setNota(double nota) {
      this.nota = nota;
   }










*/ 




}
}
