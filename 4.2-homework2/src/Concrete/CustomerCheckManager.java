package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.LKKKPSPublicSoap;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
