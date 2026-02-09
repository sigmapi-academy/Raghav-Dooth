package Chapter2;

import java.util.*;


public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for(int i = 0; i <= 10; i++) {
            al.add(i);
        }
        System.out.println("ArrayList: " + al);
        Iterator iter = al.iterator();
        while (iter.hasNext()) {
            Integer i = (Integer)iter.next();
            if(i % 2 == 0) {
                System.out.println(i);
            }
            else {
                iter.remove();
            }
        }
        System.out.println("Even arraylist: " + al);
    }
}
