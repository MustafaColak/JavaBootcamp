public class Main {
    public static void main(String[] args) {

        Logger[] loggers = {new DatabaseLogger(), new SmsLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);

        Customer customer = new Customer(1,"Ali", "Veli");


        customerManager.add(customer);
    }
}
