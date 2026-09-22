public class MaxHeap {

    private Integer[] heap;
    private int size;
    private int capacity;

    public static void outOfPlaceMaxHeapSort(Integer[] arr) {
        MaxHeap mh = new MaxHeap(arr.length);

        for (int i = 0; i < arr.length; i++) {
            mh.insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mh.extractMax();               // 0 -> n    big -> small
        }
    }

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new Integer[capacity + 1];  // +1 because we are using 1-based indexing
        this.size = 0;                          // index = size = capacity allowed
    }

    // Utility
    public void swap(int idx1, int idx2) {
        int tmp         = this.heap[idx1];
        this.heap[idx1] = this.heap[idx2];
        this.heap[idx2] = tmp;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        else           return false;
    }




    public void insert(int value) {
        /*
         Steps:
         1. Check if heap is full
         2. Insert at end
         3. Heapify up
        */

        if (size >= capacity) {
            System.out.println("Heap is full");
            return;
        }

        size++;                     // size = 0;   We decided not to use index 0 ever.
        this.heap[size] = value;
        heapifyUp(size);
    }

    public Integer extractMax() {
        /*
         Steps:
         1. Handle empty heap
         2. Store root
         3. Move last element to root
         4. Reduce size
         5. Heapify down
        */
        
        if (size == 0) return null;

        Integer x = this.heap[1];
        this.heap[1] = this.heap[size];
        size--;

        heapifyDown(1);
        return x;
    }

    public Integer peek() {
        /*
         Steps:
         1. Handle empty heap
         2. Return root value
        */

        if (size == 0) return null;
        else           return this.heap[1];
    }





    
    // --------------------------
    // Heapify operations
    // --------------------------
    private void heapifyUp(int index) {
        /*
            Move element up while parent is greater
        */
        if (index == 1) return;

        int parent = index / 2;

        int x = this.heap[index];
        int p = this.heap[parent];

        if (p < x) {
            this.swap(parent, index);
            heapifyUp(parent);
        }
    }

    private void heapifyDown(int index) {
        /*
            Move element down by comparing with children
        */

        if (index > size) return;
        if (index*2 > size) return;
        
        int p = this.heap[index];
        int l = this.heap[index*2];

        if (index*2+1 > size) {
            if (p < l) {
                this.swap(index, index*2);
                heapifyDown(index*2);
                return;
            }
        }

        int r = this.heap[index*2+1];

        if (p < l || p < r) {
            if (l > r) {
                this.swap(index, index*2);
                heapifyDown(index*2);
            }
            else {
                this.swap(index, index*2+1);
                heapifyDown(index*2+1);
            }
        }
    }
}