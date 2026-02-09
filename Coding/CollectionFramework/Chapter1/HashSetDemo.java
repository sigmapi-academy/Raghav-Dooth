package Chapter1;
import java.util.*;


/**
 * Write a description of class HashSetDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HashSetDemo
{
    public static void main(String args[]){
        LinkedHashSet h = new LinkedHashSet();
        System.out.print("\fHashSet capacity: " + h.size());
        h.add("H");
        h.add("A");
        h.add("S");
        h.add("H");
        h.add("null");
        System.out.print("\n"+h.add("S"));
        h.add("E");
        h.add("T");
        h.add(10);
        h.add(3.14);
        System.out.print("\n" + h);
    }
}