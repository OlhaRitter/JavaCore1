package lesson7;

public class Reader {

    String fullName;
    int numberTicket;
    String faculty;
    String db;
    int phoneNumber;
    int books;
    Reader (String fullName){
        this.fullName = fullName;
    }
    Reader (String fullName, int books){
        this.fullName = fullName;
        this.books = books;
    }
    void takeBook(String fullName){
        System.out.println( fullName);
    }
    void takeBook (int books){
        System.out.println(fullName + " взял "+books+" книги");
    }
    void takeBook(){
        System.out.println(fullName + "взял книги: Приключения, Словарь, Энциклопедия");
    }
}
