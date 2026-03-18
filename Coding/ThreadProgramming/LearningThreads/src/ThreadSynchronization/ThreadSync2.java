package ThreadSynchronization;

public class ThreadSync2 extends Thread {
    private MyNumber n;
    public ThreadSync2(MyNumber n){
        this.n = n;
    }

    @Override
    public void run() {
        try {
            n.displayCharacters();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
