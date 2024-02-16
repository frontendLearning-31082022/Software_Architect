package user;

import java.util.List;

public interface IUserRepo {
    User read(int id);
    boolean delete(User user);
    List<User> readAll();
    boolean update(User user);
    int create(String username,int hashPassword,long cardNumber);
    User read(String userName);
}
