import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Customer implements Runnable {
    private BlockingQueue<Order> orderQueue;
    private String customerName;
    private String[] menu = {"Pizza", "Burger", "Pasta", "Biryani", "Sandwich"};
    private Random random = new Random();

    public Customer(BlockingQueue<Order> orderQueue, String customerName) {
        this.orderQueue = orderQueue;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        String food = menu[random.nextInt(menu.length)];
        Order order = new Order(customerName, food);
        System.out.println(customerName + " placed: "+ order);
        try {
            orderQueue.put(order);
        } catch (InterruptedException e) {
            System.out.println(customerName+"Interrupted");
        }
    }
    
}
