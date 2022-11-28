package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.IBlogService;
import com.example.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/blog")
    public String showAllAndFindList(@PageableDefault(page = 0,size = 3, sort = ) Pageable pageable,
                                     @RequestParam(defaultValue = "") String name, Model model) {
//        Page<Blog> allBlogSortedByName = blogService.findAll(Sort.by("name"));
//        Pageable sortedByName =
//                PageRequest.of(0, 3, Sort.by("name"));
        Page<Blog> blogs = blogService.search(name, pageable);
        model.addAttribute("name", name);
        model.addAttribute("blogList", blogs);
        model.addAttribute("categoryList", categoryService.findAll());
        return "/blog/list";
    }

    @GetMapping("/create")
    public String saveBlog(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryList", categoryService.findAll());
        return "/blog/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "thêm mới thành công");
        return "redirect:/blog";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id, Model model) {
        Optional<Blog> blog = blogService.findById(id);
        model.addAttribute("blog", blog.get());
        model.addAttribute("categoryList", categoryService.findAll());
        return "/blog/edit";
    }

    @PostMapping("/update")
    public String update(Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Sửa thành công");
        return "redirect:/blog";
    }

    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable int id, Model model) {
        Optional<Blog> blog = blogService.findById(id);
        if (blog.isPresent()) {
            model.addAttribute("blog", blog.get());
            return "/blog/delete";
        } else {
            return "/error-404";
        }
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("blog") Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:/blog";
    }

    @GetMapping("{id}/view")
    public String showView(@PathVariable int id, Model model) {
        Optional<Blog> blog = blogService.findById(id);
        model.addAttribute("blog", blog.get());
        return "/blog/view";
    }
}
