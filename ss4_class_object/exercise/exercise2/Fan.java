package ss4_class_object.exercise.exercise2;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn() {
        this.on = true;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (isOn()) {
            return "speed=" + getSpeed() +
                    ", radius=" + getRadius() +
                    ", color='" + getColor() + '\t' + " fan is on";
        } else {
            return "radius=" + getRadius() +
                    ", color='" + getColor() + '\t' + " fan is off";
        }
    }
}
