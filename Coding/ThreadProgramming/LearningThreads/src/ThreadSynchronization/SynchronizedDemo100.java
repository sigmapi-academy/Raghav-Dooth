package ThreadSynchronization;

public class SynchronizedDemo100 {
    public static void main(String[] args) {
        DisplayWish dw = new DisplayWish();
        Thread100 t1 = new Thread100(dw, "Arvind Kejriwal");
        Thread100 t2 = new Thread100(dw, "Mamta Banerjee");
        Thread100 t3 = new Thread100(dw, "Yogi Aditya Nath");
        t1.start();
        t2.start();
        t3.start();
    }

}
