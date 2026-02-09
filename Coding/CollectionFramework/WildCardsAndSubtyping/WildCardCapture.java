package WildCardsAndSubtyping;
import java.util.*;


/**
 * Write a description of class WildCardCapture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WildCardCapture
{
    //2nd method 
    private static<T> void rev(List<T> list){
        List<T> tmp = new ArrayList<>(list);
        for(int i = 0; i < list.size(); i++){
            list.set(i, tmp.get(list.size() - i - 1));
        }
    }
    
    public static void reverse(List<?> list){
        rev(list);
        
        //List<?> list1 = new ArrayList<?>();
        
        //Map<String, ? extends Number> map = new HashMap<String, ? extends Number>();
        
        
        
    }
    
    public static void restrictWC(){
        List<Number> nums = new ArrayList<Number>();
        List<? super Number> sink = nums;
        List<? extends Number> source = nums;
        for(int i = 0; i < 4; i++) sink.add(i);
        int sum = nums.stream().mapToInt(Number::intValue).sum();
        System.out.print("\nSum = " + sum);
    }
    
    public static void restrictWC1(){
        List<List<?>> lists = new ArrayList<List<?>>();
        lists.add(List.of(1,2,3));
        lists.add(List.of("four", "five"));
        System.out.print("\n"+ lists);
    }
}