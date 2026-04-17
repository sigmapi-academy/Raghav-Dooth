package ThreadSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo {
    static Lock l1 = new ReentrantLock();
    static Lock l2 = new ReentrantLock();

    static class Task implements Runnable {
        @Override
        public void run() {
            try {
                if (l1.tryLock()) {
                    System.out.println(Thread.currentThread().getName() +
                            " acquired lock-1");
                    Thread.sleep(1000);
                    if(l2.tryLock()){
                        System.out.println(Thread.currentThread().getName() + " acquired lock-2");
                        l2.unlock();
                    }
                    l1.unlock();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new Thread(new Task(), "Thread-1").start();
        new Thread(new Task(), "Thread-2").start();
    }
}
