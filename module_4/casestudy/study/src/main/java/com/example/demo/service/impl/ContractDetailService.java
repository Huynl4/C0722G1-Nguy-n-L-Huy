package com.example.demo.service.impl;

import com.example.demo.model.contract.ContractDetail;
import com.example.demo.repository.IContractDetailRepository;
import com.example.demo.service.IContractDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService {
    private IContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }
}

