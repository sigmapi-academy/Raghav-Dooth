package Chapter2;
import java.util.*;
public class LitIteratorDemo {
    public static void main(String[] args) {
        LinkedList liList = new LinkedList();
        liList.add("BalaKrishna");
        liList.add("Rama");
        liList.add("Ravichandran");
        liList.add("LakshmiNarayan");
        liList.add("Bharat");
        System.out.println(liList);

        ListIterator liter = liList.listIterator();
        while (liter.hasNext()) {
            String str = (String)liter.next();
            if(str.equals("Rama")){
                liter.remove();
            }
            else if(str.equals("Bharat")){
                liter.add("Lakshman");
            }
            else if(str.equals("Ravichandran")){
                liter.set("RC");
            }
        }

        System.out.println("List: " + liList);

        while(liter.hasPrevious()){
            String str = (String)liter.previous();
            System.out.println(str);
        }
    }
}
