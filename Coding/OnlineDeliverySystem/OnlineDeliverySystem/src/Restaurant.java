import java.util.Queue;
public class Restaurant implements Runnable{
    private String restName;
    private Queue<Order> orderQueue;
    private Queue<Order> readyQueue;
    public Restaurant(String restName, Queue<Order> q1, Queue<Order> q2){
        this.restName = restName;
        orderQueue = q1;
        readyQueue = q2;
    }
    @Override
    public void run(){
        Order order = null;
        for(int i = 1;i<=3;i++){
            synchronized(orderQueue){
                while(orderQueue.isEmpty()){
                    try {
                        orderQueue.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }   
                }     
                order = orderQueue.poll();
                order.setStatus(Order.OrderStatus.PREPARING);
                System.out.println(restName + " is preparing order: " + order.getOrderId());
            }
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized(readyQueue){
                order.setStatus(Order.OrderStatus.READY);
                readyQueue.add(order);
                System.out.println(restName + " order ready: " + order.getOrderId());
                readyQueue.notify();
            }
        }
    }
}
