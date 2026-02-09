package WildCardsAndSubtyping;
import java.util.*;

/**
 * Write a description of class Lists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lists
{
    public static <T> List<T> factory(){
        return new ArrayList<T>();
    }
}