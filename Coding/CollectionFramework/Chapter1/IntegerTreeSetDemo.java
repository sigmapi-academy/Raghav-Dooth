package Chapter1;

import java.util.TreeSet;

public class IntegerTreeSetDemo {
    public static void main(String[] args) {
        MyComparator c = new MyComparator();
        TreeSet t = new TreeSet<>(c);

        t.add(10);
        t.add(-1);
        t.add(15);
        t.add(17);
        t.add(1);
        t.add(5);
        t.add(25);

        System.out.println(t);
    }
}
