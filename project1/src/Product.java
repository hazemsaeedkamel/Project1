public class Product {
   protected int  productId  ;
protected String name ;
protected double price;

   public void setProductId(int productId) {
      this.productId = productId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setPrice(float price) {
      this.price = price;
   }

   public int getProductId() {
      return productId;
   }

   public String getName() {
      return name;
   }

   public double getPrice() {
      return price;
   }

   public Product(int productId, String name, float price) {
      this.productId = productId;
      this.name = name;
      this.price = price;
   }
}
