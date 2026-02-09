import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Key, String> h = new Hashtable<Key, String>(25);
        h.put(new Key(5), "A");
        h.put(new Key(2), "B");
        h.put(new Key(6), "C");
        h.put(new Key(15), "D");
        h.put(new Key(17), "E");
        h.put(new Key(23),  "F");
        h.put(new Key(15), "G");
        h.put(new Key(17), "H");
        // h.put(new Key(19), null);
        System.out.println(h);

        Key k = new Key(15);
        System.out.println("Value of "+k+" is: "+h.get(k));
    }
}
