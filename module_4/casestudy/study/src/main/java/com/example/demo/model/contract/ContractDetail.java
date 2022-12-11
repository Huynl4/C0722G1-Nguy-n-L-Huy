package com.example.demo.model.contract;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ContractDetail {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;


    private int quantity;


    @ManyToOne
    private Contract contract;


    @ManyToOne
    private AttachFacility attachFacility;


    public ContractDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }
}
