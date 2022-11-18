package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> showList(String nameSearch, String address, String phone);
    boolean add(Customer customer);
    boolean edit(Customer customer);
    Customer findById(int id);
    boolean delete(int id);
}
