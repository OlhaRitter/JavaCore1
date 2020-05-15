package lesson9.homework;

import java.util.Objects;

public class Pear extends Fruts {

private int price;

    public Pear(int weight, int price) {
        super(weight);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void weight() {
        System.out.println("Стоимость груши при " + getWeight()+" кг составляет "+getPrice()*getWeight());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pear)) return false;
        if (!super.equals(o)) return false;
        Pear pear = (Pear) o;
        return getPrice() == pear.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrice());
    }


}
