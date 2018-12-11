package src.restful;

/**
 * Created by Svirin2-DA on 10.12.2018.
 */
public class User {

    private String login;
    private Account account;

    public User(String login, Account account) {
        this.login = login;
        this.account = account;
    }

    public String getLogin() {
        return this.login;
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
