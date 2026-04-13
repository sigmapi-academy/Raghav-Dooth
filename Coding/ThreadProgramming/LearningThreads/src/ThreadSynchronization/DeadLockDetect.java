package ThreadSynchronization;

public class DeadLockDetect implements Runnable{
    final Object resource1;
    final Object resource2;

    public DeadLockDetect(Object lock1, Object lock2){
        this.resource1 = lock1;
        this.resource2 = lock2;
    }

    @Override
    public void run() {
        synchronized(resource1){
            System.out.println(Thread.currentThread().getName()+": acquired lock");
            try {
                Thread.sleep((1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(resource2){
                System.out.println(Thread.currentThread().getName()+": acquired lock");
            }
        }

        synchronized(resource2){
            System.out.println(Thread.currentThread().getName() + ": acquired lock");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(resource1){
                System.out.println(Thread.currentThread().getName()+": acquired lock");
            }
        }
    }
}
