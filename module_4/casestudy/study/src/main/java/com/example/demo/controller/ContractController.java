package com.example.demo.controller;

import com.example.demo.dto.ContractView;
import com.example.demo.model.contract.Contract;
import com.example.demo.model.customer.Customer;
import com.example.demo.model.facility.Facility;
import com.example.demo.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService contractService;
    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String showListContract(Model model, @PageableDefault(page = 0, size = 4) Pageable pageable) {
        Page<ContractView> contracts = contractService.findAll(pageable);
        List<Facility> facilities = facilityService.findAll(pageable);
        List<Customer> customers = customerService.findAll();
        model.addAttribute("contracts", contracts);
        model.addAttribute("facilities", facilities);
        model.addAttribute("customers", customers);
        return "contract/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model, Pageable pageable) {
        model.addAttribute("contract", new Contract());
        model.addAttribute("customerList", customerService.findAll());
        model.addAttribute("facilitis", facilityService.findAll(pageable));
        return "contract/create";
    }

    @PostMapping("/create")
    public String saveContract(@ModelAttribute("contract") Contract contract, RedirectAttributes redirectAttributes) {
        contractService.save(contract);
        redirectAttributes.addFlashAttribute("mess", "thêm mới thành công");
        return "redirect:/contract/";
    }

}
