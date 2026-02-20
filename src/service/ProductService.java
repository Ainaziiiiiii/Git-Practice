package service;

import model.Product;

import java.util.List;

public interface ProductService {
    void addProduct( String name, double price, int qty, String cat);

    List<Product> getAllProduct();

    List<Product> searchByCategory(String cat);

    boolean updatePrice(int id, double newPrice);
    boolean isInStock(int id, int qty);
    List<Product> getLowStockProducts(int threshold);
}