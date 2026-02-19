import dao.OrderDao;
import model.Customer;
import model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {


    void createOrder (Customer c);

    void addItemToOrder (int orderId, int productId, int  qty);

    void calculateTotal(int orderId);

    void cancelOrder(int orderId);

    List<Order> getOrdersByStatus (String status);


}
