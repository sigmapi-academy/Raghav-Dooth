package ComparableComparator;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student implements Comparable
{
    private int roll;
    private String name;
    
    public Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    public int getRoll(){
        return this.roll;
    }
    
    public String getName(){
        return this.name;
    }
    @Override
    public int compareTo(Object o){
        
        Student st = (Student)o;
        if(this.roll < st.roll){
            return -1;
        }
        else if(this.roll > st.roll){
            return 1;
        }
        else{
            return 0;   
        }
    }
    
    @Override
    public String toString(){
        return "[roll = " + roll + ", name = " + name + "]";
    }
}