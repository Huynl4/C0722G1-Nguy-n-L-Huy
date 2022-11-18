package com.codegym.controller;

import com.codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;
    @GetMapping("")
    public String dictionary() {
        return "/index";
    }
    @PostMapping("")
    public String dictionary(String value, Model model) {
        Map<String, String> map = iDictionaryService.change();
        model.addAttribute("value", value);
        model.addAttribute("map", map);
        return "/index";
    }
}
