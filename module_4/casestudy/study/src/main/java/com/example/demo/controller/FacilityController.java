package com.example.demo.controller;

import com.example.demo.dto.FacilityDto;
import com.example.demo.model.facility.Facility;
import com.example.demo.model.facility.FacilityType;
import com.example.demo.model.facility.RentType;
import com.example.demo.service.IFacilityService;
import com.example.demo.service.IFacilityTypeService;
import com.example.demo.service.IRentTypeService;
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
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;
    @Autowired
    private IFacilityTypeService facilityTypeService;
    @Autowired
    private IRentTypeService rentTypeService;

    @GetMapping
    public String showForm(@RequestParam(required = false, defaultValue = "") String name,
                           @RequestParam(required = false, defaultValue = "") String facilityTypeId,
                           Model model, @PageableDefault(page = 0, size = 4) Pageable pageable) {
        Page<Facility> facilities = facilityService.search(pageable, name, facilityTypeId);
        model.addAttribute("facilities", facilities);
        model.addAttribute("name", name);
        model.addAttribute("facilityTypeId", facilityTypeId);
        return "facility/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        List<FacilityType> facilityTypes = facilityTypeService.findAll();
        List<RentType> rentTypes = rentTypeService.findAll();
        model.addAttribute("facilityDto", new FacilityDto());
        model.addAttribute("facilityType", facilityTypes);
        model.addAttribute("rentTypes", rentTypes);
        return "facility/create";
    }

    @PostMapping("/create")
    public String saveFacility(@Validated @ModelAttribute("facilityDto") FacilityDto facilityDto, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes, Model model, Pageable pageable) {
        new FacilityDto().validate(facilityDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "facility/create";
        }
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto, facility);
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("mess", "thêm mới thành công");
        return "redirect:/facility";
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable Long id, Model model) {
        FacilityDto facilityDto = new FacilityDto();
        Facility facility = facilityService.findById(id).get();
        List<FacilityType> facilityTypes = facilityTypeService.findAll();
        List<RentType> rentTypes = rentTypeService.findAll();
        model.addAttribute("facilityTypes", facilityTypes);
        model.addAttribute("rentTypes", rentTypes);
        BeanUtils.copyProperties(facility, facilityDto);
        model.addAttribute("facilityDto", facilityDto);
        return "facility/edit";
    }

    @PostMapping("/edit")
    public String editFacility(@Validated @ModelAttribute("facilityDto") FacilityDto facilityDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "facility/edit";
        }
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto, facility);
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("mess", "sửa thành công");
        return "redirect:/facility";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("deleteId") Long id, RedirectAttributes redirectAttributes) {
        facilityService.remove(id);
        redirectAttributes.addFlashAttribute("mess", "xóa thành công");
        return "redirect:/facility";
    }
}
