package ss12_java_collection_framework.exercise.exercise1.controller;

import ss12_java_collection_framework.exercise.exercise1.model.Product;
import ss12_java_collection_framework.exercise.exercise1.service.ProductService;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductController {
    public static void displayMenuProduct() {

        int choice;
        do {
            System.out.println("1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin theo id\n" +
                    "3. Xóa sản phẩm theo id\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phâm tăng dần theo giá\n" +
                    "7. Thoát chương trình");
            System.out.println("Nhập lựa chọn trong Menu Product: ");
            Scanner scanner = new Scanner(System.in);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ProductService.addProduct();
                    break;
                case 2:
                    ProductService.editProduct();
                    break;
                case 3:
                    ProductService.removeProduct();
                    break;
                case 4:
                    ProductService.displayListProduct();
                    break;
                case 5:
                    ProductService.searchProduct();
                    break;
                case 6:
                    Product.products.sort(Comparator.comparing(Product::getPrice));
                    ProductService.displayListProduct();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập ngoài lựa chọn!!! Hãy chọn lại.");
            }
        } while (true);
    }
}
