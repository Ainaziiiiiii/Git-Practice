package service;

import model.Customer;
import model.Order;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer register(String name, String email);
    Optional<Customer> findByEmail(String email);
    List<Customer> getAllCustomers();
    boolean isEmailTaken(String email);
    List<Order> getOrderHistory(int customerId);
}
