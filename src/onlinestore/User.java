package onlinestore;

import java.util.Scanner;

public class User {
    private String login;
    private int password;
    Basket basket;

    public User(String login, int password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

 ///this
    public static void avtorizacia(String login, int password){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваш логин: ");
        if (scanner.hasNext()) {
            login=scanner.nextLine();
        } else {
            System.out.println("Введены не буквы");
    }
        System.out.print("Введите Ваш пароль: ");
        if (scanner.hasNextInt()) {
            password=scanner.nextInt();
        } else {
            System.out.println("Введены не цифры");
        }
    }
}
