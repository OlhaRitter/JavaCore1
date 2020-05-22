package onlinestore;

public class Basket {
    private Product product[];

    public Basket(Product[] product) {
        this.product = product;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }
}
