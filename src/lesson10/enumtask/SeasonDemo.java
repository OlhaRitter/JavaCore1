package lesson10.enumtask;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season1 = Season.SUMMER;
        //System.out.println(season);
        print(Season.WINTER);
        printAllValues();

        Season season2 = Season.valueOf("WINTER");
        System.out.println("2 "+season2);


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
    public static void printAllValues(){
        for (Season s:Season.values()){
            System.out.println(s+"1 "+s.getAvrTmp()+" "+s.getDescription());
        }
    }
}