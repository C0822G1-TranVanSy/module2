package ss7_abstractclass_interface.exercise.exercise1;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(4, 5);
        shapes[1] = new Circle(3);
        shapes[2] = new Square(5);
        int percent = (int) (Math.random() * (100 - 1 + 1) + 1);

        for (Shape shape : shapes) {
            System.out.println("Diện tích ban đầu");
            System.out.println(shape.getArea());
            System.out.println("Percent là: " + percent + "%");
            System.out.println("Diện tích sau khi tăng kích thước " + percent + "% là:");
            shape.resize(percent);
            System.out.println(shape.getArea() + "\n");
        }
    }

}
