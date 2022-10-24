package ss14_sort_algorithm.exercise.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > element; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = element;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập size: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Mảng vừa nhập: ");
        System.out.println(Arrays.toString(numbers));

        insertSort(numbers);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(numbers));
    }
}
