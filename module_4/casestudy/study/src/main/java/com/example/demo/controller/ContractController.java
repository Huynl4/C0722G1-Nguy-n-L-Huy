package com.example.demo.controller;

import com.example.demo.model.contract.Contract;
import com.example.demo.service.IAttachFacilityService;
import com.example.demo.service.IContractDetailService;
import com.example.demo.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private IContractDetailService contractDetailService;
    @Autowired
    private IAttachFacilityService attachFacilityService;

        @GetMapping("")
    public String showForm(Model model, @PageableDefault(page = 0,size = 4) Pageable pageable) {
        Page<Contract> contracts = contractService.findAll(pageable);
        model.addAttribute("contracts", contracts);
        return "contract/list";
    }
}
