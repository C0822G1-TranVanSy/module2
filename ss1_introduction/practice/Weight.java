package ss1_introduction.practice;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập cân nặng (kg): ");
        weight = sc.nextDouble();
        System.out.println("Nhập chiều cao (m): ");
        height = sc.nextDouble();
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
