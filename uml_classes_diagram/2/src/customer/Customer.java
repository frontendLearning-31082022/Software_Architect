package customer;

import cash.CashProvider;
import ticket.Ticket;
import user.User;

import java.util.Date;
import java.util.List;

public class Customer extends ICustomer {
    CashProvider cashProvider=new CashProvider();
    User client;

    public Customer() { }

    @Override
    public List<Ticket> searchTicket(Date date, int val) {
        return null;
    }

    @Override
    public boolean buyTicket(Ticket ticket) {
        return false;
    }
}
