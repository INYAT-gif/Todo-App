package se.inyat;

import java.time.LocalDate;

public class TodoItem {
    // Fields
    private int id;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;
    private Person creator;

    // Constructor
    public TodoItem(int id, String title, String description, LocalDate deadline, Person creator) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.creator = creator;
        this.done = false; // Initially not done
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        if (deadline == null) {
            throw new IllegalArgumentException("Deadline cannot be null");
        }
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    // Method to get a summary of the TodoItem object
    public String getSummary() {
        return "{id: " + id + ", title: " + title + ", description: " + description +
                ", deadline: " + deadline.toString() + ", done: " + done + ", creator: " + creator.getSummary() + "}";
    }

    // Method to check if the TodoItem is overdue
    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(deadline);
    }
}
