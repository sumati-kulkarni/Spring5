package com.test.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personId")
    private Person person;

    private String description;
    private Date endDate;
    private boolean isDone;
    private String personName;

    public Todo() {}

    public Todo(int id, Person person, String description, Date endDate, boolean isDone) {
        super();
        this.id = id;
        this.person = person;
        this.description = description;
        this.endDate = endDate;
        this.isDone = isDone;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPersonName() {
        return personName;
    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public String getDescription() {
        return description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public boolean isDone() {
        return isDone;
    }


}
