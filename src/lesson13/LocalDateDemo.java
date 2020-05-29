package lesson13;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Locale;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1999,6,20);
        LocalDate today = LocalDate.now();
        System.out.println(localDate);
        System.out.println(today);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(today.isAfter(localDate));
        System.out.println(today.isBefore(localDate));
        System.out.println(Locale.getDefault());
        System.out.println(Instant.now());
    }
}
