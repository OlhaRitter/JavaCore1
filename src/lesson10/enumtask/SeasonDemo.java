package lesson10.enumtask;

public class SeasonDemo {
    public static void main(String[] args) {
        //Season season = Season.SUMMER;
        //System.out.println(season);
        print(Season.WINTER);
    }
    public static void print(Season season){
        switch (season){
            case WINTER:
                System.out.println("I like winter!!");
                break;
            case SPRING:
                System.out.println("I like spring!!");
                break;
            case SUMMER:
                System.out.println("I like summer!!");
                break;
            case AUTUMN:
                System.out.println("I like autumn!!");
                break;
        }
    }
}