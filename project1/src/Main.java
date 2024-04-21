import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Product e1 = new ElectronicProduct(1,"smartphone",599.99f,"Sumsumg",1);
      Product c1 = new ClothingProduct(2,"T-shirt",19.99f,"Medium","Cotton");
      Product b1= new BookProduct(3,"OOP",39.99f,"O’Reilly","X Publications");
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your id");
        int id=input.nextInt();
        System.out.println("Please enter your name");
        String name =input.next();
        System.out.println("Please enter your address");
        String address =input.next();
        System.out.println("How many products you want to add to your cart?");
        int nproducts=input.nextInt();
        Customer cu1= new Customer(id,name,address);
        Order o1=new Order();
        o1.setnProducts(nproducts);
        for (int i=0;i<nproducts;i++ ){
          System.out.println("Which products would you like to add? 1-Smartphone  2-T-Shirt  3-OOP");
        int x =input.nextInt();
        switch (x) {
          case 1:
            o1.addProduct(e1);
            break;
          case 2:
            o1.addProduct(c1);
            break;
          case 3:
            o1.addProduct(b1);
            break;
          default:
            System.out.println("wrong number");
        }

      }


o1.calculatePrice();
        System.out.print("would you like to please the order? 1-Yas  2-No");
        int y =input.nextInt();
        switch (y){
          case 1:
            o1.setCustomerId(1);
            o1.printOrderInfo();
          case 2:
            System.out.print("thanks for use our E-Commerce ");
        }





















    }
}