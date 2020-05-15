package Lesson3;

import java.util.Scanner;

public class Chek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        System.out.print("Введите целые числа: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a + b);}
            else if (scanner.hasNextDouble()){
              a = scanner.nextDouble();
              b = scanner.nextDouble();
        System.out.println(a + b);}
        else{
                System.out.println("Вы ввели не число");
            }
    }}