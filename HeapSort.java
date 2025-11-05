package Sorting;

class HeapSort{
    int parent (int i){
        return (i - 1) / 2;
    }
    int leftChild (int i){
        return (2*i+1);
    }
    int rightChild (int i){
        return (2*i+2);
    }

     void HeapSort(int [] arr){
        int n = arr.length;

        for(int i = n / 2 - 1; i>=0; i--){
            Heapify(arr, n, i);
        }

        //extracting element one by one
        for(int i = n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            Heapify(arr, i, 0);
        }
    }

    void Heapify(int [] arr, int n, int i){
        int largest = i;
        int leftC = leftChild(i);
        int rightC = rightChild(i);

        if(leftC < n && arr[leftC] > arr[largest]){
            largest = leftC;
        }
        if(rightC < n && arr[rightC] > arr[largest]){
            largest = rightC;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            Heapify(arr, n, largest);
        }
    }

    static void displayArray(int [] arr){
        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int [] arr = {32, 543, 42, 786, 24, 67};

        System.out.println("Original array: ");
        displayArray(arr);

        HeapSort obj = new HeapSort();
        obj.HeapSort(arr);

        System.out.println("\nAfter sorting: ");
        displayArray(arr);
    }
}