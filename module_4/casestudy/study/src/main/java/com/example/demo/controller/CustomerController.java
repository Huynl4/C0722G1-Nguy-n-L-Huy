package com.example.demo.controller;

import com.example.demo.dto.CustomerDto;
import com.example.demo.model.customer.Customer;
import com.example.demo.model.customer.CustomerType;
import com.example.demo.service.ICustomerService;
import com.example.demo.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;

    //
//    @GetMapping
//    public String showForm(Model model, @PageableDefault(page = 0, size = 3) Pageable pageable) {
//        Iterable<Customer> customers = customerService.findAll(pageable);
//        model.addAttribute("customers", customers);
//        return "customer/list";
//    }
    @GetMapping
    public String showForm(@RequestParam(required = false, defaultValue = "") String name,
                           @RequestParam(required = false, defaultValue = "") String email,
                           @RequestParam(required = false, defaultValue = "") String customerTypeId,
                           Model model, @PageableDefault(page = 0, size = 4) Pageable pageable) {
        Page<Customer> customers = customerService.search(pageable, name, email,customerTypeId);
        model.addAttribute("customers", customers);
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("customerTypeId", customerTypeId);
        return "customer/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        List<CustomerType> customerTypes = customerTypeService.findAll();
        model.addAttribute("customerDto", new CustomerDto());
        model.addAttribute("customerTypes", customerTypes);

        return "customer/create";
    }

    @PostMapping("/create")
    public String saveCustomer(@Validated @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes, Model model, Pageable pageable) {

        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasErrors()) {
//            model.addAttribute("customers", customerService.findAll(pageable));
            return "customer/create";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("mess", "thêm thành công");
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable Long id, Model model) {
        CustomerDto customerDto = new CustomerDto();
        Customer customer = customerService.findById(id).get();
        List<CustomerType> customerTypes = customerTypeService.findAll();
        model.addAttribute("customerTypes", customerTypes);
        BeanUtils.copyProperties(customer, customerDto);
        model.addAttribute("customerDto", customerDto);
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String editCustomer(@Validated @ModelAttribute("customerDto") CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "customer/edit";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("mess", "sửa thành công");
        return "redirect:/customer";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("deleteId") Long id, RedirectAttributes redirectAttributes) {
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("mess", "Xóa thành công");
        return "redirect:/customer";
    }
}
