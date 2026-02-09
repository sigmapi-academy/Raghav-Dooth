package Chapter2;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkList = new LinkedList();
        linkList.add("Raghav");
        linkList.add(20);
        linkList.add(null);
        linkList.add("Shiv");
        System.out.println(linkList);
        linkList.set(0,"Raghav Dhoot");
        System.out.println(linkList);
        linkList.addFirst(3.1412);
        linkList.addLast("Amitabh Bacchan");
        linkList.addLast("SRK");
        System.out.println(linkList);
        System.out.println(linkList.remove());
        System.out.println(linkList.removeFirst());
        System.out.println(linkList.removeLast());
        System.out.println(linkList);
    }
}
