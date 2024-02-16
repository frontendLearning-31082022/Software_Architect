package customer;

import ticket.Ticket;
import user.User;
import user.UserProvider;

import java.util.Date;
import java.util.List;

abstract class ICustomer {
    public List<Ticket> selectedTickets;
    public UserProvider userProvider;
    public User user;

    public abstract List<Ticket>searchTicket(Date date,int val);
    public  abstract boolean buyTicket(Ticket ticket);
}

