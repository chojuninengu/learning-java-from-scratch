import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;
                case 2:
                    System.out.println("\nYour Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    if (updateIndex >= 0 && updateIndex < tasks.size()) {
                        System.out.print("Enter the updated task: ");
                        tasks.set(updateIndex, scanner.nextLine());
                        System.out.println("Task updated!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 4:
                    System.out.print("Enter task number to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
                        tasks.remove(deleteIndex);
                        System.out.println("Task deleted!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting To-Do List App. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
