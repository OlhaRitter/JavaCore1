package lesson9.homework;

public class Rose extends Flower {
    public Rose(String country, int day, int cost) {
        super(country, day, cost);
    }

    @Override
    public String toString() {
        return "Rose{} " + super.toString();
    }
}
