package lesson12;

import java.util.Formatter;

public class FormaterDemo {
    public static void main(String[] args) {
        print("Винокур", 5, "Математикe");
        print("Харченко", 4, "Русскому");
    }
    private static void print(String fullName, int mark, String subject){
        Formatter formatter= new Formatter();
        //formatter.format("Студент %-10s получил %-3s по %-10s", fullName, mark, subject);
        System.out.printf("Студент %-10s получил %-3s по %-10s. \n", fullName, mark, subject);
        System.out.format("Студент %-10s получил %-3s по %-10s. \n", fullName, mark, subject);
        System.out.println(formatter);
    }
}