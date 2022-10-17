package com.example.studentservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("crud/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("get-all")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @PostMapping("/create")
    public Student create(@RequestBody  Student student){
        return studentService.create(student);
    }


}
