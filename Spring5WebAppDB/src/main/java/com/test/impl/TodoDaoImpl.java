package com.test.impl;

import com.test.dao.TodoDao;
import com.test.model.Person;
import com.test.model.Todo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TodoDaoImpl implements TodoDao {

    @Autowired
    SessionFactory sessionFactory;

    public List<Todo> getAllTodos() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Todo");
        List<Todo> todoList = query.list();
        session.flush();
        return todoList;
    }

    public List<Todo> getTodosByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select t from Todo t where t.personName ='" + username + "'");
        List<Todo> list = query.list();
        session.flush();
        return list;
    }

    public void addTodo(Todo todo) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(todo);
        session.flush();
    }

    public Todo getTodoById(int id) {
        return null;
    }

    public Todo getTodoByUserId(int id) {
        return null;
    }

    public List<Person> getAllPersons() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select p.name from Person p");
        List<Person> personList = query.list();
        session.flush();
        return personList;
    }

    public Person getPersonByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("Select p from Person p where p.name = '" + username + "'");
        Person person = (Person) query.uniqueResult();
        session.flush();
        return person;
    }

    public Person getPersonById(int id) {
        return null;
    }

    public void addPerson(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(person);
        session.flush();
    }
}
