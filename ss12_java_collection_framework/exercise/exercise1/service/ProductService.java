package ss12_java_collection_framework.exercise.exercise1.service;

import ss12_java_collection_framework.exercise.exercise1.model.Product;

import java.util.Scanner;

public class ProductService {
    public static void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập price: ");
        double price = Double.parseDouble(scanner.nextLine());
        int id = Product.products.get(Product.products.size() -1).getId() + 1;
        Product product = new Product(name,price);
        product.setId(id);
        Product.products.add(product);
        displayListProduct();
    }

    public static void displayListProduct(){
        for (int i = 0; i < Product.products.size() ; i++) {
            System.out.println(Product.products.get(i));
        }
    }

    public static void removeProduct(){
        int deletedIndex = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <Product.products.size()  ; i++) {
            if(Product.products.get(i).getId()==id){
                deletedIndex = i;
            }
        }
        if(deletedIndex!=-1){
            Product.products.remove(deletedIndex);
        }else {
            System.out.println("Không tìm thấy id này. ");
        }
        displayListProduct();
    }
}
