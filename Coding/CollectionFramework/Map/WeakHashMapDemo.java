import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        // HashMap m = new HashMap<>();
        WeakHashMap m = new WeakHashMap<>();
        Temp t = new Temp();
        m.put(t, "Raghav");
        t = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(m);
    }
}
