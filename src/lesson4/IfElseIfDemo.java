package lesson4;

public class IfElseIfDemo {
    public static void main(String[] args) {
        if ("1".equals(args[0])) {
            System.out.println("Monday");
        } else if ("2".equals(args[0])) {
            System.out.println("Tue");
        } else if ("3".equals(args[0])) {
            System.out.println("Wed");
        } else if ("4".equals(args[0])) {
            System.out.println("Thu");
        } else if ("5".equals(args[0])) {
            System.out.println("Wen");
        } else if ("6".equals(args[0]) || "7".equals(args[0])) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Error");
        }
    }
}

