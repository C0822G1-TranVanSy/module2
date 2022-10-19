package ss11_stack_queue.practice.practice1;

import static ss11_stack_queue.practice.practice1.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        MyGenericStack myGenericStack = new MyGenericStack();
        System.out.println("1. Stack of integers");
        MyGenericStack.stackOfIntegers ();
        System.out.println("\n2. Stack of Strings");
        MyGenericStack.stackOfIStrings();
    }

}
