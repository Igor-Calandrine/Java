package aula12_Composicao.exercicio.ex2.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
   private LocalDateTime moment;
   private String title;
   private String content;
   private Integer likes = 0;
   private List<Comment> comments = new ArrayList<>();
   
   public Post(LocalDateTime moment, String title, String content, Integer likes) {
      this.moment = moment;
      this.title = title;
      this.content = content;
      this.likes = likes;
   }

   public Post(LocalDateTime moment, String title, String content) {
      this.moment = moment;
      this.title = title;
      this.content = content;
   }


   public void setMoment(LocalDateTime moment) {
      this.moment = moment;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public void setLikes(Integer likes) {
      this.likes = likes;
   }

   public LocalDateTime getMoment() {
      return moment;
   }

   public String getTitle() {
      return title;
   }

   public String getContent() {
      return content;
   }

   public Integer getLikes() {
      return likes;
   }

   public void addComment(Comment comment) {
      comments.add(comment);
   }

   public void removeComment(int comment) {
      comments.remove(comment);
   }

   
   public String getPost(int i) {
      StringBuilder SBtext = new StringBuilder();

      SBtext.append(String.format("\n---POST#%d---", i));
      SBtext.append(String.format("\nMoment: %s", moment));
      SBtext.append(String.format("\nTitle: %s", title));
      SBtext.append(String.format("\nContent: %s", content));
      SBtext.append(String.format("\nLikes: %d", likes));

      return SBtext.toString();
   }

   public String getComments() {
      StringBuilder SBtext = new StringBuilder();
      
      SBtext.append("\n\n--Comments--");
      for (Comment e : comments) {
         SBtext.append(String.format("\n%s", e.getComent()));
      }
      
      return SBtext.toString();

   }
   
}
