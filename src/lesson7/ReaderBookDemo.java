package lesson7;

public class ReaderBookDemo {
    public static void main(String[] args) {
        Reader name2 = new Reader("Olha", 3);
        Reader name3 = new Reader("Olha");
        Book autor1 = new Book();

        name2.takeBook(3);
        autor1.takebooks("Maugli","Kipling");
    }
}
