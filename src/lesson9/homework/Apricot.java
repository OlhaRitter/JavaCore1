package lesson9.homework;

import java.util.Objects;

public class Apricot extends Fruts {
    int price1;

    public Apricot(int weight, int price1) {
        super(weight);
        this.price1 = price1;
    }

    public int getPrice1() {
        return price1;
    }

    public void setPrice1(int price1) {
        this.price1 = price1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apricot)) return false;
        if (!super.equals(o)) return false;
        Apricot apricot = (Apricot) o;
        return getPrice1() == apricot.getPrice1();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrice1());
    }

    @Override
    public void weight() {
        System.out.println("Стоимость Абрикоса при " + getWeight()+" кг составляет "+ getPrice1()*getWeight());
    }
}
