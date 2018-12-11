package src.restful;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Svirin2-DA on 25.09.2018.
 */

@RestController
public class GreetingController {

    Users users = new Users();

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User userById(@PathVariable(value = "id") int id) {
        User user = users.getUser(id);
        return user != null ? user : null;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User userByLogin(@RequestParam(value = "name") String name) {
        User user = users.getUser(name);
        return user != null ? user : null;
    }

    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public User newUser(@RequestParam(value = "name") String name, @RequestParam(value = "balance") double balance) {
        User user = new User(name, new Account(balance));
        users.addUser(user);
        return user;
    }

    @RequestMapping(value = "/user/{id}/addBalance", method = RequestMethod.POST)
    public @ResponseBody User addBalance(@PathVariable(value = "id") int id, @RequestParam(value = "sum") double sum) {
        User user = users.getUser(id);
        if (user == null) {
            return null;
        }
        user.getAccount().add(sum);
        return user;
    }

    @RequestMapping(value = "/user/{id}/subBalance", method = RequestMethod.POST)
    public @ResponseBody User subBalance(@PathVariable(value = "id") int id, @RequestParam(value = "sum") double sum) {
        User user = users.getUser(id);
        if (user == null) {
            return null;
        }
        user.getAccount().sub(sum);
        return user;
    }

}
