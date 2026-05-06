package DPP;

import java.util.Random;

public class HeapSort {
    public static void heapify(int a[], int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && a[left] > a[largest]){
            largest = left;
        }

        if(right < n && a[right] > a[largest]){
            largest = right;
        }

        if(largest != i){
            int t = a[i];
            a[i] = a[largest];
            a[largest] = t;
            heapify(a, n, largest);
        }

        
    }

    public void sort(int a[]){
        int n = a.length;
        //step 1: Builds a Max heap
        for(int i = n/2 - 1; i > -1; i--){
            heapify(a, n, i);
        }

        //step 2:Repeatedly extracts the maximum element
        for(int i = n - 1; i > 0; i--){
            int t = a[0];
            a[0] = a[i];
            a[i] = t;

            heapify(a, i, 0);
        }

    }
    public void display(int a[], String msg){
        System.out.println("\n" + msg);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[r.nextInt(10, 21)];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1, 100);
        }

        HeapSort ob = new HeapSort();
        ob.display(a, "Array before sorting:");
        ob.sort(a);
        ob.display(a, "Array after sorting:");
    }
}
