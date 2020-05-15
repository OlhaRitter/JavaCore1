package lesson8;

public class Aspirant extends Student {
    String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double avergeMark, String scienceWork) {
        super(firstName, lastName, group, avergeMark);
        this.scienceWork = scienceWork;
    }

    public Aspirant(String scienceWork) {
        super();
        this.scienceWork = scienceWork;
    }


}
