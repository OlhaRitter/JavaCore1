package unv;

import java.util.Scanner;

public class Help1 {
    Help1( ) {
    }
    void helpon (int what){
        switch (what) {
            case 1:
                System.out.println("При выборе числа " + what + " день недедли совпадает с Monday");
                break;
            case 2:
                System.out.println("При выборе числа " + what + " день недедли совпадает с Thuesday");
                break;
            case 3:
                System.out.println("При выборе числа " + what + " день недедли совпадает с Wednesday");
                break;
            case 4:
                System.out.println("При выборе числа " + what + " день недедли совпадает с Thursday");
                break;
            case 5:
                System.out.println("При выборе числа " + what + " день недедли совпадает с Friday");
                break;
            case 6:
            case 7:
                System.out.println("При выборе числа " + what + " день недедли совпадает с Weekend");
                break;

            default:
                System.out.println();
        }

    }
    void showmenu() {
        System.out.println("Подсказка дня недели");
        System.out.println("Для выбора дня недели, введите число");
        System.out.println("Программа генерирует число и сосоптавляет с днем недели");
        System.out.println("Происходит вывод дня недели");
    }
}
