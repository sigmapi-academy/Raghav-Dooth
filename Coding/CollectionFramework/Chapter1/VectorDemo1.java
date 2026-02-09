package Chapter1;
import java.util.Vector;


/**
 * Write a description of class VectorDemo1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VectorDemo1
{
    public static void main(String args[]){
        Vector v = new Vector();
        System.out.print("\f"+v.capacity()); //10
        for(int i = 1; i <= 10; i++){
            v.addElement(i);
        }
        System.out.print("\n"+v.capacity()); //10
        v.addElement("A");
        System.out.print("\n"+v.capacity()); //20
        System.out.print("\n" + v);
        System.out.print("\nRemoved element: " + v.remove(4));
        System.out.print("\n"+ v);
        v.setElementAt("Replaced", 9);
        System.out.print("\n"+ v);
    }
}