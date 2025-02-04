package Feb3tasks;
public class Task2 {

    public static void checkIfOdd(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("The number " + number + " is odd!");
        } else {
            System.out.println("The number " + number + " is even.");
        }
    }

    public static void main(String[] args) {
        int number = 9;  
        
        try {
            checkIfOdd(number);  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
