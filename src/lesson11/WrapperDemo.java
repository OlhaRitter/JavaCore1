package lesson11;

public class WrapperDemo {
    public static void main(String[] args) {
        Double double1= 2.5;
        Double double2=4.7;

        Double double4=Double.valueOf((double)3.3);
        Double double3=Double.valueOf("7.6");

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
    }
}