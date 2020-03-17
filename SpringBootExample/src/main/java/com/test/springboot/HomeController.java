package com.test.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @GetMapping("/getPerson")
    public Person getPerson() {
        return new Person("John");
    }

    @GetMapping("/getPerson/{name}")
    public Person getPerson(@PathVariable String name) {
        return new Person(name);
    }
}
