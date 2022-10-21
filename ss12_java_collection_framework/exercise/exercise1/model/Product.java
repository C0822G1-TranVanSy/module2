package ss12_java_collection_framework.exercise.exercise1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Product {
    private String productName;
    private double price;
    private int id = 1;

    public Product() {
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Product(String productName, double price, int id) {
        this.productName = productName;
        this.price = price;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double cost) {
        this.price = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", cost=" + price +
                '}';
    }


    public static ArrayList<Product> products = new ArrayList<>();

    static {
        Product product1 = new Product("Cuong", 1000, 1);
        Product product2 = new Product("Sy", 2000, 2);
        Product product3 = new Product("Minh", 1500, 3);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }
}
