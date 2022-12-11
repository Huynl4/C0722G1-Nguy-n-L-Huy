package com.example.demo.repository;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityRepository extends JpaRepository<Facility, Long> {
    @Query(value = "SELECT * FROM `case`.facility where name like %:name% and facility_type_id like %:facilityTypeId% ", nativeQuery = true)
    Page<Facility> search(Pageable pageable, @Param("name") String name, @Param("facilityTypeId") String facilityTypeId);
}
