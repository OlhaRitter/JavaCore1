package unv;

import java.util.Scanner;

public class Help
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целые числа: ");
        if (scanner.hasNextInt())
        {
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("При выборе числа " + i + " день недедли совпадает с Monday");
                    break;
                case 2:
                    System.out.println("При выборе числа " + i + " день недедли совпадает с Thuesday");
                    break;
                case 3:
                    System.out.println("При выборе числа " + i + " день недедли совпадает с Wednesday");
                    break;
                case 4:
                    System.out.println("При выборе числа " + i + " день недедли совпадает с Thursday");
                    break;
                case 5:
                    System.out.println("При выборе числа " + i + " день недедли совпадает с Friday");
                    break;
                case 6:
                case 7:
                    System.out.println("При выборе числа " + i + " день недедли совпадает с Weekend");
                    break;

                default:
                    System.out.println();
            }
        }
    }
}
