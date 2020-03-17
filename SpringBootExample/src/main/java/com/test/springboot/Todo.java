package com.test.springboot;

import java.util.Date;

public class Todo {
    private int id;
    private String user;
    private String description;
    private Date endDate;
    private boolean isDone;

    public Todo() {}

    public Todo(int id, String user, String description, Date endDate, boolean isDone) {
        super();
        this.id = id;
        this.user = user;
        this.description = description;
        this.endDate = endDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
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
