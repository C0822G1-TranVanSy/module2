package ss1_introduction.exersice;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bản: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
