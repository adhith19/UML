import java.util.ArrayList;
import java.util.Scanner;

public class Todolist {

    static ArrayList<String> tasks = new ArrayList<>();
    static ArrayList<Boolean> completed = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    completeTask();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }

    static void addTask() {

        System.out.print("Enter task: ");
        String task = sc.nextLine();

        tasks.add(task);
        completed.add(false);

        System.out.println("Task added successfully.");
    }

    static void viewTasks() {

        System.out.println("\n----- Task List -----");

        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {

            String status;

            if (completed.get(i)) {
                status = "Completed";
            } else {
                status = "Pending";
            }

            System.out.println((i + 1) + ". "
                    + tasks.get(i) + " - " + status);
        }
    }

    static void completeTask() {

        viewTasks();

        if (tasks.isEmpty()) {
            return;
        }

        System.out.print("Enter task number to complete: ");
        int number = sc.nextInt();
        sc.nextLine();

        if (number >= 1 && number <= tasks.size()) {

            completed.set(number - 1, true);

            System.out.println("Task marked as completed.");

        } else {
            System.out.println("Invalid task number.");
        }
    }

    static void deleteTask() {

        viewTasks();

        if (tasks.isEmpty()) {
            return;
        }

        System.out.print("Enter task number to delete: ");
        int number = sc.nextInt();
        sc.nextLine();

        if (number >= 1 && number <= tasks.size()) {

            tasks.remove(number - 1);
            completed.remove(number - 1);

            System.out.println("Task deleted successfully.");

        } else {
            System.out.println("Invalid task number.");
        }
    }
}