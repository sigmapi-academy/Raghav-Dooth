package MaximumAndMinimum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestFruit {
    public static void main(String[] args) {
        Apple a1 = new Apple(1);
        Apple a2 = new Apple(2);
        Apple a3 = new Apple(3);

        Orange o1 = new Orange(4);
        Orange o2 = new Orange(5);

        List<Apple> apples = Arrays.asList(a1, a2, a3);
        List<Orange> oranges = Arrays.asList(o1, o2);
        List<Fruit> mixed = List.of(a1,a2, o1);

        System.out.println("Maximum in mixed fruit: "+Collections.max(mixed).size);
        System.out.println("Maximum in apples: " + Collections.max(apples).size);
        System.out.println("Maximum in oranges: " + Collections.max(oranges).size);
    }
}
