package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.LKKKPSPublicSoap;

import java.time.ZoneId;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        LKKKPSPublicSoap client = new LKKKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(),
                customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
    }
}
