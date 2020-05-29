package lesson14;

import lesson7.Phone;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer <Phone> consumer = phone -> System.out.println("Продам телефон "+ phone);
        Consumer <Phone> consumer1 = phone -> System.out.println("Jnghfktv  телефон "+ phone);


        consumer.andThen(consumer1).accept(new Phone("676766","Iphone", 7));


    }
}
