package lesson10.homework;

public class Tie extends Clothers implements MenClothing {
    public Tie(int size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public  void dressMan() {
        System.out.println("Информация о галстуке: "+"цвет- "+super.getColor()+" цена: "+ super.getPrice()+" размер: "+ super.getSize());
    }
}
