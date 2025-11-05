package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void QuickSort(int [] a, int l, int h){
        if(l < h){
            int pIndex = partitionElement(a, l, h);
            QuickSort(a, l, pIndex - 1);
            QuickSort(a, pIndex + 1, h);
        }
    }
    public static int partitionElement(int [] a, int l, int h){
        int pivot = a[l];
        int i = l;
        int j = h;

        while(i<j){
            while(i < h && a[i] <= pivot){
                i++;
            }

            while(j > l && a[j] > pivot){
                j--;
            }

            if(i<j){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;

        return j;
    }
    public static void main(String [] args){
        int [] arr = {5,7,9,1,3,2,4};
        System.out.println("Before sorting: " + Arrays.toString(arr));

        QuickSort(arr, 0, arr.length - 1);

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
