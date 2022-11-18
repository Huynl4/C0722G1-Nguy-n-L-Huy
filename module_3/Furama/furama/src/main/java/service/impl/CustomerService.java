package service.impl;

import model.Customer;
import responsitory.ICustomerResponsitory;
import responsitory.impl.CustomerResponsitory;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerResponsitory customerResponsitory = new CustomerResponsitory();

    @Override
    public List<Customer> showList(String nameSearch, String addressSearch, String phoneSearch) {
        return customerResponsitory.showList(nameSearch==null?"":nameSearch,addressSearch==null?"":addressSearch,phoneSearch==null?"":phoneSearch);
    }

    @Override
    public boolean add(Customer customer) {
        return customerResponsitory.add(customer);
    }

    @Override
    public boolean edit(Customer customer) {
        return customerResponsitory.edit(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerResponsitory.findById(id);
    }

    @Override
    public boolean delete(int id) {
        return customerResponsitory.delete(id);
    }
}
