import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("\n\n");
        
        Queue<Order> orderQueue = new LinkedList<>();
        Queue<Order> readyQueue = new LinkedList<>();

        Customer c1 = new Customer("Rajiv", "Chineese chef & co", orderQueue);
        Customer c2 = new Customer("Jayant", "Magnolia bakary", orderQueue);
        Customer c3 = new Customer("Gautam", "Chineese chef & co", orderQueue);
        Restaurant r1 = new Restaurant("Chineese chef & co", orderQueue, readyQueue);
        Restaurant r2 = new Restaurant("Magnolia bakary", orderQueue, readyQueue);
        Delivery d1 = new Delivery("Driver mohan", readyQueue);
        Delivery d2 = new Delivery("Driver singh", readyQueue);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(r1);
        Thread t5 = new Thread(r2);
        Thread t6 = new Thread(d1);
        Thread t7 = new Thread(d2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();

        System.out.println("All orders delivered!");
    }    
}
