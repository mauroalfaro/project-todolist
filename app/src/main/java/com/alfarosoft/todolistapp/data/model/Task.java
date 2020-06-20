package com.alfarosoft.todolistapp.data.model;

import java.sql.Timestamp;

public class Task {

    private String taskName;
    private String taskDescription;
    private Timestamp dateCreated;

    public Task(String taskName, String taskDescription, Timestamp dateCreated) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.dateCreated = dateCreated;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }
}
