package Chapter1;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();
        t.add("A");
        t.add("a");
        t.add("L");
        t.add("Z");
        t.add("B");
        t.add("C");

        System.out.println(t);
    }
}
