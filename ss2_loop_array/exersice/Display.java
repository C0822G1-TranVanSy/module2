package ss2_loop_array.exersice;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Vẽ hình chữ nhật \n" +
                "2. Vẽ hình tam giác \n" +
                "3. Vẽ hình tam giác cân \n" +
                "4. Exit");
        int num;
        do {
            System.out.print("Nhập lựa chọn hình bạn muốn vẽ: ");
            num = Integer.parseInt(scanner.nextLine());
            if (num < 0 || num > 4) {
                System.out.println("Nhập số trong lựa chọn, hãy nhập lại.");
            }
            switch (num){
                case 1:
                    System.out.print("Nhập chiều cao: ");
                    int m = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập chiều rộng: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("*" + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Nhập chiều cao: ");
                    int x = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i <= x; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*" + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = x; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*" + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Nhập chiều cao: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập chiều rộng: ");
                    int b = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i <= a; i++) {
                        for (int j = 0; j < b; j++) {
                            if (j - i < b / 2 && i + j > b / 2) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                case 4:
                    break;
            }
        } while (num < 0 || num > 4);

    }
}
