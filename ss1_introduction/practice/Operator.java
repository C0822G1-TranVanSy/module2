package ss1_introduction.practice;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều dài: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Diện tích là: " + area);

    }
}
