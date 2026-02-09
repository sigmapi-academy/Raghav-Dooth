package WildCardsAndSubtyping;
import java.util.*;

/**
 * Write a description of class TestLists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestLists
{
    public static void main(String[] args){
        List<?> list = Lists.factory();
        List<?> list1 = Lists.<Object>factory();
        
        //List<?> list2 = Lists.<?>factory();
        List<List<?>> list2 = Lists.<List<?>>factory(); //OK
    }
}