package ss7_abstractclass_interface.practice.practice2;

public class Circle {
    private double radius = 1.0;
    private String color = "green";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", color='" + color + '\''
                + ", area= " + getArea();
    }
}
