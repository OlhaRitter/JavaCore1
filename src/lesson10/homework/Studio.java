package lesson10.homework;

public class Studio {
    public static void main(String[] args) {
        Skirt skirt = new Skirt(32, 25, "blue");
        Tshirt tshirt = new Tshirt(36, 30, "red");
        Trousers trousers = new Trousers(40, 150, "blue");
        Tie tie = new Tie(32, 5, "black");

        skirt.dressWomen();
        tshirt.dressWomen();
        trousers.dressWomen();
        tie.dressMan();
        trousers.dressMan();
        tshirt.dressMan();
    }
}
