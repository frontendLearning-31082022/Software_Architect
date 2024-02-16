package user;

import java.util.List;

public class UserProvider {

    IUserRepo clientRepository=new UserRepository();
    List<User> allClients;

    UserProvider(){}

    public User getClientByName(String name){return null;}
    public int createClient(String username,int hashPassword,long cardNumber){return -1;}
}
