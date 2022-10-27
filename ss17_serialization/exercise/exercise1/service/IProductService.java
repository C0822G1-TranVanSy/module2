package ss17_serialization.exercise.exercise1.service;

import java.io.IOException;

public interface IProductService {
    public void displayListProduct() throws IOException, ClassNotFoundException;

    public void addProduct() throws IOException, ClassNotFoundException;

    public void searchProduct() throws IOException, ClassNotFoundException;
}
