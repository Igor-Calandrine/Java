package aula12_Composicao.exercicio.ex3.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
   private String name;
   private String email;
   private final LocalDate BIRTHDATE;
   private List<OrderItem> clientItemList= new ArrayList<>();

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

   public List<OrderItem> getClientItemList() {
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

   public String getClientItemListString() {
      StringBuilder SBtring = new StringBuilder("");

      SBtring.append("\n---Item List---");
      
      for (OrderItem e : clientItemList) {
         SBtring.append("\n: " + e.getProduct());
         SBtring.append(" - " + e.getPrice());
         SBtring.append(" Quantity: " + e.getQuantity());
         SBtring.append(String.format(" - Subtotal: $ %.2f", e.getSubTotal()));
      }

      return SBtring.toString();
   }



}
