package ss2_loop_array.exercise;

import java.util.Arrays;

public class SumDiagonalLine {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == arr[i].length - i - 1) {
                    sum += arr[i][j];
                }
            }
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(sum);
    }
}
