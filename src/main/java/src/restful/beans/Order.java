package src.restful.beans;

import java.util.Calendar;
import java.util.List;

public class Order {

    private int id;
    private Calendar date;
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

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLines.add(orderLine);
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
