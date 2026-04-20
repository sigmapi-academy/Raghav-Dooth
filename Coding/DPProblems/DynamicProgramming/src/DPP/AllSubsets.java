package DPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n[] = new int[sc.nextInt()];
        int i;
        for(i = 0; i < n.length; i++){
            System.out.println("Enter ["+i+"]: ");
            n[i] = sc.nextInt();
        }
        List<List<Integer>> r = new ArrayList<>();
        subsets(n, 0, new ArrayList<>(),r);
        System.out.println("Result: " + r);
    }

    private static void subsets(int[] n, int i, List<Integer> current, List<List<Integer>> r) {
        r.add(new ArrayList<>(current));

        for (int j = i; j < n.length; j++) {
            current.add(n[j]);
            //Recursion
            subsets(n, j+1, current, r);
            current.remove(current.size() - 1);
        }
    }
}
