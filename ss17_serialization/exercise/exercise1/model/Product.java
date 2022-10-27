package ss17_serialization.exercise.exercise1.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Product implements Serializable {
    private int id = 1;
    private String name;
    private String brand;
    private int price;

    public Product() {
    }

    public Product(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public Product(int id, String name, String brand, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public static List<Product> products = new ArrayList<>();

    static {
        Product product1 = new Product(1, "Điện thoại", "Apple", 10000);
        Product product2 = new Product(2, "Đồng hồ", "Seiko", 20000);
        Product product3 = new Product(3, "Giày thể thao", "Nike", 5000);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }
}
