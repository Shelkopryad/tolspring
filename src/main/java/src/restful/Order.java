package src.restful;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Svirin2-DA on 11.12.2018.
 */
public class Order {

    private int id;
    private Calendar date;
    private Customer customer;
    private List<OrderLine> orderLines;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
