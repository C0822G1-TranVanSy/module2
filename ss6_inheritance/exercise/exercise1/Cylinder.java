package ss6_inheritance.exercise.exercise1;

public class Cylinder extends Circle {
    private double height = 5.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }

    public double getArea() {
        return 2 * getRadius() * Math.PI * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder :" +
                " height= " + height + "\n" +
                super.toString() + "\n" +
                "volume = " + getVolume();
    }
}
