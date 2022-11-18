package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {

    boolean add(Customer customer);
    boolean edit(Customer customer);
    boolean delete(int id);
    List<Customer> findAll(String search);

    List<Customer> displayAfterDelete();

    Customer findById(int id);

    Customer searchCustomer(int id);
}
