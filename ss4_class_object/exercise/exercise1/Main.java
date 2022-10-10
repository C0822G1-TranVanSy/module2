package ss4_class_object.exercise.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập c: ");
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (a == 0) {
            equation.conditionA();
        } else {
            if (equation.getDiscriminant() > 0) {
                System.out.print("Nghiệm thứ nhât: " + equation.getRoot1() + " Nghiệm thứ 2: " + equation.getRoot2());
            } else if (equation.getDiscriminant() == 0) {
                System.out.print("Phương trình có nghiệm kép: " + equation.getRoot1());
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }
}
