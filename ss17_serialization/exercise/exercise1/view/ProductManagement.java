package ss17_serialization.exercise.exercise1.view;

import ss17_serialization.exercise.exercise1.controller.ProductController;

import java.io.IOException;

public class ProductManagement {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProductController productController = new ProductController();
        productController.displayMenuProduct();
    }
}
