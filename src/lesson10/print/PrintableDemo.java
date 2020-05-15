package lesson10.print;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");

        Magazine magazine = new Magazine("mag1");
        Magazine magazine1 = new Magazine("mag2");

        Printable[] printables = {book1, book2, magazine, magazine1};

        for (Printable p : printables) {
            p.print();
        }

        Magazine.printMagazine(printables);
    }
}