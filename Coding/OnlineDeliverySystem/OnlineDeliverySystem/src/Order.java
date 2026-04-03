public class Order {
    private String orderId, custName, restName;
    public enum OrderStatus{ 
        PLACED, PREPARING, READY, DELIVERED
    }
    private OrderStatus status;
    Order(String orderId, String custName, String restName){
        this.orderId = orderId;
        this.custName = custName;
        this.restName = restName;
        status = OrderStatus.PLACED;
    }
    public String getCustName() {
        return custName;
    }
    public String getOrderId() {
        return orderId;
    }
    public String getRestName() {
        return restName;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return "Order : "+orderId+"| Customer Name : "+custName+"| Restaurant Name : "+restName+"| Order Status : "+status;
    }
}