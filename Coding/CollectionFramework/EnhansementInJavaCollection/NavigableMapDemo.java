package EnhansementInJavaCollection;

import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> t = new TreeMap<String, String>();
        t.put("C", "Cat");
        t.put("D", "Dog");
        t.put("B", "Boy");
        t.put("A", "Apple");
        t.put("G", "Gun");
        t.put("F", "Fish");
        t.put("E", "Elephant");

        System.out.println(t);
        System.out.println(t.ceilingKey("C")); //C
        System.out.println(t.higherKey("C")); //D
        System.out.println(t.floorKey("E")); //E
        System.out.println(t.lowerKey("E")); //D
        System.out.println(t.pollFirstEntry()); //A=Apple
        System.out.println(t.pollLastEntry()); //G=Gun
        System.out.println(t.descendingMap());//{F=Fish, E=Elephant, D=Dog, C=Cat, B=Boy}
        System.out.println(t); //{B=Boy, C=Cat, D=Dog, E=Elephant, F= Fish}
    }
}
