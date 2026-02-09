import java.util.Comparator;

public class Mycomparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return o2.toString().compareTo(o2.toString());
    }
}
