package ComparableComparator;
import java.util.TreeSet;


/**
 * Write a description of class StudentOfSymbiosis here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentOfSymbiosis
{
    public static void main(String args[]){
        Student st1 = new Student(100, "Atrijo");
        Student st2 = new Student(10, "Aadit");
        Student st3 = new Student(50, "Sanjit");
        Student st4 = new Student(125, "Danny");
        Student st5 = new Student(111, "Raghav");
        
        TreeSet t = new TreeSet();
        t.add(st1);
        t.add(st2);
        t.add(st3);
        t.add(st4);
        t.add(st5);
        
        System.out.print("\f" + t);
        
        TreeSet t1 = new TreeSet(new MyComparator());
        t1.add(st1);
        t1.add(st2);
        t1.add(st3);
        t1.add(st4);
        t1.add(st5);
        
        System.out.print("\nNot using DNSO of comparable:");
        System.out.print("\n" + t1);
    }
}