package chapter1;

public class FirstThreadTest {
    public static void main(String[] args) throws InterruptedException {
        FirstThread ft = new FirstThread();
        Thread t1 = new Thread(ft);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main: " + i);
            Thread.sleep(1000);
        }
    }
}
