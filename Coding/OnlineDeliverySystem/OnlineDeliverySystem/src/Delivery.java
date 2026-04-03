import java.util.Queue;

public class Delivery implements Runnable {
    private String driverName;
    Queue<Order> readyQueue;

    public Delivery(String driverName, Queue<Order> queue) {
        this.driverName = driverName;
        this.readyQueue = queue;
    }

    @Override
    public void run() {
        Order order = null;
        for (int i = 1; i <= 3; i++) {
            synchronized (readyQueue) {
                while (readyQueue.isEmpty()) {
                    try {
                        readyQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                order = readyQueue.poll();
            }

            try {
                System.out.println(driverName + " is delivering order: " + order.getOrderId());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (order) {
                order.setStatus(Order.OrderStatus.DELIVERED);
                System.out.println(driverName + " delivered order: " + order.getOrderId());
                order.notifyAll();
            }
        }
    }
}