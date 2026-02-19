package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private List<OrderItem> items = new ArrayList<>();
    private Consumer consumer;
    private String status;

    public Order() {
    }

    public Order(Long id, Consumer consumer) {
        this.id = id;
        this.consumer = consumer;
    }

    public Order(Long id, List<OrderItem> items, Consumer consumer, String status) {
        this.id = id;
        this.items = items;
        this.consumer = consumer;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public void addItems(OrderItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double number = 0;
        for (OrderItem item: items) {
            number+=item.getSubtotal();
        }
        return number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", items='" + items +
                ", status='" + status +
                '}';
    }
}
