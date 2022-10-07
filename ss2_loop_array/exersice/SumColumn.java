package ss2_loop_array.exersice;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int column;
        int sum = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập cột bạn muốn chọn: ");
            column = Integer.parseInt(scanner.nextLine());
            if (column > arr.length || column < 0) {
                System.out.println("Nhập lại số cột cho đúng");
            }
        } while (column > arr.length || column < 0);
        for (int[] ints : arr) {
            sum += ints[column];

        }
        System.out.print("Tổng của cột " + column + " là: " + sum);
    }
}
