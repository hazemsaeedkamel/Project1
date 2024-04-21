public class Order extends Cart {

    protected int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public void  printOrderInfo(){
        System.out.println("Customer Id:"+customerId);
        for (int i=0;i<products.length;i++) {
            if (products[i]==null)
                continue;
            System.out.println(products[i].name + "-$" + products[i].price);
        }
        this.calculatePrice();
        }
    }

