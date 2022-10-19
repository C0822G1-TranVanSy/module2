package ss11_stack_queue.exercise.exercise1;

import java.util.Scanner;
import java.util.Stack;

public class ReverserString {
    public static void main(String[] args) {
        Stack<Character> wStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String mWord = scanner.nextLine();

        for (int i = 0; i < mWord.length() ; i++) {
            wStack.push(mWord.charAt(i));
        }
        System.out.println(wStack);

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < mWord.length(); i++) {
            newString.append(wStack.pop());
        }
        System.out.println(newString);

    }
}
