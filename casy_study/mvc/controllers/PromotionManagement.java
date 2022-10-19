package casy_study.mvc.controllers;

import java.util.Scanner;

public class PromotionManagement {
    public static void displayListPromotion() {

        int choice;
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
                System.out.println("Nhập lựa chọn trong Menu Promotion: ");
                Scanner scanner = new Scanner(System.in);
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 3) {
                    System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
                }

            switch (choice) {
                case 1:
                    System.out.println("Hiện thị danh sách khách hàng sử dụng dịch vụ");
                    break;
                case 2:
                    System.out.println("Hiện thị danh sách khách hàng get voucher");
                    break;
                case 3:
                return;
            }
        } while (true);
    }
}
