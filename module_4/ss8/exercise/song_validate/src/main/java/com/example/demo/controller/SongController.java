package com.example.demo.controller;

import com.example.demo.model.Song;
import com.example.demo.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("")
    public String showFormSong(Model model) {
        model.addAttribute("song", new Song());
        model.addAttribute("songs", songService.findAll());
        return "/song/home";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("song", new Song());
        return "/song/create";
    }

    @PostMapping("/create")
    public String saveSong(@Validated @ModelAttribute("song") Song song, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "song/create";
        }
        songService.save(song);
        return "redirect:/song";
    }
//    @GetMapping("/edit")
//    public String showFormEdit(Model model){
//        model.addAttribute("song",new Song());
//        return "/song/edit";
//    }
//    @PostMapping("/edit")
//
}
