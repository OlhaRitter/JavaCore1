package check;

public class Chek1 {

    //Private метод
    /*private int year;
    private String name;*/

    //default метод
    /*int year;
    String name;*/

    // public
   /* public int year;
    public String name;*/

    // protected
    protected int year;
    protected String name;

    public Chek1(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public void person(int year, String name) {
        System.out.println("Возраст человека " + year + " по имени " + name);
    }
}
