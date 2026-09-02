package aula12_Composicao.exercicio.ex2.entities;

public class Comment {
   private String text;

   public Comment(String text) {
      this.text = text;
   }

   public Comment() {
   }

   public String getComent() {
      return text;
   }

   public void setComent(String text) {
      this.text = text;
   }
   
}
