package se.inyat;

import java.time.LocalDate;

public class TodoItem {
    // Fields
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    // Constructor
    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        setTitle(title);
        setTaskDescription(taskDescription);
        this.deadLine = deadLine;
        this.done = true;
        this.creator = creator;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle (String title) {
        if (title == null) {
            throw new IllegalArgumentException("Title cannot be null");
        }
        this.title = title;
    }

    // Getter and setter for taskDescription
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    // Getter and setter for done
    public boolean isDone() {

        return done;
    }

    public void setDone (boolean done) {

        this.done = done;
    }

    // Getter and setter for creator
    public Person getCreator() {

        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;

    }
    // Method to check if the item is overdue
    public boolean isOverdue() {

        return LocalDate.now().isAfter(deadLine);
    }

    // Getter for summary
    public String getSummary() {
        return "{id: " + id + ", title: " + title + ", taskDescription: " + taskDescription
                + ", deadLine: " + deadLine + ", done: " + done + ", creator: " + creator + "}";
    }

}
