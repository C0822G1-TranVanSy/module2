package casy_study.mvc.services.impl;

import casy_study.mvc.controllers.EmployeeManagement;
import casy_study.mvc.models.Employee;
import casy_study.mvc.services.IEmployeeService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {

    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(1, "Cuong", "15/6/2001", true, 1022255456, "09665555554", "cuong@gmail.com", "trung cấp", "phục vụ", 2000));
    }
    @Override
    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        boolean gender = Boolean.getBoolean(scanner.nextLine());
        System.out.println("Nhập CMND: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số điện thoại: ");
        String numberPhone = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập cấp bậc: ");
        String lever = scanner.nextLine();
        System.out.println("Nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.println("Nhập lương: ");
        int salary = Integer.parseInt(scanner.nextLine());
        int id = EmployeeServiceImpl.employeeList.get(EmployeeServiceImpl.employeeList.size() - 1).getId() + 1;
        Employee employee = new Employee(id, name, dateOfBirth, gender, identityCard, numberPhone, email, lever, position, salary);
        employee.setId(id);
        EmployeeServiceImpl.employeeList.add(employee);
    }
    @Override
    public void displayListEmployee() {
        for (Employee e : EmployeeServiceImpl.employeeList) {
            System.out.println(e);
        }
        if(EmployeeServiceImpl.employeeList.isEmpty()){
            System.out.println("Còn cái nịt mà in!!!");
        }
    }
    @Override
    public void editEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần chỉnh sửa thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < EmployeeServiceImpl.employeeList.size(); i++) {
            if (EmployeeServiceImpl.employeeList.get(i).getId() == id) {
                System.out.println("Nhập tên cần chỉnh sửa:  ");
                EmployeeServiceImpl.employeeList.get(i).setName(scanner.nextLine());
                System.out.println("Nhập ngày sinh cần chỉnh sửa:  ");
                EmployeeServiceImpl.employeeList.get(i).setDateOfBirth(scanner.nextLine());
                System.out.println("Nhập giới tính cần chỉnh sửa:  ");
                EmployeeServiceImpl.employeeList.get(i).setGender(Boolean.getBoolean(scanner.nextLine()));
                System.out.println("Nhập CMND cần chỉnh sửa:  ");
                EmployeeServiceImpl.employeeList.get(i).setIdentityCard(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập số điện thoại cần chỉnh sửa:  ");
                EmployeeServiceImpl.employeeList.get(i).setNumberPhone(scanner.nextLine());
                System.out.println("Nhập email cần chỉnh sửa:  ");
                EmployeeServiceImpl.employeeList.get(i).setEmail(scanner.nextLine());
                System.out.println("Nhập lever cần chỉnh sửa:  ");
                EmployeeServiceImpl.employeeList.get(i).setLever(scanner.nextLine());
                System.out.println("Nhập position cần chỉnh sửa:  ");
                EmployeeServiceImpl.employeeList.get(i).setPosition(scanner.nextLine());
                System.out.println("Nhập số lương cần chỉnh sửa:  ");
                EmployeeServiceImpl.employeeList.get(i).setSalary(Integer.parseInt(scanner.nextLine()));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id này!!!");
        } else {
            displayListEmployee();
        }
    }
    @Override
    public void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < EmployeeServiceImpl.employeeList.size(); i++) {
            if (EmployeeServiceImpl.employeeList.get(i).getId() == id) {
                System.out.println("Bạn có muốn xóa " + EmployeeServiceImpl.employeeList.get(i).getId() + " này không");
                do {
                    System.out.println("1. Xóa" +
                            "2. Không xóa");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 1) {
                        EmployeeServiceImpl.employeeList.remove(i);
                        break;
                    } else if (choice == 2) {
                        EmployeeManagement.displayListEmployees();
                        break;
                    } else {
                        System.out.println("Chọn 1 hoặc 2!!!");
                    }
                } while (true);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id này!!!");
        } else {
            displayListEmployee();
        }
    }
}
