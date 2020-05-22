package lesson10.homework;

public class Skirt extends Clothers implements WomenClothing {
    public Skirt(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Информация о юбке: " +"цвет- "+super.getColor()+" цена: "+ super.getPrice()+" размер: "+ super.getSize());
    }
}
