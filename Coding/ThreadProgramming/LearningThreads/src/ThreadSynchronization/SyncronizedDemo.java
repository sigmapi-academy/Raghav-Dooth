package ThreadSynchronization;

public class SyncronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        // ThreadSync ts1 = new ThreadSync(d, "Rohit");
        // ThreadSync ts2 = new ThreadSync(d, "Virat");
        // ThreadSync ts3 = new ThreadSync(d, "Surya");
        // ThreadSync ts4 = new ThreadSync(d, "Samsun");
        // ts1.start();
        // ts2.start();
        // ts3.start();
        // ts4.start();

        Display d2 = new Display();
        ThreadSync ts1 = new ThreadSync(d, "Rohit");
        ThreadSync ts5 = new ThreadSync(d2, "Raghav");
        ts1.start();
        ts5.start();
    }
}
