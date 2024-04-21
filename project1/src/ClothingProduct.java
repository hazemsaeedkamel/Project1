public class ClothingProduct extends Product {
    protected String size;
    protected String fabric;

    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public ClothingProduct(int productId, String name, float price, String size, String fabric) {
        super(productId, name, price);
        this.size = size;
        this.fabric = fabric;
    }
}
