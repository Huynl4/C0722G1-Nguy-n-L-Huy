package service;

import model.Customer;
import responsitory.CustomerResponsitory;
import responsitory.ICustomerResponsitory;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerResponsitory customerResponsitory = new CustomerResponsitory();
    @Override
    public boolean add(Customer customer) {
        return customerResponsitory.add(customer);
    }

    @Override
    public boolean edit(Customer customer) {
        return customerResponsitory.edit(customer);
    }

    @Override
    public boolean delete(int id) {
        return customerResponsitory.delete(id);
    }

    @Override
    public List<Customer> findAll(String search) {
        return customerResponsitory.findAll(search==null?"":search);
    }


    @Override
    public List<Customer> displayAfterDelete() {
        return customerResponsitory.displayAfterDelete();
    }

    @Override
    public Customer findById(int id) {
        return customerResponsitory.findById(id);
    }

    @Override
    public Customer searchCustomer(int id) {
        return customerResponsitory.searchCustomer(id);
    }
}
