package se.inyat;
public class App {
    public static void main(String[] args) {
        // Create some AppUsers
        AppUser user1 = new AppUser("user1", AppRole.ROLE_APP_USER);
        AppUser user2 = new AppUser("user2", AppRole.ROLE_APP_ADMIN);

        // Create some Persons with credentials
        Person person1 = new Person(1, "Inyat", "Nathani", "inyat@example.com", user1);
        Person person2 = new Person(2, "Jane", "Smith", "jane@example.com", user2);

        // Create some TodoItems
        TodoItem todoItem1 = new TodoItem(1, "Buy groceries", "Milk, eggs, bread", false, person1);
        TodoItem todoItem2 = new TodoItem(2, "Complete project report", "Finish by Friday", false, person2);

        // Create some TodoItemTasks
        TodoItemTask task1 = new TodoItemTask(1, true, todoItem1, person2);
        TodoItemTask task2 = new TodoItemTask(2, false, todoItem2, person1);

        // Output objects
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("TodoItem 1: " + todoItem1);
        System.out.println("TodoItem 2: " + todoItem2);
        System.out.println("TodoItemTask 1: " + task1);
        System.out.println("TodoItemTask 2: " + task2);

        // Test equality
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("todoItem1.equals(todoItem2): " + todoItem1.equals(todoItem2));
        System.out.println("task1.equals(task2): " + task1.equals(task2));
    }
}
