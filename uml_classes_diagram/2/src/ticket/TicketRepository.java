package ticket;

import java.util.Date;
import java.util.List;

public class TicketRepository implements ITicketRepo{

    public TicketRepository() {    }

    void generateTickets(int price, int place, int routeNumber, Date date){}

    @Override
    public boolean create(Ticket ticket) {
        return false;
    }

    @Override
    public boolean update(Ticket ticket) {
        return false;
    }

    @Override
    public List<Ticket> readAll(int val) {
        return null;
    }

    @Override
    public boolean delete(Ticket ticket) {
        return false;
    }
}
