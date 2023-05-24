package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/getName")
    public Student getStudent(){
        return new Student("Anagha", "D Ananth");
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Pam", "Beesly"));
        students.add(new Student("Jim", "Halpert"));
        students.add(new Student("Dwight", "Schrute"));
        return students;
    }

    @GetMapping("{firstName}/{lastName}")
    // To retrieve a single resource
    // http://localhost:8080/jim/halpert
    // This simply returns a new object with the values passed in the URL.
    // It does not retrieve the object from backend with same value.
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName){
        return new Student(firstName, lastName);
    }

    @GetMapping("/student/query")
    // To sort and filter
    // http://localhost:8080/student?firstName=Jim&lastName=Halpert
    // This simply returns a new object with the values passed in the URL.
    // It does not retrieve the object from backend with same value.
    public Student studentQueryParams(@RequestParam(name="firstName") String firstName,
                                      @RequestParam(name="lastName") String lastName){
        return new Student(firstName, lastName);
    }
}



