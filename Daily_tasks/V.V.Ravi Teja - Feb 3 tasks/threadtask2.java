package Feb3tasks;

public class threadtask2 {

    static class EvenThread extends Thread {
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
            }
        }
    }

    static class OddThread extends Thread {
        public void run() {
            for (int i = 1; i < 20; i += 2) {
                System.out.println("Odd: " + i);
            }
        }
    }

    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        evenThread.start();
        oddThread.start();
    }
}
