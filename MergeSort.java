package Sorting;

public class MergeSort {
    static void merge(int []a, int l, int m, int r) {

        //creating a temporary subarray
        int[] temp = new int[r - l + 1];

        //pointers for the two subarrays and the temp array
        int i = l;
        int j = m + 1;
        int k = 0;

        //merging the two sorted subarray into temporary array
        while (i <= m && j <= r) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }

        //copying remaining elements from the first subarray
        while (i <= m) {
            temp[k++] = a[i++];

            /* We can also write-
             * while (i <= m){
             * temp[k] = a[i];
             * i++;
             * k++
             * } */
        }

        //copying remaining elements from the second subarray
        while (j <= r) {
            temp[k++] = a[j++];

            /* We can also write-
             * while (j <= r){
             * temp[k] = a[j];
             * j++;
             * k++
             * } */
        }

        //copying both the subarrays into a single (original) array
        for (i = l; i <= r; i++) {
            a[i] = temp[i - l];
        }
    }

    //method to sort the array recursively
    static void mergeSort(int []a, int l, int r){
        if(l < r){
            int mid = l + (r -l) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid+1, r);
            merge(a, l, mid, r);
        }
    }

    //printing the whole array using a helper method
    static void printArray(int []arr){
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }


    //main method
    public static void main(String[] args) {
        int []arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        printArray(arr);

    }
}
