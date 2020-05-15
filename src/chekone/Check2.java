package chekone;

import check.Chek1;

public class Check2 extends Chek1 {

    String type;

    public Check2(int year, String name, String type) {
        super(year, name);
        this.type = type;
    }

    public void peppe(int year, String name, String type){
        System.out.println("Возраст человека " + year + " по имени " + name + "c видом " + type);
    }

}
