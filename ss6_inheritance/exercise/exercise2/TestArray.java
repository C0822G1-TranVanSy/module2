package ss6_inheritance.exercise.exercise2;

public class TestArray {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXy(3,4);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        point3D.setXyz(5,4,2.3f);

        System.out.println(point3D);
    }
}
