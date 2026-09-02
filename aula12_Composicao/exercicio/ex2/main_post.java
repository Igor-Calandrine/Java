package aula12_Composicao.exercicio.ex2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import aula12_Composicao.exercicio.ex2.entities.Comment;
import aula12_Composicao.exercicio.ex2.entities.Post;


public class main_post {
public static void main(String[] args) {
Locale.setDefault(Locale.US);

Scanner input = new Scanner(System.in);
List<Post> posts= new ArrayList<>();

Post post1 = new Post(LocalDateTime.parse("2018-06-21T13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
Post post2 = new Post(LocalDateTime.parse("2018-07-28T23:14:19"), "Good night guys", "See you tomorrow", 5);
posts.add(post1);
posts.add(post2);

Comment comment1 = new Comment("Have a nice trip");
Comment comment2 = new Comment("Wow that's awesome!");
posts.get(0).addComment(comment1);
posts.get(0).addComment(comment2);

Comment comment3 = new Comment("Good night");
Comment comment4 = new Comment("May the Force be with you");
posts.get(1).addComment(comment3);
posts.get(1).addComment(comment4);



System.out.printf("\n===Menu Post===");
System.out.printf("\n1- List Posts");
System.out.printf("\n2- Add Post");
System.out.printf("\n3- Remove Post");
System.out.printf("\n4- Close Program");
System.out.printf("\nOption: ");
int menu = input.nextInt();
input.nextLine();

switch (menu) {
   case 1:
      for (int i=0; i<posts.size(); i++) {
         System.out.printf("\n%s", posts.get(i).getPost(i+1));
      }
      System.out.printf("\n\n===Menu Comments===");
      System.out.printf("\n1- See Comments");
      System.out.printf("\n2- Add Comment");
      System.out.printf("\n3- Remove Comment");
      System.out.printf("\nOption: ");
      menu = input.nextInt();
      input.nextLine();
      int numberPost;

      switch (menu) {
         case 1:
            System.out.printf("\nEnter the number's Post: ");
            numberPost = input.nextInt();
            input.nextLine();
            System.out.printf("\n%s", posts.get(numberPost-1).getComments());
            break;

         case 2:
            System.out.printf("\nEnter the number's Post: ");
            numberPost = input.nextInt();
            input.nextLine();
            System.out.printf("\nComment: \n");
            String addComment = input.nextLine();
            Comment comment = new Comment(addComment);
            posts.get(numberPost-1).addComment(comment);
            break;

         case 3:
            System.out.printf("\nEnter the number's Post: ");
            numberPost = input.nextInt();
            input.nextLine();
            posts.get(numberPost-1).removeComment(numberPost);
            break;
      
         default:
            System.out.printf("\nInvalid Option");
            break;
      }
      break;
      
   case 2:
      LocalDateTime moment = LocalDateTime.now();
      System.out.printf("\nTitle: ");
      String title = input.nextLine();
      System.out.printf("Content: ");
      String content = input.nextLine();

      Post post = new Post(moment, title, content);
      posts.add(post);

      System.out.printf("\n%s", posts.getLast().getPost(posts.size()));
      break;
   
   case 3: 
      System.out.printf("\nPost number to remove:");
      int number = input.nextInt();
      input.nextLine();
      posts.remove(number-1);

      for (int i=0; i<posts.size(); i++) {
         System.out.printf("\n%s", posts.get(i).getPost(i+1));
      }
      break;


   default:
      System.out.printf("\nInvalid Option");
      break;
}

input.close();
}
}
