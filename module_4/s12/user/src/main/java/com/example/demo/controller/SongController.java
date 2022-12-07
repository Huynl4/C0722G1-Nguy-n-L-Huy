package com.example.demo.controller;

import com.example.demo.dto.SongDto;
import com.example.demo.model.Song;
import com.example.demo.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("")
    public String showFormSong(Model model,@PageableDefault(page = 0, size = 2) Pageable pageable ) {
        Iterable<Song> songs = songService.findAll(pageable);
        model.addAttribute("songs", songs);
        return "/song/home";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        SongDto songDto = new SongDto();
        model.addAttribute("songDto", songDto);

        return "/song/create";
    }

    @PostMapping("/create")
    public String saveSong(@Validated @ModelAttribute("songDto") SongDto songDto, BindingResult bindingResult,
                           RedirectAttributes redirectAttributes, Model model,Pageable pageable) {

        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("songs", songService.findAll(pageable));
            return "song/create";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto, song);
        songService.save(song);
        redirectAttributes.addFlashAttribute("mess", "thêm thành công");
        return "redirect:/song";
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable Long id, Model model) {
        SongDto songDto = new SongDto();
        Song song = songService.findById(id).get();
        BeanUtils.copyProperties(song, songDto);
        model.addAttribute("songDto", songDto);
        return "/song/edit";
    }

    //    @GetMapping("/edit2")
//    public String showFormEdit2(@RequestParam Long id, Model model) {
//        SongDto songDto = new SongDto();
//        Song song = songService.findById(id).get();
//        BeanUtils.copyProperties(song, songDto);
//        model.addAttribute("songDto", songDto);
//        return "/song/edit";
//    }
    @PostMapping("/update")
    public String editSong(@Validated @ModelAttribute("songDto") SongDto songDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/song/edit";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto, song);
        songService.save(song);
        return "redirect:/song";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("deleteId") Long id, RedirectAttributes redirectAttributes) {
        songService.remove(id);
        redirectAttributes.addFlashAttribute("mess", "Xóa thành công");
        return "redirect:/song";
    }

    @GetMapping("/view/{id}")
    public String showView(@PathVariable Long id, Model model) {
        SongDto songDto = new SongDto();
        Song song = songService.findById(id).get();
        BeanUtils.copyProperties(song, songDto);
        model.addAttribute("songDto", songDto);
        return "/song/view";
    }
}
