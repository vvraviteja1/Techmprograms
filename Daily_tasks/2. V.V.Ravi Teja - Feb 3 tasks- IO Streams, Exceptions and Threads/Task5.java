package Feb3tasks;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Task5 {
    public static void checkFileEmpty(String fileName) throws Exception {
        File file = new File(fileName);
        
        if (file.length() == 0) {  
            throw new Exception("The file is empty.");
        }

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        String fileName = "C:\\\\Users\\\\vvrav\\\\OneDrive\\\\Desktop\\\\techm stuff training\\\\helloravi.txt";         
        try {
            checkFileEmpty(fileName);  
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

