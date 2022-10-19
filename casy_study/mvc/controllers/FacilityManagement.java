package casy_study.mvc.controllers;

import java.util.Scanner;

public class FacilityManagement {
    public static void displayListFacility() {
        System.out.println("1. Display list facility\n" +
                "2. Add new facility\n" +
                "3. Display list facility maintenance\n" +
                "4. Return main menu");
        int choice;
        do {

            System.out.println("Nhập lựa chọn trong Menu Facility: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > 4) {
                System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
            }
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị danh sách Facility");
                    break;
                case 2:
                    System.out.println("Thêm Facility mới");
                    break;
                case 3:
                    System.out.println("Hiển thị danh sách Facility maintenance");
                    break;
                case 4:
                return;
            }
        } while (true);
    }
}
