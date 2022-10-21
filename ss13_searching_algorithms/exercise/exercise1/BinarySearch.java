package ss13_searching_algorithms.exercise.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 100, -10, 4, 3, 5, 6};
        Arrays.sort(array);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn tìm trong mảng: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(searchBinary(array, 0, array.length - 1, number));
    }

    public static int searchBinary(int[] arr, int left, int right, int value) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            }

            if (value > arr[mid]) {
                return searchBinary(arr, mid + 1, right, value);
            }

            return searchBinary(arr, left, mid - 1, value);
        }
        return -1;
    }
}
