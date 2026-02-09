package UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class CollectionsReverseOderUsingComparator {
    public static void main(String[] args) {
        
        ArrayList<Character> al = new ArrayList<>();
        String bigAlpha="";
        for (char i = 'A'; i <= 'Z'; i++) {
            bigAlpha +=i;
        }
        Random r = new Random();
        for (int i = 0; i < 10 + r.nextInt(20); i++) {
            al.add(bigAlpha.charAt(r.nextInt(26)));
        }  
        System.out.println("List before sorting: "+al);
        Collections.sort(al, new MyComparator());
        System.out.println("List in descending order: "+al);

        Comparator c = Collections.reverseOrder( new MyComparator());
        Collections.sort(al, c);
        System.out.println("List in ascending order: "+al);
    }
}
