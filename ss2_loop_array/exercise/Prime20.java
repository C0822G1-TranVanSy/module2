package ss2_loop_array.exercise;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = Integer.parseInt(scanner.nextLine());
        int number = 2;
        int sum = 0;
        while (sum < numbers) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                sum++;
                System.out.println(number);
            }
            number++;
        }

    }
}
