package SortingData;

import java.util.Arrays;

public class Merge_Sort {
    //Generic Merge Sort
    public static <T extends Comparable<T>>
     void mergesort(T arr[], int low, int high){
        if(low >= high) return;
        int mid = (low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static <T extends Comparable<T>>
     void merge(T arr[], int low, int mid, int high){
        int n1 = mid-low+1, n2 = high-mid;
        int l = 0, h = 0, k = low;
        T arr1[] = Arrays.copyOfRange(arr, low, mid + 1);
        T arr2[] = Arrays.copyOfRange(arr, mid + 1, high+1);

        while(l<n1 && h<n2){
            if(arr1[l].compareTo(arr2[h]) <= 0 )
                arr[k++] = arr1[l++];
            else
                arr[k++] = arr2[h++];
        }
        while(l<n1) arr[k++] = arr1[l++];
        while(h<n2) arr[k++] = arr2[h++];
    }

    public static<T> void display(T arr[], String msg){
        System.out.println("\n"+ msg);
        for(T x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer numbers[] = {54, 12, 80, 34, 67};
        String names[] = {"Raghav", "Rishav","Aadit", "Aarav", "Vidit"};
        display(numbers, "Before sorting:");
        mergesort(numbers, 0, numbers.length - 1);
        display(numbers, "After sorting:");

        display(names, "Before Sorting: ");
        mergesort(names, 0, names.length - 1);
        display(names, "After sorting: ");
    }
}