package dao;

import database.Database;
import model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save(Customer c) {
        Database.customers.add(c);

    }

    @Override
    public List<Customer> findAll() {

        return Database.customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        for (Customer c : Database.customers) {
            if (c.getId() == (id)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Customer> findByEmail(String email) {
        List<Customer> result = new ArrayList<>();
        for (Customer c : Database.customers) {
            if (c.getEmail().equals(email)) ;

        }
        return Optional.empty();
    }

    @Override
    public void update(Customer c) {
        for (Customer customer : Database.customers) {
            if (customer.getId() == c.getId()) {
                customer.setName(c.getName());
                customer.setEmail(c.getEmail());
            }

        }

    }

    @Override
    public boolean delete(int id) {
        for (Customer customer : Database.customers) {
            if (customer.getId() == (id)) {
                return Database.customers.remove(customer);
            }
        }
        return false;
    }
}