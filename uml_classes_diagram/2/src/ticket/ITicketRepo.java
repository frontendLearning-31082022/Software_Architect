package ticket;

import java.util.List;

public interface ITicketRepo {
    boolean create(Ticket ticket);
    boolean update(Ticket ticket);
    List<Ticket> readAll(int val);
    boolean delete(Ticket ticket);
}
