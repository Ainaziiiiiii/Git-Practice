package service.serviceImpl;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import model.Customer;
import model.Order;
import service.CustomerService;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerDao dao=new CustomerDaoImpl();

    @Override
    public Customer register( String name, String email) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        return customer;
    }

    @Override
    public Optional<Customer> findByEmail(String email) {

        return dao.findByEmail(email);
    }

    @Override
    public List<Customer> getAllCustomers() {

        return dao.findAll();
    }

    @Override
    public boolean isEmailTaken(String email) {
        return dao.findByEmail(email).isEmpty();
    }

    @Override
    public List<Order> getOrderHistory(int customerId) {
        Optional<Customer> customer = dao.findById(customerId);
        if(customer.isEmpty()){
            return customer.get().getOrders();
        }
        return List.of();
    }
}
