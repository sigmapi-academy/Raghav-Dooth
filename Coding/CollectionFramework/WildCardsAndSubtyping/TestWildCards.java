package WildCardsAndSubtyping;
import java.util.*;
import java.util.stream.*;
import java.io.*;
/**
 * Write a description of class TestWildCards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestWildCards
{
    public static void main(String[] args){
        List<Object> objs = Stream.of(2, 3.14, "four").collect(Collectors.toList());
        List<Integer> ints = List.of(5, 6);
        //Collections.copy(objs, ints);
        //Collections.<Object>copy(objs, ints);
        //Collections.<Number>copy(objs, ints);
        Collections.<Integer>copy(objs, ints);
        System.out.print("\fobjs = " + objs);
        System.out.print("\nSum = " + sum(ints));
        
        List<Double> doubles = List.of(2.5, 3.5);
        System.out.print("\nSum = " + sum(doubles));
        List<Number> nums = List.of(1, 2, 2.5,3.5);
        System.out.print("\nSum = " + sum(nums));
        
        List<Integer> ints1 = new ArrayList<>();
        add(ints1, 5);
        System.out.print("\nints1 = " + ints1);
        
        List<Number> nums1 = new ArrayList<>();
        add(nums1, 5);
        nums1.add(5.0);
        System.out.print("\nnums1 = " + nums1);
        
        List<Object> objs1 = new ArrayList<>();
        add(objs1, 5);
        objs1.add("Five");
        System.out.print("\nobjs1 = " + objs1);
    }
    
    public static double sum(Collection<? extends Number> nums){
        /*
        double s = 0.0;
        for(Number num : nums){
            s += num.doubleValue();
        }
        return s;
        */
        return nums.stream().mapToDouble(Number::doubleValue).sum();
    }
    
    public static void add(Collection<? super Integer> ints, int n){
        for(int i = 0; i < n; i++){
            ints.add(i);
        }
    }
}