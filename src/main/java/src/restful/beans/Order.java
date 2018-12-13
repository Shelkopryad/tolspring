package src.restful.beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Order {

    private int id;
    private Calendar date;
    private List<OrderLine> orderLines;
    private double amount = 0;

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLine(OrderLine orderLine) {
        if (this.orderLines == null) {
            this.orderLines = new ArrayList<OrderLine>();
        }
        this.orderLines.add(orderLine);
        this.amount += orderLine.getAmount();
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
