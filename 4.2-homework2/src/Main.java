import Abstract.CustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new NeroCustomerManager();
        //customerManager.Save(new Customer(1,"Mustafa", "ÇOLAK", new Date(1993,10,16), "64906224700"));
        customerManager.Save(new Customer(1,"Mustafa", "ÇOLAK",
                new GregorianCalendar(1993,10,16).getTime(), "64906224700"));
    }
}
