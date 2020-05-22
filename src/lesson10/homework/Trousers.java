package lesson10.homework;

public class Trousers extends Clothers implements MenClothing,WomenClothing {
    public Trousers(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println( "Информация о штанах: "+ "цвет- "+super.getColor()+" цена: "+ super.getPrice()+" размер: "+ super.getSize());

    }

    @Override
    public void dressWomen() {
        System.out.println( "Информация о штанах: "+"цвет- "+super.getColor()+" цена: "+ super.getPrice()+" размер: "+ super.getSize());
    }
}
