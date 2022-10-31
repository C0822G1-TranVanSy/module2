package ss17_serialization.exercise.exercise1.service.impl;

import ss17_serialization.exercise.exercise1.model.Product;
import ss17_serialization.exercise.exercise1.service.IProductService;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    @Override
    public void displayListProduct() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\ss17_serialization\\exercise\\exercise1\\data\\data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> products = (List<Product>) objectInputStream.readObject();
        for (Product product : products) {
            System.out.println(product);
        }
        objectInputStream.close();
    }

    @Override
    public void addProduct() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\ss17_serialization\\exercise\\exercise1\\data\\data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> products = (List<Product>) objectInputStream.readObject();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng: ");
        String brand = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        int id = products.get(products.size() - 1).getId() + 1;
        Product product = new Product(name, brand, price);
        product.setId(id);

        FileOutputStream fileOutputStream = new FileOutputStream("src\\ss17_serialization\\exercise\\exercise1\\data\\data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        products.add(product);
        objectOutputStream.writeObject(products);
        objectOutputStream.close();
    }

    @Override
    public void searchProduct() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream("src\\ss17_serialization\\exercise\\exercise1\\data\\data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Product> products = (List<Product>) objectInputStream.readObject();

        System.out.println("Nhập id sản phẩm bạn muốn tìm kiếm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (id == product.getId()) {
                System.out.println(product);
                break;
            }
        }
        objectInputStream.close();
    }
}
