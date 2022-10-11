package ss5_access_modifier_static.exercise.exercise1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){}

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return getRadius()*getRadius()*Math.PI;
    }
}
