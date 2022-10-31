package ss17_serialization.exercise.exercise1.controller;

import ss17_serialization.exercise.exercise1.service.impl.ProductService;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    public void displayMenuProduct() throws IOException, ClassNotFoundException {
        ProductService productService = new ProductService();
        System.out.println("--------Menu--------\n" +
                "1. Thêm sản phẩm\n" +
                "2. Hiện thị sản phẩm\n" +
                "3. Tìm kiếm thông tin sản phẩm\n" +
                "4. Thoát chương trình.");
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.displayListProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn đã nhập ngoài lựa chọn. Hãy nhập lại!!");
            }
        } while (true);
    }
}
