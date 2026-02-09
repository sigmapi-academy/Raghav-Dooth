import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class PriorityQueueDemo{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        System.out.println(pq.peek()); //null
        //System.out.println(pq.element()); //NoSuchElementException

        for (int i = 0; i < 11; i++) {
            int x = new Random().nextInt(10, 100);
            System.out.println(x);
            pq.offer(x);
        }

        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println("Press y/n to poll elements from priority queue: ");
            String x = new Scanner(System.in).next().toLowerCase();
            if (x.charAt(0) == 'n'){
                break;
            }
            System.out.println(pq.poll());
        }
    }
}