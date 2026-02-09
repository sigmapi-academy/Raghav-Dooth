package WildCardsAndSubtyping;
import java.util.*;

/**
 * Write a description of class TestWildCardArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestWildCardArray
{
    public static void main(String[] args){
        //Integer[] x = {0};
        //Number[] nums = x;
        //nums[0] = 6.28;
        
        List<Integer> ints = Arrays.asList(0);
        List<? extends Number> num = ints;
        //num.set(0, 3.14);
    }
}