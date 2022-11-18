package responsitory;

import model.Customer;

import java.util.List;

public interface ICustomerResponsitory {
    List<Customer> showList(String nameSearch, String addressSearch, String phoneSearch);
    boolean add(Customer customer);
    boolean edit(Customer customer);
    Customer findById(int id);
    boolean delete(int id);
}
