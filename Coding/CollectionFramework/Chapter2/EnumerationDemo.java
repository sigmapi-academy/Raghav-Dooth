package Chapter2;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        for(int i = 0; i <=10; i++) {
            v.addElement(i);
        }
        System.out.println(v);

        System.out.println("Let's enumerate:");
        for(Enumeration<Integer> e = v.elements(); e.hasMoreElements();){
            Integer value = (Integer)e.nextElement();
            System.out.println(value);
        }
    }
}
