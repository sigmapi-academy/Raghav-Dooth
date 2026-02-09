import java.util.TreeMap;

public class TreeMapComparatorDemo {
    public static void main(String[] args) {
        TreeMap t = new TreeMap<>(new MyCompartor());
        t.put("Aditya", "Anchit");
        t.put("Aman", "Naman");
        t.put("Bhavvya", "Riddhi");
        t.put(125, "Surya");
        t.put("Shiv", "Students");
        System.out.println(t);
    }
}
