
package ArraysProgram;
import java.util.*;
public class one {

    public static void main(String[] args) {
        int A[] = {10, 2, 13, 41, 15, 66, 17, -8};
        System.out.println("Array before sorting: " + Arrays.toString(A));
        Arrays.sort(A);
        System.out.println("Array after sorting: " + Arrays.toString(A));
    }
}
