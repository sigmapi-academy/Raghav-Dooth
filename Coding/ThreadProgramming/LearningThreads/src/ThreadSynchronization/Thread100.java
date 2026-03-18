package ThreadSynchronization;

public class Thread100 extends Thread{
    private DisplayWish dw;
    private String name, x;

    public Thread100(DisplayWish d, String name){
        this.dw = d;
        this.name = name;
    }

    public Thread100(String a, String b){
        name = a;
        x = b;
    }

    @Override
    public void run() {
        dw.wish(name);
    }

}
