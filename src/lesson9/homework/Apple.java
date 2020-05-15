package lesson9.homework;

import java.util.Objects;

public class Apple extends Fruts {
   int price2;

    public Apple(int weight, int price2) {
        super(weight);
        this.price2 = price2;
    }

    public int getPrice2() {
        return price2;
    }

    public void setPrice2(int price2) {
        this.price2 = price2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple)) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return getPrice2() == apple.getPrice2();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrice2());
    }

    @Override
    public void weight() {
        System.out.println("Стоимость груши при " + getWeight()+" кг составляет "+getPrice2()*getWeight());
    }
}
