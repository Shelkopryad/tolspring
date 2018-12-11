package src.restful;

import org.springframework.web.bind.annotation.*;
import src.restful.services.CommentService;
import src.restful.services.CustomerService;
import src.restful.services.OrderService;
import src.restful.services.ProductService;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Svirin2-DA on 25.09.2018.
 */

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

    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public Customer newUser(@RequestParam(value = "name") String name, @RequestParam(value = "balance") double balance) {
        Customer customer = new Customer(name, new Account(balance));
        customerService.addCustomer(customer);
        return customer;
    }

//    @RequestMapping(value = "/newProduct", method = RequestMethod.POST)
//    public Product newProduct(@RequestParam(value = "name") String name, @RequestParam(value = "balance") double balance) {
//        Product product = new Product();
//    }


    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public Order order() {
        Order order = new Order();
        final OrderLine line1 = new OrderLine();
        Product product1 = new Product();
        product1.setName("Toy");
        Comment commentP11 = new Comment();
        commentP11.setId(1);
        commentP11.setText("Great toy");
        Comment commentP12 = new Comment();
        commentP12.setId(2);
        commentP12.setText("Awesome!");
        List<Comment> set = new ArrayList<Comment>();
        set.add(commentP11);
        set.add(commentP12);
        product1.setPrice(new BigDecimal(100));
        product1.setInStock(true);
        product1.setComments(set);
        line1.setProduct(product1);
        line1.setAmount(5454);
        line1.setPurchasePrice(new BigDecimal(5465464));

        Product product2 = new Product();
        product2.setName("Snow");
        Comment commentP21 = new Comment();
        commentP21.setId(1);
        commentP21.setText("Great snow");
        Comment commentP22 = new Comment();
        commentP22.setId(2);
        commentP22.setText("Awesome snow!");
        List<Comment> set2 = new ArrayList<Comment>();
        set2.add(commentP21);
        set2.add(commentP22);
        product1.setPrice(new BigDecimal(100));
        product1.setInStock(true);
        product1.setComments(set2);
        final OrderLine line2 = new OrderLine();
        line2.setProduct(product1);
        line2.setAmount(887887);
        line2.setPurchasePrice(new BigDecimal(98789));

        order.setId(1);
        order.setCustomer(new Customer("sdf", new Account(545488)));
        order.setDate(Calendar.getInstance());
        order.setOrderLines(new ArrayList<OrderLine>(){{add(line1);add(line2);}});

        return order;
    }

//    @RequestMapping(value = "/user/{id}/addBalance", method = RequestMethod.POST)
//    public @ResponseBody
//    Customer addBalance(@PathVariable(value = "id") int id, @RequestParam(value = "sum") double sum) {
//        Customer user = users.getUser(id);
//        if (user == null) {
//            return null;
//        }
//        user.getAccount().add(sum);
//        return user;
//    }
//
//    @RequestMapping(value = "/user/{id}/subBalance", method = RequestMethod.POST)
//    public @ResponseBody
//    Customer subBalance(@PathVariable(value = "id") int id, @RequestParam(value = "sum") double sum) {
//        Customer user = users.getUser(id);
//        if (user == null) {
//            return null;
//        }
//        user.getAccount().sub(sum);
//        return user;
//    }

}
