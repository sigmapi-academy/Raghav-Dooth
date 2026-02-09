package UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ReversingListDemo {
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
        System.out.println("List before reversing: "+ al);
        Collections.reverse(al);
        System.out.println("List after reverse: " + al);

        Collections.sort(al);
        System.out.println("Default natural sorting order: " + al);
        Collections.reverse(al);
        System.out.println("Descending order: " + al);
    }
}
