package lesson7;

import java.util.Arrays;
import java.util.Objects;

public class Phone {
    private String number;
    private String model;
    private double weight;
    private static int count;

    //this
    public Phone(String n, String m, double w) {
        this(n, m);
        weight = w;
        count++;

    }

    public Phone(String n, String m) {
        number = n;
        model = m;
        count++;
    }

    public Phone() {
        count++;
    }

    /*//конструктор
    Phone(String n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }
    //конструктор для двух переменных, третья будет нуль
    Phone(String n, String m) {
        number = n;
        model = number;
    }
    // пустой класс, нужно отдельно обьявлять переменные
    Phone() {
    }*/
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }


    static int getCount() {
        return count;
    }

    // метод кто звонил
    void receiveCall(String name) {
        System.out.println(" Calling: " + name);
    }

    //перегрузка метода
    void receiveCall(String name, String number) {
        System.out.println(" Calling: " + name + " with number " + number);
        System.out.println("My number " + this.number);
    }

    // получение номера
    //public String getNumber() {
     //   return number;
    //}

    //public void setNumber(String number) {
        //this.number = number;
    //}

    void sendMessage(String message, String... numbers) {
        System.out.println("Message " + message + " is sending to: " + Arrays.toString(numbers));
        //System.out.println(Arrays.toString(numbers));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Objects.equals(getNumber(), phone.getNumber()) &&
                Objects.equals(getModel(), phone.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getModel());
    }
}
