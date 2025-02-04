package Feb3tasks;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Task4 {

    public static void checkNumbersInFile(String fileName) throws Exception {
        File file = new File(fileName);
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
        
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                throw new Exception("Found a positive number: " + number);
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\vvrav\\OneDrive\\Desktop\\techm stuff training\\ravi numbers.txt"; 
        
        try {
            checkNumbersInFile(fileName); 
            System.out.println("No positive numbers found.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
