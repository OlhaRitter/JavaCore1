package lesson14;

import java.util.function.Supplier;
import java.util.function.IntFunction;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier=()-> (int)(Math.random()*10);
        IntFunction<String> function = i -> String.valueOf(i);
        System.out.println(function.apply(450));
IntFunction <String> function1 = String::valueOf;
        System.out.println(function1.apply(450));
        System.out.println (supplier.get());

        Supplier<String> newString =String::new;
        System.out.println(newString.get());

    }
}
