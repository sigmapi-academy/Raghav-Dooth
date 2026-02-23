package ThreadState;

public class MyThreadOneYeildDemo {
    public static void main(String[] args) {
        System.out.println();
        MyThreadOne t1 = new MyThreadOne(1);
        MyThreadOne t2 = new MyThreadOne(2);
        MyThreadOne t3 = new MyThreadOne(3);
        MyThreadOne t4 = new MyThreadOne(4);
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
