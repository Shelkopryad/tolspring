package src.restful.services;

import src.restful.beans.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class CustomerService {

    private AtomicLong id = new AtomicLong(0L);
    private Map<Long, Customer> customers;

    public CustomerService() {
        if (this.customers == null) {
            this.customers = new HashMap<Long, Customer>();
        }
    }

    public Map<Long, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Long, Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        this.customers.put(id.incrementAndGet(), customer);
    }

    public Customer getById(long id) {
        return this.customers.get(id) == null ? null : this.customers.get(id);
    }

}
