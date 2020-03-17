package com.test.controller;

import com.test.dao.TodoDao;
import com.test.model.Person;
import com.test.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
public class HomeController {

    Person person;
    Todo todo;

    @Autowired
    private TodoDao todoDao;

    @RequestMapping(value = "/addUser")
    public String addPerson(Model model) {
        model.addAttribute("person", new Person());
        return "addUser";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUserPost(Person person, Model model) {
        this.person = person;
        todoDao.addPerson(this.person);
        model.addAttribute("person", this.person);
        return "addUser";
    }

/*
    @RequestMapping(value = "/person")
    public ModelAndView person(Model model) {
        Person person = new Person();
        person.setName("David");
        person.setPersonId(2);
        model.addAttribute("person", person);
        return new ModelAndView("index");
    }
 */

    @RequestMapping("/todoList")
    public String getTodoList(Model model) {
        List<Todo> todoList = todoDao.getAllTodos();
        model.addAttribute("todoList", todoList);
        return "todoList";
    }

    @RequestMapping("/personList")
    public String getPersonList(Model model) {
        List<Person> personList = todoDao.getAllPersons();
        model.addAttribute("personList", personList);
        return "personList";
    }

    @RequestMapping("/todoList/person/{name}")
    public String person(@PathVariable String name, Model model) {
        List<Todo> todoList = todoDao.getTodosByUsername(name);
        model.addAttribute("todoList", todoList);
        return "viewPersonTodos";
    }

    @RequestMapping(value = "/addTodo")
    public String addTodo(Model model) {
        List<Person> personList = todoDao.getAllPersons();
        model.addAttribute("todo", new Todo());
        model.addAttribute("personList", personList);
        return "addTodo";
    }

    @RequestMapping(value = "/addTodo", method = RequestMethod.POST)
    public String addTodoPost(@ModelAttribute("todo") Todo todo, Model model) {
        this.todo = todo;
        System.out.println(todo.getDescription());
        System.out.println(todo.getPersonName());
        //todoDao.addTodo(todo);
        //return "redirect:/todoList/person/" + todo.getPersonName();
        return "addTodo";
    }
}
