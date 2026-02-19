package dao;

import model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    void save(Customer c);
    List<Customer> findAll();
    Optional<Customer> findById(int id);
    Optional<Customer> findByEmail(String email);
    void update(Customer c);
    boolean delete(int id);
}
