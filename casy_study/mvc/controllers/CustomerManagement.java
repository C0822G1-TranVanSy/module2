package casy_study.mvc.controllers;

import java.util.Scanner;

public class CustomerManagement {
    public static void displayListCustomers() {
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu");
        int choice;
        do {
            System.out.println("Nhập lựa chọn trong Menu Customer: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > 4) {
                System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
            }
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị danh sách");
                    break;
                case 2:
                    System.out.println("Thêm khách hàng mới");
                    break;
                case 3:
                    System.out.println("Chỉnh sửa thông tin khách hàng");
                    break;
                case 4:
                return;
            }
        } while (true);
    }
}
