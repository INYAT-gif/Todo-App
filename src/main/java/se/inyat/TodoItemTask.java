package se.inyat;

public class TodoItemTask {
    // Fields
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    // Constructor
    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        this.id = id;
        this.todoItem = todoItem;
        this.assignee = assignee;
        this.assigned = true; // Set to true since assignee is not null
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) {
            throw new IllegalArgumentException("TodoItem cannot be null");
        }
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        if (assignee == null) {
            throw new IllegalArgumentException("Assignee cannot be null");
        }
        this.assignee = assignee;
        this.assigned = true; // Set to true since assignee is not null
    }

    // Method to get a summary of the TodoItemTask object
    public String getSummary() {
        return "{id: " + id + ", assigned: " + assigned + ", todoItem: " + todoItem.getSummary() +
                ", assignee: " + assignee.getSummary() + "}";
    }
}
