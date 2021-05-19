package Abstract;

import Entities.Customer;

public abstract class CustomerManager  implements  CustomerService{
    @Override
    public void Save(Customer customer) throws Exception {
        System.out.println("Saved to db : " + customer.getFirstName());
    }
}
