package ss7_abstractclass_interface.exercise.exercise2;

public class Square extends Shape implements Colorable {
    private double side = 1;
    public void howToColor(){
        System.out.println("Color all four sides \n");
    }
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

}
