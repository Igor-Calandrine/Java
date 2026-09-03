package aula12_Composicao.exercicio.ex3.entidades;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
   private Client client;
   private LocalDate moment;
   private OrderStatus status;
   private List<OrderItem> orderList= new ArrayList<>();

   public Order(Client client, LocalDate moment, OrderStatus status) {
      this.client  = client;
      this.moment = moment;
      this.status = status;
   }

   public String getMoment() {
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      return moment.format(format);
   }

   public String getStatus() {
      return status.toString();
   }

   public String getOrder() {
      StringBuilder string = new StringBuilder("");

      string.append("\nORDER SUMMARY");
      string.append("\nOrder moment: " + getMoment());
      string.append("\nOder status: " + getStatus());
      string.append(client.getClient());

      for (OrderItem e : orderList) {
         System.out.printf("%s", e.getProduct().getName());
      }
      return string.toString();
   }

   public String getOrderList() {
      StringBuilder SBtring = new StringBuilder("");

      SBtring.append("\n--Item List--");
      for (OrderItem e : orderList) {
         SBtring.append("\n" + e.getProduct().getName());
         SBtring.append(" $" + e.getPrice());
         SBtring.append(" Quantity: " + e.getQuantity());
         SBtring.append(" Subtotal: " + e.getSubTotal());
      }
      return SBtring.toString();
   }
   
   public void addItem(OrderItem orderItem) {
      orderList.add(orderItem);
   }

   public void removeItem(OrderItem orderItem) {
      orderList.remove(orderItem);
   }


}
