package casy_study.mvc.controllers;

import java.util.Scanner;

public class BookingManagement {
    public static void displayListBooking() {
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Return main menu");
        int choice;
        do {
            System.out.println("Nhập lựa chọn trong Menu Booking: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > 3) {
                System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
            }
            switch (choice) {
                case 1:
                    System.out.println("Thêm sách mới.");
                    break;
                case 2:
                    System.out.println("Hiện thị danh sách booking");
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
