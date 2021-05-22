import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws Exception {
        //CustomerManager customerManager = new NeroCustomerManager();
        CustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.Save(new Customer(1,"Mustafa", "Çolak",
                new GregorianCalendar(1993,10,16).getTime(), "00000000000"));


    }
}
