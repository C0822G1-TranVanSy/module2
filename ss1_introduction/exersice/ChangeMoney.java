package ss1_introduction.exersice;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền (USD): ");
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println("Chuyển sang VND: " + vnd);
    }
}
