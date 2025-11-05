//package Sorting;
package Sorting;

import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {

    //Sorting using extra functions



    /*public static void bubbleSort (int a[]){
        int n = a.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j< n-i-1; j++){
                if(a[j] > a[j+1]){
                    int swap = a[j];
                    a[j] = a[j+1];
                    a[j+1] = swap;
                }
            }
        }
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


    public static void main(String[] args) {
        int [] a ={ 4, 6, 8, 5, 3, 2, 1};

        System.out.print("Original array: ");
        printArray(a);

        bubbleSort(a);

        System.out.print("\nSorted array: ");
        printArray(a);
    }*/


    //Sorting in main method
    public static void main(String[] args) {

        int[] arr = {3, 6, -23, 5, 8, 798, 23};
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

/*import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;

class BubbleSort {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> resultList = new ArrayList<>();

        // Exact result of a / b
        float exact = a / b;

        // Rounded to three decimal places using BigDecimal
        BigDecimal bd = new BigDecimal(Float.toString(exact));
        bd = bd.setScale(3, RoundingMode.HALF_UP);
        float rounded = bd.floatValue();

        // Add both to the result list
        resultList.add(exact);
        resultList.add(rounded);

        return resultList;
    }

    public static void main(String[] args) {
        float a = 10.0f;
        float b = 3.0f;

        ArrayList<Float> result = divisionWithPrecision(a, b);

        // Print the results
        System.out.println("Exact result: " + result.get(0));
        System.out.format("Rounded result: %.3f\n", result.get(1));
    }
}*/

