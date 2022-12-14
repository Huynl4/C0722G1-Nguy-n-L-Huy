package com.example.demo.service;

import com.example.demo.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IFacilityService {
    void save(Facility facility);

    Optional<Facility> findById(Long id);

    void remove(Long id);

    Page<Facility> search(Pageable pageable, String name, String facilityType);

    List<Facility> findAll(Pageable pageable);
}
