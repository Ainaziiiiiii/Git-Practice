package dao;

import model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderDao {
    void save (Order o);
    List<Order> findAll();
    Optional<Order> findById(int id);
    List<Order> findByCustomer(int customerId);
    void update(Order o);
}
