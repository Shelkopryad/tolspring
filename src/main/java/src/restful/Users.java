package src.restful;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Svirin2-DA on 10.12.2018.
 */
public class Users {

    private static AtomicLong id = new AtomicLong(0L);
    private Map<Long, User> users;

    public Users() {
        if (this.users == null) {
            users = new HashMap<Long, User>();
        }
    }

    public void addUser(User user) {
        users.put(id.incrementAndGet(), user);
    }

    public User getUser(long id) {
        User user = users.get(id);
        return user != null ? user : null;
    }

    public User getUser(String name) {
        for (Map.Entry<Long, User> entry : users.entrySet()) {
            if (entry.getValue().getLogin().equals(name)) {
                return entry.getValue();
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Users{" +
                "users=" + users +
                '}';
    }
}
