

public interface CustomerService{


    List<Customer>getAllCustomers();

    Customer getCustomerById(Long id);

    void saveCustomer(Customer customer);
}