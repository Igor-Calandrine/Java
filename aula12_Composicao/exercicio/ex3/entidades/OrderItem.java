package aula12_Composicao.exercicio.ex3.entidades;

public class OrderItem {
   private Product product;
   private Double price;
   private Integer quantity;

   public OrderItem(Integer quantity, Product product) {
      this.product = product;
      this.price = product.getPrice();
      this.quantity = quantity;
   }

   public OrderItem() {
   }

   public Product getProduct() {
      return product;
   }

   public Double getPrice() {
      return price;
   }

   public Integer getQuantity() {
      return quantity;
   }

   public void setProduct(Product product) {
      this.product = product;
   }

   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   public Double getSubTotal() {
      Double subTotal = quantity * price;
      return subTotal;
   }

}
