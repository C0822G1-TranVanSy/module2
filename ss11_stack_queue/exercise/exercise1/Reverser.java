package ss11_stack_queue.exercise.exercise1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Reverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] array = new int[size];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            array[i] = Integer.parseInt(scanner.nextLine());
            stack.push(array[i]);
        }

        System.out.println("Mảng array: " + Arrays.toString(array));

        System.out.println("Stack: " + stack);

            for (int i = 0; i < size; i++) {
                array[i] = stack.pop();
            }

        System.out.println("Mảng array đã đảo ngược: " + Arrays.toString(array));

    }
}
