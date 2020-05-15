package lesson8;

public class Student {
    String firstName, lastName, group;
    double avergeMark;

    public Student(String firstName, String lastName, String group, double avergeMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avergeMark = avergeMark;
    }

    public Student() {
    }

    public double getScholarships() {
        return avergeMark == 5 ? 100 : 80;
    }
}