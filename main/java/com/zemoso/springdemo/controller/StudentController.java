package com.zemoso.springdemo.controller;

import com.zemoso.springdemo.dao.StudentDao;
import com.zemoso.springdemo.entity.Student;
import com.zemoso.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    public String listStudents(Model model){
        List<Student> students= studentService.getStudents();
        model.addAttribute("students",students);
        return "list-students";
    }
    @RequestMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        Student student=new Student();
        model.addAttribute("student",student);
        return "student-form";
    }
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student theStudent){
        studentService.saveStudent(theStudent);
        return "redirect:/student/list";
    }
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("studentId") int theId, Model model){
        Student theStudent=studentService.getStudent(theId);
        model.addAttribute("student",theStudent);
        return "student-form";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") int theId){
        studentService.deleteStudent(theId);
        return "redirect:/student/list";
    }
}
