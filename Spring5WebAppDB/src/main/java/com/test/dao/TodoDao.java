package com.test.dao;

import com.test.model.Person;
import com.test.model.Todo;

import java.util.List;

public interface TodoDao {
    void addTodo(Todo todo);
    List<Todo> getAllTodos();
    List<Todo> getTodosByUsername(String username);
    Todo getTodoById(int id);
    Todo getTodoByUserId(int id);

    List<Person> getAllPersons();
    Person getPersonByUsername(String username);
    Person getPersonById(int id);

    void addPerson(Person person);
}
