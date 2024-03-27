package se.inyat;
import java.util.Objects;

public class TodoItem {
    private int id;
    private String title;
    private String description;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String description, boolean done, Person creator) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
        this.creator = creator;
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
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "{id: " + id + ", title: '" + title + "', description: '" + description + "', done: " + done + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TodoItem todoItem = (TodoItem) obj;
        return id == todoItem.id &&
                done == todoItem.done &&
                title.equals(todoItem.title) &&
                Objects.equals(description, todoItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, done);
    }
}
