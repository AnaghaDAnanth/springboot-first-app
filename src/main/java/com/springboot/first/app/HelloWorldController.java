package com.springboot.first.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// ResponseBody uses HTTP Message converters to convert
// the return value from JAVA Object to HTTP response body
// like JSON based on the content-type in request HTTP header.
public class HelloWorldController {
    @GetMapping("/hello-world")
    // http://localhost:8080/hello-world returns the string in the method
    public String helloworld(){
        return "Hello World!";
    }
}





