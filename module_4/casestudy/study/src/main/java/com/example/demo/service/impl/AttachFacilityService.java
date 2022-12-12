package com.example.demo.service.impl;

import com.example.demo.model.contract.AttachFacility;
import com.example.demo.repository.IAttachFacilityRepository;
import com.example.demo.service.IAttachFacilityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityService implements IAttachFacilityService {
    private IAttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> findAll() {
        return attachFacilityRepository.findAll();
    }
}
