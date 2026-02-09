package MaximumAndMinimum;

import java.util.Collection;
import java.util.Iterator;

public class MaximumOfCollection {
    public static <T extends Comparable<T>> T max(Collection<T> coll){
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();
        while(i.hasNext()){
            T next = i.next();
            if(next.compareTo(candidate) > 0){
                candidate = next;
            }
        }
        return candidate;
    }
}
