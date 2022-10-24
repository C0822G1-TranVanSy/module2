package ss14_sort_algorithm.exercise.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortAlgorithm {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > element; j--) {
                System.out.println("Đổi chỗ phẩn từ thứ: " + (j + 1) + " cho đến phần tử: " + j);
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = element;
            System.out.println("Gán giá trị " + arr[j + 1] + " tại vị trí: " + (j + 1));
            System.out.println("Mảng sau khi chèn phần từ có giá trị = " + arr[j + 1]
                    + " vào vị trí có index = " + (j + 1) + " là: " + Arrays.toString(arr) +"\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa nhập: " + Arrays.toString(array));

        insertSort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
    }
}
