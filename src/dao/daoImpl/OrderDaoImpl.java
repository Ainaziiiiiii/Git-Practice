package dao.daoImpl;


import dao.OrderDao;
import db.DataBaseOrder;
import db.DataBaseOrder;
import db.DatabaseCustomer;
import model.Order;

import java.util.List;
import java.util.Optional;

import static db.DataBaseOrder.orders;


public class OrderDaoImpl implements OrderDao {
    @Override
    public void save(Order o) {
       DataBaseOrder.orders.add(o);
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public Optional<Order> findById(int id) {
        for(Order order : orders){
            if(order.getId()==(id)){
                return Optional.of(order);
            }
        }return Optional.empty();
    }

    @Override
    public List<Order> findByCustomer(int customerId) {
        return orders.stream()
                .filter(order -> order.getCustomer().getId()==customerId)
                .toList();
    }

    @Override
    public void update(Order o) {
        for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getId() == o.getId()){
                orders.set(i,o);
            }
        }
    }
}
