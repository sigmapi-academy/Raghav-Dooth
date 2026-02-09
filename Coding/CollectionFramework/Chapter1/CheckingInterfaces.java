package Chapter1;


/**
 * Write a description of class Che here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.Serializable;
import java.util.*;

public class CheckingInterfaces {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        LinkedList l2 = new LinkedList();
        Vector v = new Vector();
        System.out.print("\f");
        System.out.println(l1 instanceof Serializable);
        System.out.println(l2 instanceof Serializable);
        System.out.println(l1 instanceof Cloneable);
        System.out.println(l2 instanceof Cloneable);
        System.out.println(l1 instanceof RandomAccess);
        System.out.println(l2 instanceof RandomAccess); //false
        System.out.print("\n" + (v instanceof Serializable));
        System.out.print("\n" + (v instanceof Cloneable));
        System.out.print("\n" + (v instanceof RandomAccess));
    }
}