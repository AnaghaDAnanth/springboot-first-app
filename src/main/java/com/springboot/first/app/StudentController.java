package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/getName")
    public Student getStudent(){
        return new Student("Anagha", "D Ananth");
    }

}
