package cash;

import carier.CarrierRepository;
import ticket.Ticket;
import user.User;

public class CashProvider {
    CashRepository cashRepository=new CashRepository();
    CarrierRepository carrierRepository=new CarrierRepository();

    public CashProvider() {}

    public void authorization(User user){}
    public boolean buy(Ticket ticket){return false;}

}
