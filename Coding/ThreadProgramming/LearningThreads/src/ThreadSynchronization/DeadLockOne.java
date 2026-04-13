package ThreadSynchronization;

public class DeadLockOne {
    static final Object resource1 = new Object();
    static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            synchronized(resource1){
                System.out.println("Thread 1: locked resource-1" );
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(resource2){
                    System.out.println("Thread-1: locked resource-2");
                }
            }
            
        }
        );

        Thread t2 = new Thread(()->{
            synchronized(resource2){
                System.out.println("Thread-2: locked resource-2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(resource1){
                    System.out.println("Thread 1: locked resource-1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
