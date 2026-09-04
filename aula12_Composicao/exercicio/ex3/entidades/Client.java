package aula12_Composicao.exercicio.ex3.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
   private String name;
   private String email;
   private final LocalDate BIRTHDATE;
   private List<Order> clientItemList= new ArrayList<>();

   public Client(String name, String email, LocalDate BIRTHDATE) {
      this.name = name;
      this.email = email;
      this.BIRTHDATE = BIRTHDATE;
   }

   public String getName() {
      return name;
   }

   public String getEmail() {
      return email;
   }

   public LocalDate getBIRTHDATE() {
      return BIRTHDATE;
   }

   public List<Order> getClientItemList() {
      return clientItemList;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getClient() {
      StringBuilder SBtring = new StringBuilder("");

      SBtring.append("\n---Client---");
      SBtring.append("\nName: " + getName());
      SBtring.append(" (" + getBIRTHDATE() + ")");
      SBtring.append(" - " + getEmail());

      return SBtring.toString();
   }

   public String getClientOrderList() {
      StringBuilder SBstring = new StringBuilder("");

      SBstring.append("\n\n===LIST ORDER CLIENT===");
      for (Order e : clientItemList) {
         SBstring.append(e.getOrder());
         SBstring.append(e.getOrderList());
         SBstring.append("\n");
      }

      return SBstring.toString();
   }

   public void addOrderItem(Order item) {
      clientItemList.add(item);
   }

   public void removeOrderItem(Order item) {
      clientItemList.remove(item);
   }



}
