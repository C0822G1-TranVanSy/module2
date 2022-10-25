package ss15_exception.exercise;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập y: ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập z: ");
        int z = Integer.parseInt(scanner.nextLine());
        try {
            checkTriangle(x,y,z);
        } catch (IllegalTriangleException e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    private static void checkTriangle(int a, int b, int c) throws IllegalTriangleException{
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("3 cạnh của tam giác phải lớn hơn 0");
        }else if(a >= b + c || b >= a + c || c >= a + b){
            throw new IllegalTriangleException("Không phải là 3 cạnh của 1 tam giác");
        }
        System.out.println("Là 3 cạnh của tam giác");
    }
}
