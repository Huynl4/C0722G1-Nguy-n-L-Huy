package responsitory;

import model.Customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ICustomerResponsitory {
    boolean add(Customer customer);
    boolean edit(Customer customer);
    boolean delete(int id);
    List<Customer> findAll(String search);

    List<Customer> displayAfterDelete();

    Customer findById(int id);

    Customer searchCustomer(int id);
}
