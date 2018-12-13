package src.restful.beans;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private static Long id;
    private String name;
    private Double price;
    private boolean inStock;
    private List<Comment> comments;

    public Product() {
        if (id == null) {
            id = 0L;
        }
        id += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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
        if (this.comments == null) {
            comments = new ArrayList<Comment>();
        }
        this.comments.add(comment);
    }
}
