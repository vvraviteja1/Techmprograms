
package org.anurag;
import java.util.*;

public class Task2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students and subjects
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int subjectCount = scanner.nextInt();

        String[] names = new String[n]; // To store student names
        int[][] marks = new int[n][subjectCount + 2]; // [n][subject marks + total + average]

        // Input student details
        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Consume newline
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            int total = 0;
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
                total += marks[i][j];
            }
            marks[i][subjectCount] = total; // Store total
            marks[i][subjectCount + 1] = total / subjectCount; // Store average
        }

        // Sort students by total marks (Bubble sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j][subjectCount] < marks[j + 1][subjectCount]) {
                    // Swap marks
                    int[] temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        // Display sorted student details
        System.out.println("\nSorted List of Students by Total Marks:");
        System.out.println("Name\tTotal\tAverage");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + "\t" + marks[i][subjectCount] + "\t" + marks[i][subjectCount + 1]);
        }

        scanner.close();
    }
}