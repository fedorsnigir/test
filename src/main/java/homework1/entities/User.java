package homework1.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {

    public static final User PITER = new User(
            "epam",
            "1234",
            "PITER CHAILOVSKII");

    private final String login;
    private final String password;
    private final String userName;

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
