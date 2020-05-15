package lesson8;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("ivanov", "Serhii", "Group1", 4);
        Student student2 = new Student("Pavlov", "Serhii", "Group1", 5);
        Aspirant aspirant1 = new Aspirant("Petr", "Petrov", "group1", 5, "Science");
        Student aspirant2 = new Aspirant("Sasha", "Ovchar", "group2", 3, "Science");
        Student[] students = {student1, student2};

        // System.out.println(aspirant1.firstName + " " + aspirant1.lastName + " " + aspirant1.group + " " + aspirant1.avergeMark + aspirant1.scienceWork);
        // System.out.println(aspirant2.firstName + " " + aspirant2.lastName + " " + aspirant2.group + " " + aspirant2.avergeMark);

        for (Student student : students) {
            System.out.println(aspirant1.firstName + " " + aspirant1.lastName + " " + aspirant1.group + " " + aspirant1.avergeMark + aspirant1.scienceWork);
        }
    }
}


