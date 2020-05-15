package lesson9.homework;

import lesson9.Shape;

import java.util.Objects;

public class Flower {
    private String country;
    private int day;
    private int cost;

    public Flower(String country, int day, int cost) {
        this.country = country;
        this.day = day;
        this.cost = cost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;
        Flower flower = (Flower) o;
        return getDay() == flower.getDay() &&
                getCost() == flower.getCost() &&
                Objects.equals(getCountry(), flower.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry(), getDay(), getCost());
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", day=" + day +
                ", cost=" + cost +
                '}';
    }
   //public static void summ()
  // {
   //    System.out.println();
   //}

    public static void main(String[] args) {
        Flower[] bouquet = new Flower[5];
        Romashka bouquet1 = new Romashka("USA", 7, 150);
        Romashka bouquet2 = new Romashka("TGL", 2, 100);
        Rose bouquet3 = new Rose("Ital", 15, 123);
        Rose bouquet4 = new Rose("USA", 8, 55);
        Tulip bouquet5 = new Tulip("Grenl", 12, 15);

        bouquet[0]=bouquet1;
        bouquet[1]=bouquet2;
        bouquet[2]=bouquet3;
        bouquet[3]=bouquet4;
        bouquet[4]=bouquet5;

      //  System.out.println();



}
}

