package user;

import java.util.List;

public class UserRepository implements IUserRepo{

    public List<User>clients;

    public UserRepository(){}

    @Override
    public User read(int id) {
        return null;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public List<User> readAll() {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public int create(String username, int hashPassword, long cardNumber) {
        return 0;
    }

    @Override
    public User read(String userName) {
        return null;
    }
}
