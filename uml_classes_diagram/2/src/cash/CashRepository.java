package cash;

import ticket.Ticket;
import ticket.TicketProvider;

import java.util.List;

public class CashRepository implements ICashRepo{
    public List<BankAccount> clients;
    public CashRepository() {}

    @Override
    public boolean transaction(int val, long val2, long val3) {
        return false;
    }
}
