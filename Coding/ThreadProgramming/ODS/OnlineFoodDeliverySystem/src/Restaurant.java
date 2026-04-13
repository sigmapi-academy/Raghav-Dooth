import java.util.concurrent.BlockingQueue;

public class Restaurant implements Runnable {
    private BlockingQueue<Order> orderQueue;
    private BlockingQueue<Order> readyQueue;
    private String restaurantName;

    public Restaurant(String restaurantName, BlockingQueue<Order> orderQueue,
            BlockingQueue<Order> readyQueue) {
        this.restaurantName = restaurantName;
        this.orderQueue = orderQueue;
        this.readyQueue = readyQueue;
    }

    @Override
    public void run() {
        while (true) {
            Order order;
            try {
                order = orderQueue.take();

                System.out.println(restaurantName + " started preparing Order Id: " + order.getOrderId());
                order.setStatus("Preparing");

                Thread.sleep(3000);

                order.setStatus("Ready");
                System.out.println(restaurantName + " completed: " + order);
            } catch (InterruptedException e) {
                System.out.println(restaurantName + "stopped");
            }
        }
    }
}
