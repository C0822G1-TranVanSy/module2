package ss7_abstractclass_interface.exercise.exercise2;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        shapes[3] = new Square(4);

        for (Shape shape : shapes) {
            System.out.println("Diện tích: " + shape.getArea());
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}
