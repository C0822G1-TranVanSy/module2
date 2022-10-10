package ss4_class_object.exercise.exercise1;

public class QuadraticEquation {
    private double a, b, c, delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return delta = this.b * this.b - 4 * this.a * this.c;
    }

    public void conditionA() {
        if (this.a == 0) {
            if (this.b == 0) {
                if (this.c == 0) {
                    System.out.println("Phương trình vô số nghiệm!");
                } else {
                    System.out.println("Phương trình vô nghiệm!");
                }
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-this.c / this.b));
            }
        }
    }

    public double getRoot1() {
        if (delta >= 0) {
            return (-this.b + Math.sqrt(delta)) / 2 * this.a;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (delta >= 0) {
            return (-this.b - Math.sqrt(delta)) / 2 * this.a;
        } else {
            return 0;
        }
    }
}
