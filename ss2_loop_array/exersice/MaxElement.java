package ss2_loop_array.exersice;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài hàng: ");
        int m = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập độ dài cột: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[m][n];
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử thứ: [" + i + "] [" + j + "]: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.print("Giá trị lớn nhất trong mảng: " + max);

    }

}
