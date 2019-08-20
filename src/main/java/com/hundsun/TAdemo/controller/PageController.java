package com.hundsun.TAdemo.controller;


import com.hundsun.TAdemo.model.Student;
import com.hundsun.TAdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PageController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "thymeleaf");
        return "index";
    }

    @RequestMapping("/table")
    public String table(Model model) {
        List<Student> studentList = studentService.getAllStudents();
        model.addAttribute("studentList", studentList);
        return "table";
    }
}
