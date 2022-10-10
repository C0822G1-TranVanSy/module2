package ss2_loop_array.exercise;

public class Prime100 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            int count = 0;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(number);
            }
            number++;
        }
    }
}
