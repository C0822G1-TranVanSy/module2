package ss6_inheritance.exercise.exercise1;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3, "yellow", 10);
        System.out.println(cylinder);
    }
}
