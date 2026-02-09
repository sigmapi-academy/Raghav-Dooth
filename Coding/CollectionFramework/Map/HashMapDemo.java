import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap<>();
        m.put("Chrinjeevi", "1000");
        m.put("Venketesh",800);
        m.put("Nagarjuna", 500);
        m.put("Ramesh Babu", 900);
        m.put("Rajanikant", 1500);

        System.out.println("\n" + m);

        Set s = m.keySet();
        System.out.println("keys: "+s);

        Collection c = m.values();
        System.out.println("Values: " + c);

        Set s1 = m.entrySet();
        System.out.println("Entery Set: " + s1 );

        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+"===>" + m1.getValue());
            String key = (String)m1.getKey();
            if(key.equals("Nagarjuna")){
                m1.setValue(10000);
            }
        }

        System.out.println(m);
    }
}
