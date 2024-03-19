package se.inyat;

public class TodoItemTask {
    // Fields
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    // Constructor
    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = id;
        this.assigned = true;
        setTodoItem(todoItem);
        setAssignee(assignee);
    }

    // Getter and setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter for assigned
    public boolean isAssigned() {

        return assigned;
    }

    //Encapsulate the 'assigned' field

    public void setAssigned(boolean assigned){
        this.assigned = assigned;
    }

    // Getter and setter for todoItem
    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) {
            throw new IllegalArgumentException("TodoItem cannot be null");
        }
        this.todoItem = todoItem;
    }

    // Getter and setter for assignee
    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        if (assignee == null){
            throw new IllegalArgumentException("Assignee cannot be null");
        }
        this.assignee = assignee;
        this.assigned = true; //Set to true since assignee is not null
    }

    // Method to get summary
    public String getSummary() {
        return "{id: " + id + ", assigned: " + assigned + ", todoItem: " + todoItem.getSummary() + ", assignee: " + assignee.getSummary() + "}";
    }

}
