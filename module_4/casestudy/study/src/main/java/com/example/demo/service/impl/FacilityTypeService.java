package com.example.demo.service.impl;

import com.example.demo.model.facility.FacilityType;
import com.example.demo.repository.ICustomerTypeRepository;
import com.example.demo.repository.IFacilityTypeRepository;
import com.example.demo.service.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    private IFacilityTypeRepository facilityTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return facilityTypeRepository.findAll();
    }
}
