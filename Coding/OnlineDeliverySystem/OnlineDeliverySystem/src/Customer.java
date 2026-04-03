import java.util.Queue;

public class Customer implements Runnable {
    private String restName;
    private String custName;
    private Queue<Order> orderQueue;
    public Customer(String custName, String restName, Queue<Order> queue){
        this.custName = custName;
        this.restName = restName;
        orderQueue = queue;
    }
    @Override
    public void run(){
        for(int i = 1;i<=3;i++){
            Order order = new Order("ORD_"+custName+"_"+i, custName, restName);
            synchronized(orderQueue){
                orderQueue.add(order);
                System.out.println(custName + " placed order: " + order.getOrderId() + " at " + restName);
                orderQueue.notify();
            }
            try {
                Thread.sleep(2000);    
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
    }
}