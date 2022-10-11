package ss5_access_modifier_static.exercise.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        double r = Double.parseDouble(scanner.nextLine());
        Circle circle = new Circle(r);

        System.out.print("Diện tích hình tròn: " + circle.getRadius());
        System.out.print("Diện tích hình tròn: " + circle.getArea());
    }
}
