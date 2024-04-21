public class Cart {
    protected int customerId;
    protected int nProducts;
    protected Product[] products;
    protected int counter;


    public int getCustomerId() {
        return customerId;
    }

    public int getnProducts() {
        return nProducts;
    }



    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
        this.products=new Product[nProducts];
    }

    public void addProduct(Product product){
        products[counter++]=product;
        System.out.println("New product added "+product.name);

    }
    public void removeProduct(Product product){
        for(int i=0;i<nProducts;i++){
            if(products[i].getProductId()==product.getProductId()){
                products[i]=null;
            }
        }
        System.out.println("Remove product "+product.name);
    }
    public void calculatePrice(){
     int Price =0;
     for (int i=0;i<nProducts;i++ ){
        if (products[i]==null)
            continue;
         Price+=products[i].price;
     }
     System.out.println("Total prise :$"+Price);
    }


}

