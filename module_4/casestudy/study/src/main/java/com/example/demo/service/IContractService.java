package com.example.demo.service;

import com.example.demo.dto.ContractView;
import com.example.demo.model.contract.Contract;
import com.example.demo.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IContractService {
    Page<ContractView> findAll(Pageable pageable);
    void save(Contract contract);

    Optional<Contract> findById(Long id);
}
