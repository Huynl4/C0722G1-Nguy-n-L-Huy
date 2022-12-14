package com.example.demo.service.impl;

import com.example.demo.model.customer.Customer;
import com.example.demo.repository.ICustomerRepository;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

//    @Override
//    public Iterable<Customer> findAll(Pageable pageable) {
//        return customerRepository.findAll(pageable);
//    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> search(Pageable pageable, String name, String email, String customerTypeId) {
        return customerRepository.search(pageable, name, email, customerTypeId);
    }
}
