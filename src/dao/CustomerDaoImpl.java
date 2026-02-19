package dao;

import db.Database;
import db.DatabaseCustomer;
import model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save(Customer c) {
        DatabaseCustomer.customers.add(c);

    }

    @Override
    public List<Customer> findAll() {

        return DatabaseCustomer.customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        for (Customer c : DatabaseCustomer.customers) {
            if (c.getId() == (id)) {
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Customer> findByEmail(String email) {
        List<Customer> result = new ArrayList<>();
        for (Customer c : DatabaseCustomer.customers) {
            if (c.getEmail().equals(email)) ;

        }
        return Optional.empty();
    }

    @Override
    public void update(Customer c) {
        for (Customer customer : DatabaseCustomer.customers) {
            if (customer.getId() == c.getId()) {
                customer.setName(c.getName());
                customer.setEmail(c.getEmail());
            }

        }

    }

    @Override
    public boolean delete(int id) {
        for (Customer customer : DatabaseCustomer.customers) {
            if (customer.getId() == (id)) {
                return DatabaseCustomer.customers.remove(customer);
            }
        }
        return false;
    }
}