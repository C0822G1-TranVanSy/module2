package ss11_stack_queue.exercise.exercise4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = scanner.nextLine();
        String[] stringArr = string.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (String str : stringArr) {
            stack.push(str.toLowerCase());
            queue.add(str.toLowerCase());
        }

        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();

        while (!stack.isEmpty() && !queue.isEmpty()){
            string1.append(stack.pop());
            string2.append(queue.poll());
        }

        if(string1.toString().equals(string2.toString())){
            System.out.println("Đây là chuỗi Palindrome");
        }else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }
    }

}
