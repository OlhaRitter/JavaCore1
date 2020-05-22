package onlinestore;

public class Product {
    private String nameOfProduct;
    private int priceOfProduct;
    private int ratingOfProduct;

    public Product(String nameOfProduct, int priceOfProduct, int ratingOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.ratingOfProduct = ratingOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(int priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public int getRatingOfProduct() {
        return ratingOfProduct;
    }

    public void setRatingOfProduct(int ratingOfProduct) {
        this.ratingOfProduct = ratingOfProduct;
    }
}