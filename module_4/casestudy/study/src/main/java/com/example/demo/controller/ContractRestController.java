package com.example.demo.controller;

import com.example.demo.dto.ContractView;
import com.example.demo.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contracts")
@CrossOrigin("*")
public class ContractRestController {
    @Autowired
    private IContractService contractService;

    @GetMapping("")
    public String showListContract(@PageableDefault(size = 4) Pageable pageable, Model model) {
        Page<ContractView> contractViewPage = contractService.findAll(pageable);
        model.addAttribute("contractViewPage", contractViewPage);
        return "contract/listt";
    }
}
