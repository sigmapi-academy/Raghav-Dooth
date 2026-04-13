import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private static final AtomicInteger counter = new AtomicInteger(1);

    private int orderId;
    private String customerName;
    private String foodItem;
    private String status;
    
    public Order( String customerName, String foodItem) {
        this.orderId = counter.getAndIncrement();
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.status = "Placed";
    }

    public static AtomicInteger getCounter() {
        return counter;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", customerName=" + customerName + ", foodItem=" + foodItem + ", status="
                + status + "]";
    } 
}
