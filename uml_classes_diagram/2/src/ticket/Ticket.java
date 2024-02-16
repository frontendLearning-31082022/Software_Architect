package ticket;

import java.util.Date;

public class Ticket {
    int price;
    int place;
    Date date;
    int routeNumber;
    boolean isValid;

    Ticket(){}
    String toPrint(){return null;}


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(Ticket ticket) {
        return super.equals(ticket);
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
