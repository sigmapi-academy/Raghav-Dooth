package ThreadSynchronization;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadLockDetectMX{
    public static void deadLockDetect(){
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] ids = bean.findDeadlockedThreads();
        if(ids != null){
            System.out.println("DeadLock detected!");
            ThreadInfo[] infos = bean.getThreadInfo(ids, true, true);
            for (ThreadInfo threadInfo : infos) {
                System.out.println("Thread name: " + threadInfo.getThreadName());
                System.out.println("Thread State: " + threadInfo.getThreadState());
                System.out.println("Locked On: " + threadInfo.getLockName());
                System.out.println("Owned by: "+threadInfo.getLockOwnerName());
                System.out.println("Stack trace: ");
                for (StackTraceElement ste: threadInfo.getStackTrace()) {
                    System.out.println("\t"+ ste);
                }
                System.out.println("------------------------------------------------");
            }
        }
        else{
            System.out.println("No deadlock detected!");
        }
    }

    public static void main(String[] args) {
        Object r1 = new Object();
        Object r2 = new Object();

        Thread t1 = new Thread(new DeadLockDetect(r1, r2), "Ajay");
        Thread t2 = new Thread(new DeadLockDetect(r1, r2), "Vijay");

        t1.start();
        t2.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DeadLockDetectMX.deadLockDetect();
    }
}
