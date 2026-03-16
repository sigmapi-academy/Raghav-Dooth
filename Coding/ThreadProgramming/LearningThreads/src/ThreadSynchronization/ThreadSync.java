package ThreadSynchronization;

public class ThreadSync extends Thread{
    private Display d;
    private String name;
    public ThreadSync(Display d, String name){
        this.d = d;
        this.name = name;
    }
    @Override
    public void run() {
        d.wish(name);
    }
}
