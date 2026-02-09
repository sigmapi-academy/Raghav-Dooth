import java.util.PriorityQueue;

public class PriorityQueueComparatorDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>(15, new MyCompartor());

        pq.add("Atrijo");
        pq.add("Raghav");
        pq.add("Arjun");
        pq.add("Hitansh");
        pq.add("Aadya");
        pq.add("Kanav");

        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
