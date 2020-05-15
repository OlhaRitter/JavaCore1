package lesson9;

import java.util.Objects;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return getColor().equals(shape.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor());
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle1 = new Circle("red", 3, 4, 45);
        Circle circle2 = new Circle("yellow", 7, 45, 145);
        Circle circle3 = new Circle("yellow", 7, 45, 145);
        Tangle tangle = new Tangle("blue", 5, 5, 6, 7);

        shapes[0] = circle1;
        shapes[1] = circle2;
        shapes[2] = tangle;

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape);
        }

        System.out.println(circle2.equals(circle3));
        System.out.println(circle2==circle3);
    }
}
