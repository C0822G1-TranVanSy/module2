package ss2_loop_array.exersice;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Nhập phân tử thứ " + i + " :\t");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Nhập số cần chèn: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vị trí muốn chèn: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (index == i) {
                    for (int j = array.length - 1; j > i; j--) {
                        array[j] = array[j - 1];
                    }
                    array[index] = x;
                    break;
                }
            }
            System.out.println(Arrays.toString(array));
        }

    }
}
