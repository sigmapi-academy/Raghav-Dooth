package ThreadState;

public class MyThreadOne extends Thread{
    private int whichChild;
    public MyThreadOne(int x){
        whichChild = x;
    }
    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println("Child Thread: " + whichChild + " i = " + j);
            Thread.yield();
        }
    }
}
