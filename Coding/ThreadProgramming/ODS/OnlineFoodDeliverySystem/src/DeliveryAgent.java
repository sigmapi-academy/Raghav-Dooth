import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class DeliveryAgent implements Runnable{
    private BlockingQueue<Order> readyQueue;
    private String agentName;

    public DeliveryAgent(String agentName, BlockingQueue<Order> readyQueue){
        this.agentName = agentName;
        this.readyQueue = readyQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Order order = readyQueue.take();
                System.out.println(agentName + " picked up order id: " + order.getOrderId());
                order.setStatus("Out for Delivery");

                Thread.sleep(2000);

                order.setStatus("Delivered");
                System.out.println(agentName + " delivered: " + order);
            } catch (InterruptedException e) {
                System.out.println(agentName + " stopped.");
            }
        }
    }
}
