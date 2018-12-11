package src.restful;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Svirin2-DA on 11.12.2018.
 */
public class Product {

    private int id;
    private String name;
    private BigDecimal price;
    private boolean inStock;
    private List<Comment> comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setComment(Comment comment) {
        this.comments.add(comment);
    }
}
