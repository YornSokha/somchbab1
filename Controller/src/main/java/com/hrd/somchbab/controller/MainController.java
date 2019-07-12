package com.hrd.somchbab.controller;

import com.hrd.somchbab.service.academic_service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    AcademicService academicService;

    @GetMapping("/")
    public String findAll(){
        return "user/index";
//        return academicService.findAll().toString();
    }
}
