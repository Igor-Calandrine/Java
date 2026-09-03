package aula12_Composicao.exercicio.ex3.entidades;

public class Product {
   private String name;
   private Double price;

   public Product(String name, Double price) {
      this.name = name;
      this.price = price;
   }

   public Product() {
   }

   public String getName() {
      return name;
   }

   public Double getPrice() {
      return price;
   }

   public void setName(String name) {
      this.name = name;
   }

}
