package com.test.springboot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();

    static {
        todoList.add(new Todo(1, "John", "Learn Spring", new Date(), false));
        todoList.add(new Todo(2, "Alice", "Learn Java", new Date(), false));
        todoList.add(new Todo(3, "Bob", "Learn Data Mining", new Date(), false));
    }

    public List<Todo> getTodosForUser(String user) {
        List<Todo> filterTodos = new ArrayList<>();

        for(Todo todo: todoList) {
            if(todo.getUser().equals(user)) {
                filterTodos.add(todo);
            }
        }
        return filterTodos;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public Todo getTodoById(int id) {
        for(Todo todo: todoList){
            if(todo.getId() == id)
                return todo;
        }
        return null;
    }
}
