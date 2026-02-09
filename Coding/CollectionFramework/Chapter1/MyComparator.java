package Chapter1;

import java.util.Comparator;

public class MyComparator implements Comparator{
    @Override
    public int compare(Object ob1, Object ob2){
        Integer i1 = (Integer)ob1;
        Integer i2 = (Integer)ob2;
        return (i1 < i2)?1:(i1 > i2)? -1: 0;
    }
}
