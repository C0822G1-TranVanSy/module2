package ss12_java_collection_framework.exercise.exercise1.service;

import ss12_java_collection_framework.exercise.exercise1.model.Product;
import java.util.Scanner;

public class ProductService {
    /**
     * Phương thức thêm sản phẩm
     */
    public static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập price: ");
        double price = Double.parseDouble(scanner.nextLine());
        int id = Product.products.get(Product.products.size() - 1).getId() + 1;
        Product product = new Product(name, price);
        product.setId(id);
        Product.products.add(product);
        displayListProduct();
    }

    /**
     * Phương thức hiện thị danh sách sản phẩm
     */
    public static void displayListProduct() {
        for (int i = 0; i < Product.products.size(); i++) {
            System.out.println(Product.products.get(i));
        }
    }

    /**
     * Phương thức xóa 1 sản phẩm theo id
     */
    public static void removeProduct() {
        int deletedIndex = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < Product.products.size(); i++) {
            if (Product.products.get(i).getId() == id) {
                deletedIndex = i;
            }
        }
        if (deletedIndex != -1) {
            Product.products.remove(deletedIndex);
        } else {
            System.out.println("Không tìm thấy id này. ");
        }
        displayListProduct();
    }

    /**
     * Phương thức chỉnh sửa sản phẩm theo id
     */
    public static void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần chỉnh sửa thông tin: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < Product.products.size(); i++) {
            if (Product.products.get(i).getId() == id) {
                System.out.println("Nhập tên cần chỉnh sửa:  ");
                Product.products.get(i).setProductName(scanner.nextLine());
                System.out.println("Nhập giá tiền cần chỉnh sửa:  ");
                Product.products.get(i).setPrice(Integer.parseInt(scanner.nextLine()));
            }
        }
        displayListProduct();
    }

    /**
     * Phương thức tìm kiếm sản phẩm theo tên
     */
    public static void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên Product cần tìm kiếm: ");
        String name = scanner.nextLine();
        for (int i = 0; i < Product.products.size(); i++) {
            if (Product.products.get(i).getProductName().equals(name)) {
                System.out.println(Product.products.get(i));
            }
        }
    }

}
