package com.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.codegym.service.ICurrencyService;

@Controller
@RequestMapping("/currency")
public class CurrencyController {
    @Autowired
    private ICurrencyService currencyService;

    @GetMapping
    public String showHome() {
        return "/index";
    }

    @PostMapping("/change")
    public String currency(@RequestParam int usd, Model model) {

        int result = currencyService.total(usd);
        model.addAttribute("number", result);
        return "/index";
    }
}
