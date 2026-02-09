package UtilityClasses;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionsSortDemo {
    public static void main(String[] args) {
        ArrayList<Character> al = new ArrayList<Character>();

        String alpha = "";
        for(char i = 'A'; i <= 'Z'; alpha+=i,i++);
        Random r = new Random();

        for(int i = 0; i < 10 + r.nextInt(10); i++){
            al.add(alpha.charAt(r.nextInt(26)));
        }

        al.add(100);
        System.out.println("Before sorting: " + al);
        Collections.sort(al);
        System.out.println("After sorting: " + al);
    }
}
