package ss2_loop_array.exersice;

import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = Integer.parseInt(scanner.nextLine());
        int N = 2;
        int sum = 0;
        while (sum < numbers) {
            int count = 0;
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                sum++;
                System.out.println(N);
            }
            N++;
        }

    }
}
