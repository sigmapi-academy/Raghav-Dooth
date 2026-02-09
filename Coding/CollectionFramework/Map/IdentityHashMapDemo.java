import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        // HashMap m = new HashMap<>();
        IdentityHashMap m = new IdentityHashMap<>();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        System.out.println(m.put(i1, "James")); //null
        System.out.println(m.put(i2, "Gosling"));//null

        System.out.println(m);     //{10=James, 10=Gosling}

    }
}
