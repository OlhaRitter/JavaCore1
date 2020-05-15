package unv;

public class Time
{
    private static void salary(double salary, double hours) {
        if (hours > 60) {
            hours = 60;
        }
        if (hours > 40) {
            hours = 40 + (hours - 40) * 1.5;
        }
        if (salary < 200) {
            salary = 200;
        }
        System.out.println("при зарплате за час  " + salary +" часах работы " + hours+ " заработок составит " + (salary * hours));
    }
    public static void main(String[] args) {
        salary(300, 10);
        salary(500, 55);
        salary(400, 40);
    }
}