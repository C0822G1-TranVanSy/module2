package casy_study.mvc.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {


        int choice;
        do {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.println("Nhập lựa chọn trong MainMenu: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    EmployeeManagement.displayListEmployees();
                    break;
                case 2:
                    CustomerManagement.displayListCustomers();
                    break;
                case 3:
                    FacilityManagement.displayListFacility();
                    break;
                case 4:
                    BookingManagement.displayListBooking();
                    break;
                case 5:
                    PromotionManagement.displayListPromotion();
                    break;
                case 6:
                    System.out.println("EXIT");
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
            }
        } while (true);
    }
}
