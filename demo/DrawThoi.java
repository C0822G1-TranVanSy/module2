package demo;

public class DrawThoi {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j + i == 4 || j - i == 5) {
                    System.out.print(i + 1 + " ");
                } else if (i - j == 4 || j + i == 13) {
                    System.out.print(9 - i + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
