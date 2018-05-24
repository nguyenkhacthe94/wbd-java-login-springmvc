package dao;
import model.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User user1 = new User();
        user1.setAge(20);
        user1.setAccount("khacthe");
        user1.setEmail("khacthebkhn@gmail.com");
        user1.setName("The Anh");
        user1.setPassword("aptx4869");
        users.add(user1);

        User user2 = new User();
        user2.setPassword("linh123");
        user2.setName("Linh");
        user2.setEmail("mailinhtaxi");
        user2.setAccount("linh666");
        user2.setAge(20);
        users.add(user2);
    }

    public static User checkLogin(Login login) {
        for (User user:users) {
            if(user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword()))
                return user;
        }
        return null;
    }
}
