package dao;

import model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {

    void save(Product p);
    List<Product> findAll();
    Optional<Product> findById(int id);
    List<Product> findByCategory(String cat);
    void update(Product p);
    boolean delete(int id);






}
