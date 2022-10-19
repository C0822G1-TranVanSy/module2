package ss11_stack_queue.exercise.exercise3;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập 1 số: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        String string = "";
        while (!stack.isEmpty()) {
            string += stack.pop();
        }

        System.out.println("Chuỗi nhị phân: " + string);
    }
}
