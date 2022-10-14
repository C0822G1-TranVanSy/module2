package casy_study.mvc.controllers;

import java.util.Scanner;

public class FuramaController {
    int option;
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {

        do {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management \n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.println("Nhập lựa chọn trong menu: ");
            option = Integer.parseInt(scanner.nextLine());
            if (option > 6 || option < 1) {
                System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
            }

            switch (option) {
                case 1:
                    System.out.println("1 Display list employees\n" +
                            "2 Add new employee\n" +
                            "3 Delete employee\n" +
                            "4 Edit employee\n" +
                            "5 Return main menu");

                    do {
                        System.out.println("Nhập lựa chọn: ");
                        option = Integer.parseInt(scanner.nextLine());
                        if (option < 1 || option > 5) {
                            System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
                        }
                    } while (option != 5);
                    break;
                case 2:
                    System.out.println("1. Display list customers\n" +
                            "2. Add new customer\n" +
                            "3. Edit customer\n" +
                            "4. Return main menu");
                    break;
                case 3:
                    System.out.println("1 Display list facility\n" +
                            "2 Add new facility\n" +
                            "3 Display list facility maintenance\n" +
                            "4 Return main menu");
                    break;
                case 4:
                    System.out.println("1. Add new booking\n" +
                            "2. Display list booking\n" +
                            "3. Return main menu");
                    break;
                case 5:
                    System.out.println("1. Display list customers use service\n" +
                            "2. Display list customers get voucher\n" +
                            "3. Return main menu");
                case 6:
                    System.out.println(" ");
            }
        } while (option != 6);
    }
}
