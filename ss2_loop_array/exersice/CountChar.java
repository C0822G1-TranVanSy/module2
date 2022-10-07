package ss2_loop_array.exersice;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập 1 ký tự muốn kiểm tra: ");
        char c = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        System.out.printf("Số lần ký tự %c xuất hiện trong %s: %d", c, str, count);
    }
}
