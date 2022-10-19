package casy_study.mvc.controllers;

import java.util.Scanner;

public class EmployeeManagement {
    public static void displayListEmployees() {
        System.out.println("1 Display list employees\n" +
                "2 Add new employee\n" +
                "3 Delete employee\n" +
                "4 Edit employee\n" +
                "5 Return main menu");
        int choice;
        do {
            System.out.println("Nhập lựa chọn trong Menu Employee: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > 5) {
                System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
            }
            switch (choice) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
