import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class OnlineFoodDeliverySystem{
    public static void main(String[] args){
        BlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();
        BlockingQueue<Order> readyQueue = new LinkedBlockingQueue<>();

        Thread resturant1 = new Thread(new Restaurant("Resturant-1", orderQueue, readyQueue));
        Thread resturant2 = new Thread(new Restaurant("Resturant-2", orderQueue, readyQueue));
        
        Thread agent1 = new Thread(new DeliveryAgent("DeliveryAgent-1", readyQueue));
        Thread agent2 = new Thread(new DeliveryAgent("DeliveryAgent-2", readyQueue));

        resturant1.start();
        resturant2.start();
        agent1.start();
        agent2.start();

        for (int i = 1; i <= 5; i++) {
            Thread customer = new Thread(new Customer(orderQueue,"Customer-"+i));
            customer.start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            
            }
        }
    }
}
