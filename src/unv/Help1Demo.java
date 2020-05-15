package unv;

import java.util.Scanner;

public class Help1Demo {
    public static void main(String[] args) {
        Help1 help = new Help1();
        Scanner scanner = new Scanner(System.in);
        help.showmenu();
        for (int a = 0; a < 5; a++) {
        System.out.print("Введите целые числа: ");
            if (scanner.hasNextInt()) {
                int what = scanner.nextInt();
                help.helpon(what);
            }
        }
    }
}
