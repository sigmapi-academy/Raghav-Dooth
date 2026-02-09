package Chapter1;

import java.util.TreeSet;

public class TreeSetDemoUsingStringBuffer {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();

        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("a"));
        t.add(new StringBuffer("C"));
        t.add("f");
        System.out.println(t);
    }
}
