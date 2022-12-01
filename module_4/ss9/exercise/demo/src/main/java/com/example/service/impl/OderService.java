package com.example.service.impl;

import com.example.model.Oder;
import com.example.repository.IOderRepository;
import com.example.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OderService implements IOderService {
    @Autowired
    private IOderRepository oderRepository;

    @Override
    public void save(Oder oder) {
        oderRepository.save(oder);
    }
}
