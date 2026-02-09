package UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionSearchDemoUsingComparator {
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
        System.out.println("List before sorting: " + al);
        MyComparator c = new MyComparator();
        Collections.sort(al, c);

        System.out.println("List after sorting: " + al );
        int in = Collections.binarySearch(al, 'D', c);
        if(in > -1){
            System.out.println("Element is found at index: "+in);
        }
        else{
            System.out.println("Element insertion point is: "+in);
        }
        in = Collections.binarySearch(al, 'Q', c);
        if(in > -1){
            System.out.println("Element is found at index: "+in);
        }
        else{
            System.out.println("Element insertion point is: "+in);
        }
        in = Collections.binarySearch(al, 'T', c);
        if(in > -1){
            System.out.println("Element is found at index: "+in);
        }
        else{
            System.out.println("Element insertion point is: "+in);
        }
    }
}
