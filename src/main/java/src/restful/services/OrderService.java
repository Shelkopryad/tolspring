package src.restful.services;

import src.restful.beans.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class OrderService {

    private AtomicLong id = new AtomicLong(0L);
    private Map<Long, Order> orders;

    public OrderService() {
        if (this.orders == null) {
            this.orders = new HashMap<Long, Order>();
        }
    }

    public Map<Long, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Long, Order> orders) {
        this.orders = orders;
    }

    public void setOrder(Order order) {
        this.orders.put(id.incrementAndGet(), order);
    }

    public Order getById(long id) {
        return this.orders.get(id) == null ? null : this.orders.get(id);
    }
}
