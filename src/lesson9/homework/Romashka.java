package lesson9.homework;

public class Romashka extends Flower {
    public Romashka(String country, int day, int cost) {
        super(country, day, cost);
    }

    @Override
    public String toString() {
        return "Romashka{} " + super.toString();
    }
}
