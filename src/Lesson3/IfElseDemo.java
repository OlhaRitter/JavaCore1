package Lesson3;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            compareNamber(number);
        } else {
            System.out.println("значение введено не верно");
        }
    }

    private static void compareNamber(int number) {
        if (number > 0 && number < 10) {
            System.out.println("положительное число меньше 10");
        } else {
            System.out.println("значение введено не верно больше 10");
        }
    }
}
