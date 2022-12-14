package com.example.demo.repository;

import com.example.demo.dto.ContractView;
import com.example.demo.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IContractRepository extends JpaRepository<Contract, Long> {
    @Query(value = "SELECT ctr.id, f.name as facilityName, c.name as customerName, ctr.deposit, ctr.start_date as startDate, ctr.end_date as endDate, SUM((ifnull(cd.quantity,0) * ifnull(af.cost,0)) + ifnull(f.cost,0)) as total FROM contract ctr" +
            "            LEFT JOIN customer c ON c.id = ctr.customer_id" +
            "            LEFT JOIN facility f ON f.id = ctr.facility_id" +
            "            LEFT JOIN contract_detail cd ON ctr.id = cd.contract_id" +
            "            LEFT JOIN attach_facility af ON cd.attach_facility_id = af.id" +
            "            GROUP BY ctr.id",
            countQuery = "select * from (SELECT ctr.id, f.name as facilityName, c.name as customerName, ctr.deposit, ctr.start_date as startDate, ctr.end_date as endDate, SUM((ifnull(cd.quantity,0) * ifnull(af.cost,0)) + ifnull(f.cost,0)) as total FROM contract ctr" +
                    "            LEFT JOIN customer c ON c.id = ctr.customer_id" +
                    "            LEFT JOIN facility f ON f.id = ctr.facility_id" +
                    "            LEFT JOIN contract_detail cd ON ctr.id = cd.contract_id" +
                    "            LEFT JOIN attach_facility af ON cd.attach_facility_id = af.id" +
                    "            GROUP BY ctr.id) as count_contract",
            nativeQuery = true)
    Page<ContractView> findAllContract(Pageable pageable);

}
