package ThreadState;

public class MyNewThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running...");
        System.out.println("Thread goes to Timed Waiting(sleep)...");
        try {
            Thread.sleep(3000);
            System.out.println("Thread is running again...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is terminated");
    }
}
