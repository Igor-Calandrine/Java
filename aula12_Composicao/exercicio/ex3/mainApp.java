package aula12_Composicao.exercicio.ex3;

import java.time.LocalDate;
import java.util.Locale;

import aula12_Composicao.exercicio.ex3.entidades.Client;
import aula12_Composicao.exercicio.ex3.entidades.OrderItem;
import aula12_Composicao.exercicio.ex3.entidades.OrderStatus;
import aula12_Composicao.exercicio.ex3.entidades.Product;
import aula12_Composicao.exercicio.ex3.entidades.Order;

public class mainApp {
public static void main(String[] args) {

   Locale.setDefault(Locale.US);

Client client1 = new Client("Igor", "igorwow@email.com", 
LocalDate.parse("2025-05-03"));

Product product1 = new Product("Knife", 25.50);
Product product2 = new Product("Apple", 20.50);

OrderItem orderItem1 = new OrderItem(10, product1);
OrderItem orderItem2 = new OrderItem(10, product2);

Order order1 = new Order(client1, LocalDate.parse("2025-08-05"), OrderStatus.valueOf("PROCESSING"));
order1.addItem(orderItem1);
order1.addItem(orderItem2);

System.out.printf("\n%s", order1.getOrder());
System.out.printf("\n%s", order1.getOrderList());












}
}
