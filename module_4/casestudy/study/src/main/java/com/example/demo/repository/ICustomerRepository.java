package com.example.demo.repository;

import com.example.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "SELECT * FROM `case`.customer where name like %:name% and email like %:email% and customer_type_id like %:customerTypeId% ", nativeQuery = true)
    Page<Customer> search(Pageable pageable,@Param("name") String name, @Param("email") String email, @Param("customerTypeId") String customerTypeId);
}
