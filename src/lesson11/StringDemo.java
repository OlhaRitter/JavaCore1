package lesson11;

public class StringDemo {
    public static void main(String[] args) {
compareString("I like Java!!");
compareString("I like .Net");
compareString("I hate c++!!!");
    }
    private static void compareString(String str){
        System.out.println(str);
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
    }
}
                                   