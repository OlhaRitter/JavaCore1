package lesson10.print;

import java.util.Objects;

public class Magazine implements Printable {
   /* private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing magazine with name " + getName());
    }

    public static void printMagazine(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Magazine) {
                System.out.println(((Magazine) p).getName());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Magazine)) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(getName(), magazine.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }*/
}