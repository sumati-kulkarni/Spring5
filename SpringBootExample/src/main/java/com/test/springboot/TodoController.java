package com.test.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/users/{name}/todoList")
    public List<Todo> getTodoListForUser(@PathVariable String name ) {
        return todoService.getTodosForUser(name);
    }

    @GetMapping("/users/todoList")
    public List<Todo> getTodoList() {
        return todoService.getTodoList();
    }
}
