package model;

public class Order {
    private Long id;
    private String items;
    private String status;

    public Order() {
    }

    public Order(Long id, String items, String status) {
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

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", items='" + items + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
