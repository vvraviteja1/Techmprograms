package org.anurag;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the number of students
        int n = 0;
        System.out.print("Enter number of students: ");
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for number of students. Please enter an integer.");
            return;
        }
        scanner.nextLine(); // Consume the newline character

        // Getting student names
        String[] students = new String[n];
        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextLine().trim();
        }

        // Getting the number of branches
        int m = 0;
        System.out.print("Enter number of branches: ");
        try {
            m = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for number of branches. Please enter an integer.");
            return;
        }
        scanner.nextLine(); // Consume the newline character

        // Getting branch names
        String[] branches = new String[m];
        System.out.println("Enter branch names:");
        for (int i = 0; i < m; i++) {
            branches[i] = scanner.nextLine().trim();
        }

        // Create a map to group students by their matching branch
        Map<String, List<String>> branchMap = new HashMap<>();

        // Check for each student which branch they belong to
        for (String student : students) {
            for (String branch : branches) {
                if (student.equalsIgnoreCase(branch)) {
                    // If the branch is already in the map, add the student to the list
                    branchMap.computeIfAbsent(branch, k -> new ArrayList<>()).add(student);
                    break; // Stop once the student matches a branch
                }
            }
        }

        // Print students grouped by their branch
        System.out.println("Students grouped by branch:");
        for (Map.Entry<String, List<String>> entry : branchMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
