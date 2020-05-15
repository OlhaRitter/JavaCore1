package com.company;

public class Calculate {
    public static void main(String[] args) {
        int x = sum(4, 3);
        System.out.println("При сумме чисел 4 и 3 получается " + x);
        int y = minus(7, 3);
        System.out.println("При разнице чисел 7 и 3 получается " + y);
        int a = mult(2, 5);
        System.out.println("При умножении чисел 5 и 5 получается " + a);
        int b = div(10, 5);
        System.out.println("При делении чисел 10 и 5 получается " + b);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int mult(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }
}
