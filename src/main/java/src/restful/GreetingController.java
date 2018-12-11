package src.restful;

import org.springframework.web.bind.annotation.*;
import src.restful.beans.*;
import src.restful.services.*;

@RestController
public class GreetingController {

    OrderService orderService = new OrderService();
    CustomerService customerService = new CustomerService();
    ProductService productService = new ProductService();
    CommentService commentService = new CommentService();

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public Order orderById(@PathVariable(value = "id") int id) {
        return orderService.getById(id);
    }

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public Customer createUser(@RequestParam(value = "name") String name, @RequestParam(value = "balance") double balance) {
        Customer customer = new Customer(name, new Account(balance));
        customerService.addCustomer(customer);
        return customer;
    }

    @RequestMapping(value = "/product/create", method = RequestMethod.POST)
    public Product createProduct(@RequestParam(value = "name") String name, @RequestParam(value = "price") double price) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setInStock(true);
        productService.setProduct(product);
        return product;
    }

    @RequestMapping(value = "/product/{id}/comment/create", method = RequestMethod.POST)
    public Product createCommentForProduct(@PathVariable(value = "id") long id, @RequestParam(value = "commentText") String commentText) {
        Comment comment = new Comment();
        comment.setText(commentText);
        commentService.setComment(comment);
        Product product = productService.getById(id);
        product.setComment(comment);
        return product;
    }

    @RequestMapping(value = "/product/{id}/intoStock", method = RequestMethod.POST)
    public Product addInStock(@PathVariable(value = "id") long id) {
        Product product = productService.getById(id);
        product.setInStock(true);
        return product;
    }

    @RequestMapping(value = "/product/{id}/outOfStock", method = RequestMethod.POST)
    public Product outOfStock(@PathVariable(value = "id") long id) {
        Product product = productService.getById(id);
        product.setInStock(false);
        return product;
    }

}
