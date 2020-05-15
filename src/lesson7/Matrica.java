package lesson7;

import java.util.Scanner;

public class Matrica {
    public static void main(String[] args) {

        int a[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int b[][] = {{10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}};
        int c[][] = new int[3][3];
        int y = 0;
       //Вывод начальной матрицы
        System.out.println("Начальная матрица:");
        System.out.println("1 2 3   10 11 12");
        System.out.println("4 5 6   13 14 15");
        System.out.println("7 8 9   16 17 18");
        System.out.println();

        //Сложение матрицы
        System.out.println("Сложение с другой матрицей:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Умножение матрицы
        Scanner scanner = new Scanner(System.in);
        System.out.println("Умножение на число");
        System.out.print("Введите число на котрое вы хотите умножить матрицу: ");
        if (scanner.hasNextInt()) {
            y = scanner.nextInt();
            {
                Scanner matrix = new Scanner(System.in);
                System.out.print("Введите какую матрицу вы хотите умножить умножить матрицу: ");
                if (matrix.hasNextInt()) {
                    int i = matrix.nextInt();
                    switch (i) {
                        case 1:
                            for (int t = 0; t < 3; t++) {
                                for (int j = 0; j < 3; j++) {
                                    c[t][j] = a[t][j] * y;
                                    System.out.print(c[t][j] + " ");
                                }
                                System.out.println();
                            }
                        case 2:
                            for (int t = 0; t < 3; t++) {
                                for (int j = 0; j < 3; j++) {
                                    c[t][j] = b[t][j] * y;
                                    System.out.print(c[t][j] + " ");
                                }
                                System.out.println();
                            }
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Умножение матриц");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}