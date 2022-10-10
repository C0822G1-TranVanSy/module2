package ss2_loop_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng 1: ");
        int m = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Nhập độ dài mảng 2: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] dst = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, dst, 0, arr1.length);
        System.arraycopy(arr2, 0, dst, arr1.length, arr2.length);
        System.out.println(Arrays.toString(dst));
    }

}
