public class TaskManager {

    public static void main(String[] args) {
        System.out.println("Task Manager initializing...");
        // TODO: Add methods for create, read, update, delete tasks
    }
    // Method to create a new task
    public void createTask(String taskName) {
        System.out.println("Creating task: " + taskName);
    }

    //Method to list all tasks
    public void listTasks() {
        System.out.println("Listing all tasks...");
    }

    // Method to update an existing task
    public void updateTask(String taskName, String newDetails) {
        System.out.println("Updating task: " + taskName + " with new details: " + newDetails);
    }

    // Method to delete a task
    public void deleteTask(String taskName) {
        System.out.println("Deleting task: " + taskName);
    }
}
