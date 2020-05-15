package lesson9.homework;

import lesson9.Shape;

import java.util.Objects;

public abstract class Fruts {
    private int weight;

    public Fruts(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void weight();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruts)) return false;
        Fruts fruts = (Fruts) o;
        return getWeight() == fruts.getWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }



    final void printManufacturerInfo() {
        System.out.println("Made in Ukraine");

    }

    public static void main(String[] args) {
        Fruts[] fruts = new Fruts[5];
        Apple apple = new Apple(2, 15);
        Apple apple1 = new Apple(1, 15);
        Pear pear = new Pear(5, 10);
        Pear pear1 = new Pear(1, 10);
        Apricot apricot = new Apricot(4, 20);
        Apricot apricot1 = new Apricot(5, 2);
        fruts[0]=apple;
        fruts[1]=apple1;
        fruts[2]=pear;
        fruts[3]=pear1;
        fruts[4]=apricot;
        //fruts[5] = apricot1;

        for (Fruts buy : fruts) {
            buy.weight();
        }

    }
}
