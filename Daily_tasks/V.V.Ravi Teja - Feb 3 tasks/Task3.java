package Feb3tasks;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task3 {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);  
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\vvrav\\OneDrive\\Desktop\\techm stuff training\\helloravi.txt";  
        
        try {
            readFile(fileName);  
        } catch (FileNotFoundException e) {
            System.out.println("Exception: File not found - " + e.getMessage());
        }
    }
}
