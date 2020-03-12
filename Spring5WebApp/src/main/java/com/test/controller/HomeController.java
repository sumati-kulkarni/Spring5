package com.test.controller;

import com.test.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String welcome() {
        return "Hello World from Web-App..!!";
    }

    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/person")
    public ModelAndView person(Model model) {
        Person person = new Person();
        person.setName("David");
        person.setAge(25);
        person.setPersonId(2);
        model.addAttribute("person", person);
        return new ModelAndView("index");
    }
}
