package com.example.demo.service.impl;

import com.example.demo.dto.ContractView;
import com.example.demo.model.contract.Contract;
import com.example.demo.repository.IContractRepository;
import com.example.demo.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository contractRepository;


    @Override
    public Page<ContractView> findAll(Pageable pageable) {
        return contractRepository.findAllContract(pageable);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public Optional<Contract> findById(Long id) {
        return contractRepository.findById(id);
    }
}
