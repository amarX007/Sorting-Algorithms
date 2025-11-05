package Sorting;

import java.util.Arrays;

public class MergeSort_UsingTwoArray {
    public static int[] merge(int [] arr1, int [] arr2){
        int m = arr1.length; //will check first array's elements
        int n = arr2.length; //will check second array's elements
        int [] a3 = new int[m+n];  //the final array which will store the combine value of arr1 & arr2

        /*
        lets take-
        * i will track arr1
        * j will track arr2
        * k will track a3(where to implement values)
        */
        int i=0, j=0, k =0; //initialize all values from 0th index (start position)

        //loop until the full array is traversed
        while(i< m && j < n) {
            if (arr1[i] <= arr2[j]) { //check if element of arr1 is small or equal to arr2
                if (k > 0 && a3[k - 1] == arr1[i]) { //avoid duplicates
                    i++; //skip duplicate elements from arr1
                } else {
                    a3[k] = arr1[i]; //store the value in a3
                    i++; //move next in arr1
                    k++; //move next in a3
                }
            } else { //if current element of arr2 is smaller
                if (k > 0 && a3[k - 1] == arr2[j]) { //avoid duplicates
                    j++; //skip duplicate elements from arr2
                } else {
                    a3[k] = arr2[j]; //store value in a3
                    j++; //move next
                    k++; //move next
                }
            }
        }
        //lets handle remaining elements from arr1 (if any left)
        while(i<m){
            if(k > 0 && a3[k-1] == arr1[i]){ //skip duplicates
                i++;
            }else {
                a3[k] = arr1[i]; //add remaining elements
                i++;
                k++;
            }
        }

        //lets handle remaining elements from arr2 (if any left)
        while(j<n){
            if(k > 0 && a3[k-1] ==arr2[j]){ //skip duplicates
                j++;
            }else{
                a3[k] = arr2[j]; //add remaining elements
                j++;
                k++;
            }
        }

        //creating result array because a3 can have some unuse spaces
        int [] res = new int[k];

        //copying merged elements in result
        for(int x=0; x<k; x++){
            res[x] = a3[x];
        }
        return res; //returning values
    }


    public static void main(String[] args) {
        int [] arr1 = {-5, 1, 2, 4, 9}; //first array element
        int [] arr2 = {1, 5, 3, 7, 9, 14, 10, 21}; //second array element


        //'Arrays.sort()' will sort above arrays is they are not sorted form beginning
        Arrays.sort(arr1);
        Arrays.sort(arr2);


        int [] result = merge(arr1, arr2); //calling merge method

        //printing sorted array
        System.out.println("Sorted array is: ");
        for (int x : result){
            System.out.printf(x +" ");
        }
    }
}
