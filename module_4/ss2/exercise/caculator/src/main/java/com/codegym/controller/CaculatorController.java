package com.codegym.controller;

import com.codegym.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @Autowired
    private ICaculatorService iCaculatorService;

    @GetMapping("/")
    public String calulation() {
        return "/index";
    }

    @PostMapping("/caculate")
    public String caculat(@RequestParam double num1, double num2, String choise, Model model) {
        double result = iCaculatorService.result(num1, num2, choise);
        model.addAttribute("result", result); 
        return "/index";

    }


}
