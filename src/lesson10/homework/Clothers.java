package lesson10.homework;

public abstract class Clothers {
    private int size;
    private int price;
    private String color;

    public Clothers(int size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
