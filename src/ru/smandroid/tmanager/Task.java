package ru.smandroid.tmanager;

import java.util.Date;

public class Task {
    private String content; // Содержание задачи
    private Date creationDate; // Дата создания
    private boolean isDone; // Закончена ли задача

    public Task(String content, Date creationDate, boolean isDone) {
        this.content = content;
        this.creationDate = creationDate;
        this.isDone = isDone;
    }

    public Task(String content, Date creationDate) {
        this.content = content;
        this.creationDate = creationDate;
        this.isDone = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
