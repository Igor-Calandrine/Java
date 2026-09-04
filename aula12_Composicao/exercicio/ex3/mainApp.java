package aula12_Composicao.exercicio.ex3;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import aula12_Composicao.exercicio.ex3.entidades.Client;
import aula12_Composicao.exercicio.ex3.entidades.OrderItem;
import aula12_Composicao.exercicio.ex3.entidades.OrderStatus;
import aula12_Composicao.exercicio.ex3.entidades.Product;
import aula12_Composicao.exercicio.ex3.entidades.Order;

public class mainApp {
public static void main(String[] args) {

Locale.setDefault(Locale.US);
Scanner input = new Scanner(System.in);

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

// Inputs
System.out.printf("\n\n--Inputs--");
System.out.printf("\nName: ");
String name = input.nextLine();
System.out.printf("Email: ");
String email = input.nextLine();
System.out.print("Birth Date (DD/MM/YYYY): " );
String stringBirth = input.nextLine();

String birthDateYear = stringBirth.substring(6);
String birthDateMonth = stringBirth.substring(3,5);
String birthDateDay = stringBirth.substring(0,2);
String birthDateString = birthDateYear + "-" + birthDateMonth + "-" + birthDateDay;
LocalDate birthDate = LocalDate.parse(birthDateString);

Client client2 = new Client(name, email, birthDate);

System.out.printf("\n\n--Order Data--");
System.out.printf("\nStatus: ");
String statusString = input.nextLine();
OrderStatus status = OrderStatus.valueOf(statusString );

Order order3 = new Order(client2, LocalDate.now(), status);

System.out.printf("\nHow many items to this order? ");
// int nItems = input.nextInt();
// input.nextLine();

System.out.printf("\nEnter #1 item data:");
System.out.printf("\nProduct name: ");
String productName = input.nextLine();
System.out.printf("Product price: ");
Double productPrice = input.nextDouble();
input.nextLine();
System.out.printf("Product Quantity: ");
Integer productQuantity = input.nextInt();
input.nextLine();

Product product3 = new Product(productName, productPrice);
OrderItem orderItem3 = new OrderItem(productQuantity , product3);
order3.addItem(orderItem3);

System.out.printf("\nEnter #2 item data:");
System.out.printf("\nProduct name: ");
productName = input.nextLine();
System.out.printf("Product price: ");
productPrice = input.nextDouble();
input.nextLine();
System.out.printf("Product Quantity: ");
productQuantity = input.nextInt();
input.nextLine();

Product product4 = new Product(productName, productPrice);
OrderItem orderItem4 = new OrderItem(productQuantity , product4);
order3.addItem(orderItem4);

System.out.printf("\n%s", order3.getOrder());
System.out.printf("\n%s", order3.getOrderList());

client1.addOrderItem(order1);
client1.addOrderItem(order3);

System.out.printf("\n%s", client1.getClientOrderList());













input.close();
}
}
