import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap m = new TreeMap();

        m.put(100, "Aman");
        m.put(87, "Naman");
        m.put(112, "Aditya");
        m.put(95, "Raghav");
        m.put(200, "Naveen");
        m.put(98, null);
        // m.put(null, null);

        System.out.println(m);
        
        m.put("Varun", "Anuj");
        
        System.out.println(m);
    }
}
