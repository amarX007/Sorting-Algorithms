package Sorting;

public class MaxHeap_Own {
    int [] heap;
    int capacity;
    int size;

    MaxHeap_Own(int c){
        this.size = 0;
        this.capacity = c;
        heap = new int[c];
    }

    int Parent (int i){
        return (i-1)/2;
    }

    int LeftChild (int i){
        return (2*i+1);
    }

    int RightChild (int i){
        return (2*i+2);
    }

    //inserting in MaxHeap
    void MaxHeap(int element){
        if(size == capacity){
            System.out.println("Heap varti haii!");
            return;
        }

        heap[this.size] = element;
        int i = this.size;
        this.size++;

        //Moving element for maintaining heap property
        while(i != 0 && heap[Parent(i)] < heap[i]){
            int temp = heap[i];
            heap[i] = heap[Parent(i)];
            heap[Parent(i)] = temp;

            i = Parent(i);
        }
    }

    //Deletion of root
    int getLargest(){
        if (this.size == 0){
            return Integer.MAX_VALUE;
        }

        int max = heap[0];

        heap[0] = heap[ this.size - 1];
        this.size--;

        downHeapify(0);
        return max;
    }

    void downHeapify(int i){
        int largest = i;
        int lC = LeftChild(i);
        int rC = RightChild(i);

        if(lC < size && heap[lC] > heap[largest]){
            largest = lC;
        }

        if(rC < size && heap[rC] > heap[largest]){
            largest = rC;
        }

        if(largest != i){
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;

            downHeapify(largest);
        }
    }

    void display(){
        for(int i = 0; i< size; i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap_Own h = new MaxHeap_Own(10);

        h.MaxHeap(100);
        h.MaxHeap(90);
        h.MaxHeap(70);
        h.MaxHeap(40);
        h.MaxHeap(30);
        h.MaxHeap(25);

        System.out.print("Heap: ");
        h.display();

        System.out.println("Deleted Largest: " + h.getLargest());


        System.out.println("Heap after deletion: ");
        h.display();


        System.out.println("After deleting some element: ");
        h.getLargest();
        h.getLargest();
        h.display();
    }
}
