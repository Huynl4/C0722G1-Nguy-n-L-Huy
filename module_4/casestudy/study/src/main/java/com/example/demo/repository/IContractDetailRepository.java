package com.example.demo.repository;

import com.example.demo.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IContractDetailRepository  extends JpaRepository<ContractDetail,Long> {
    List<ContractDetail> findAll();
}
