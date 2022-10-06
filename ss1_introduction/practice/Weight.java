package ss1_introduction.practice;

import java.util.Locale;
import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double weight, height, bmi;
        System.out.println("Nhập cân nặng (kg): ");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao (m): ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("bmi");

        if (bmi < 18) {
            System.out.println(bmi + " Underweight");
        } else if (bmi < 25.0) {
            System.out.println(bmi + " Normal");
        } else if (bmi < 30.0) {
            System.out.println(bmi + " Overweight");
        } else {
            System.out.println(bmi + " Obese");
        }
    }
}
