package lesson7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("0684253678", "Apple", 7.8); //первый
        Phone phone2 = new Phone("735984376894", "Samsung"); //второй конструктор
        Phone phone3 = new Phone(); //третий

//нам они не нужны, потому что создали конструтор
       /* phone1.number="0684253678";
        phone1.model="Apple";
        phone1.weight=7.8;

        phone2.number="735984376894";
        phone2.model="Samsung";
        phone2.weight=5.2;*/

        System.out.print(phone1.getNumber());
        System.out.println(phone1.getNumber());
       // System.out.println(phone1.weight);
        phone1.receiveCall("Мама");

        System.out.println();

        System.out.print(phone2.getNumber());
        System.out.println(phone2.getNumber());
        //System.out.println(phone2.weight);
        phone2.receiveCall("Папа");
        phone2.receiveCall("Сестра", "7985476985468");

//для пустого коонструктора
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getNumber());
        //System.out.println(phone3.weight);

        // phone1.receiveCall("Мама");
        // phone2. receiveCall("Папа");

        phone1.sendMessage("Message1111","00000000000000","111111111111111");
        phone2.sendMessage("2222222222222");
        System.out.println(Phone.getCount());
    }
}
