package InterviewQuestions;

import java.util.*;

public class BlockSwap {
    public static void main(String[] args) {
        int[] A, B, C, D;
        int n, k, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        A = new int[n];
        Random r = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(10, 100);
        }
        System.out.println("\nEnter the value of 'k' : ");
        k = sc.nextInt();
        System.out.println("\nArray A[] before swapping: "+Arrays.toString(A));
        B = Arrays.copyOf(A, k);
        C = Arrays.copyOfRange(A, k, n);
        D = new int[n];
        for (int i = 0; i < C.length; i++, j++) {
            D[j] = C[i];
        }
        for(int i = 0; i < k; i++, j++) {
            D[j] = B[i];
        }

        System.out.println("\nBlock-1: " + Arrays.toString(B));
        System.out.println("\nBlock-2: " + Arrays.toString(C));
        System.out.println("After swapping Block-1 with block-2: "+Arrays.toString(D));
    }
}
