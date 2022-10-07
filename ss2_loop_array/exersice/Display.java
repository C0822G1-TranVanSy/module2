package ss2_loop_array.exersice;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Vẽ hình chữ nhật \n" +
                "2. Vẽ hình tam giác \n" +
                "3. Vẽ hình tam giác cân \n" +
                "4. Exit");
        int number;
        do {
            System.out.print("Nhập lựa chọn hình bạn muốn vẽ: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number > 4) {
                System.out.println("Nhập số trong lựa chọn, hãy nhập lại.");
            }
            switch (number){
                case 1:
                    System.out.print("Nhập chiều cao: ");
                    int height = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập chiều rộng: ");
                    int weight = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < weight; j++) {
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
                    int weight1 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập chiều rộng: ");
                    int height1 = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i <= weight1; i++) {
                        for (int j = 0; j < height1; j++) {
                            if (j - i < height1 / 2 && i + j > height1 / 2) {
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
        } while (number < 0 || number > 4);

    }
}
