package user;

public class User {
    public int id;
    public int hashPassword;
    public String userName;
    public long cardNumber;

    public User(int id, int hashPassword, String userName, long cardNumber) {
        this.id = id;
        this.hashPassword = hashPassword;
        this.userName = userName;
        this.cardNumber = cardNumber;
    }

    boolean equals(User user) {
        return false;
    }
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
