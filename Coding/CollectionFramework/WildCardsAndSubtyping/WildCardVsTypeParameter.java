package WildCardsAndSubtyping;
import java.util.*;


/**
 * Write a description of class WildCardVsTypeParameter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WildCardVsTypeParameter
{
    public static void main(String args[]){
        Object obj = 1;
        List<Object> objs = List.of(1, 3);
        List<Integer> ints = List.of(1, 2, 3, 4);
        System.out.print("\f" + objs.contains(obj));
        System.out.print("\n" + objs.contains(ints));//false
        System.out.print("\n" + ints.contains(obj));//true
        System.out.print("\n" + ints.containsAll(objs));//true
        System.out.print("\n" + objs.containsAll(ints));//false
    }
}