package src.restful.services;

import src.restful.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Svirin2-DA on 11.12.2018.
 */
public class ProductService {

    private AtomicLong id = new AtomicLong(0L);
    private Map<Long, Product> products;

    public ProductService() {
        if (this.products == null) {
            this.products = new HashMap<Long, Product>();
        }
    }

    public Map<Long, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Long, Product> products) {
        this.products = products;
    }

    public Product getById(long id) {
        return this.products.get(id) == null ? null : this.products.get(id);
    }

}
