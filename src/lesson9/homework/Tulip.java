package lesson9.homework;

public class Tulip extends Flower {
    public Tulip(String country, int day, int cost) {
        super(country, day, cost);
    }
    @Override
    public String toString() {
        return "Tulip{} " + super.toString();
    }
}
