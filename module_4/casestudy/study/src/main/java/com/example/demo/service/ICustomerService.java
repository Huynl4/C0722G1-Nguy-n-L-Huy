package com.example.demo.service;

import com.example.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Optional<Customer> findById(Long id);

    void remove(Long id);

    Page<Customer> search(Pageable pageable,String name, String email,String customerTypeId);
}
