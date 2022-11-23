package com.codegym.controller;

import com.codegym.model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class SettingController {
    List<String> languageList=Arrays.asList("Vietnamese", "Japanese","English","Chinese");
    List<Integer> pageSizeList= Arrays.asList(5,10,15,20);
    List<Boolean> spamsFillterList = Arrays.asList(true,false);
    @GetMapping("update")
    public String showList( Model model) {
        model.addAttribute("languageList",languageList);
        model.addAttribute("pageSizeList",pageSizeList);
        model.addAttribute("spamsFillterList",spamsFillterList);
        model.addAttribute("setting", new Setting());
        return "update";
    }

    @PostMapping("update")
    public String save(Setting setting, RedirectAttributes redirectAttributes,Model model) {
        model.addAttribute("setting",setting);
        redirectAttributes.addFlashAttribute("message", "update thành công");
        return "result";
    }
}
