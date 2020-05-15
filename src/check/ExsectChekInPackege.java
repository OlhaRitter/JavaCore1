package check;

public class ExsectChekInPackege extends Chek1 {
     String male;

    public ExsectChekInPackege(int year, String name, String male) {
        super(year, name);
        this.male = male;
    }

    public void personcontin(int year,String name, String male)
    {
        System.out.print("Возраст человека "+year + " по имени " + name+ "c полом " + male);
    }

}
