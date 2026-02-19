package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private List<OrderItem> items = new ArrayList<>();
    private String status;

    public Order() {
    }

    public Order(Long id, List<OrderItem> items, String status) {
        this.id = id;
        this.items = items;
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

    public void addItems(OrderItem item) {

    }

    public double getTotalPrise() {
        return 0;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", items='" + items + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
