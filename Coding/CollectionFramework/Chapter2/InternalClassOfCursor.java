package Chapter2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class InternalClassOfCursor {
    public static void main(String[] args) {
        Vector v = new Vector();
        Enumeration e = v.elements();
        Iterator itr = v.listIterator();
        ListIterator litr = v.listIterator();

        System.out.println("\f"+e.getClass().getName());
        System.out.println("\n"+itr.getClass().getName());
        System.out.println("\n"+litr.getClass().getName());
    }
}
