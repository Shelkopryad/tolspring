package src.restful.beans;

import java.util.Calendar;

public class Customer {

    private int id;
    private String login;
    private Account account;
    private Order order;
    private Calendar customerSince;

    public Customer(String login, Account account) {
        this.login = login;
        this.account = account;
    }

    public String getLogin() {
        return this.login;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Account getAccount() {
        return this.account;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", " + account.toString() +
                '}';
    }
}
