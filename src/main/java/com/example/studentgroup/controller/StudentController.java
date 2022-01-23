package com.example.studentgroup.controller;


import com.example.studentgroup.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

   private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping (path = "/students")
    public void add(@RequestParam Integer id, @RequestParam String name)
    {

        studentService.add(id,name);
    }


}

