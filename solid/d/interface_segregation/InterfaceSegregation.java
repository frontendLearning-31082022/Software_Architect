package d.interface_segregation;

import java.util.ArrayList;
import java.util.Date;

public class InterfaceSegregation {

    interface Vehicle {
        String name();

        Date getDateManufactured();
    }

    interface FuelConsumpsion {
        String getTypeFuel();
        ArrayList<String> getSubstitutionList();
    }

}
