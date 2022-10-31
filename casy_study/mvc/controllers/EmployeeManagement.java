package casy_study.mvc.controllers;

import casy_study.mvc.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {
    public static void displayListEmployees() {
        do {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Delete employee\n" +
                    "4. Edit employee\n" +
                    "5. Return main menu");
            int choice;
            System.out.println("Nhập lựa chọn trong Menu Employee: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
            if (choice < 1 || choice > 5) {
                System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
            }
            switch (choice) {
                case 1:
                    employeeService.displayListEmployee();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.deleteEmployee();
                    break;
                case 4:
                    employeeService.editEmployee();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Nhập lại. Ngoài chức năng rồi!!");
            }
        } while (true);
    }
}
