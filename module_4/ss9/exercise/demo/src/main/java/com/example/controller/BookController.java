package com.example.controller;

import com.example.model.Book;
import com.example.model.Oder;
import com.example.service.IBookService;
import com.example.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IOderService oderService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("books", bookService.findAll());
        return "/book/home";
    }

    @GetMapping("/oder/{id}")
    public String showOder(@PathVariable Long id, Model model) throws Exception {
        Book book = bookService.findById(id);
        if (book.getCount() == 0) {
            throw new Exception();
        }
        model.addAttribute("book", book);
        return "/book/view";
    }
    @PostMapping("/save")
    private String saveBook(@ModelAttribute Book book, RedirectAttributes redirectAttributes) {
        book.setCount(book.getCount() - 1);
        bookService.save(book);
        int borrowCode = ((int) (Math.random() * 1000));
        Oder oder = new Oder(borrowCode, book);
        oderService.save(oder);
        redirectAttributes.addFlashAttribute("success", oder.getCodeBook());
        return "redirect:/book";
    }
}
