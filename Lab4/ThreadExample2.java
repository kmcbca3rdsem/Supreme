package Lab4;

class HelloThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello Thread");
        }
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        HelloThread obj = new HelloThread();
        Thread t = new Thread(obj);
        t.start();
    }
}