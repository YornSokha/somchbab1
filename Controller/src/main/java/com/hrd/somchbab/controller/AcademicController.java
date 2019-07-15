package com.hrd.somchbab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcademicController {
    @GetMapping("/academic")
    public String getListAcademic(){
        return "/academic/index";
    }

    @GetMapping("/academic/view")
    public String getViewAcademic(){
        return "/academic/view";
    }
    @GetMapping("/academic/add")
    public String getAddAcademic(){
        return "/academic/add";
    }
    @GetMapping("/academic/edit")
    public String getEditAcademic(){
        return "/academic/edit";
    }
    @GetMapping("/course")
    public String getIndex(){
        return "/course/index";
    }
}
