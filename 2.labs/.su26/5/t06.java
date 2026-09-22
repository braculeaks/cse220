import java.io.StringReader;

class MaxHeap_1 {
    private Integer[] priority;
    private String[] taskName;
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

    public MaxHeap_1(int capacity) {
        this.capacity = capacity;
        this.priority = new Integer[capacity + 1];  // +1 because we are using 1-based indexing
        this.taskName = new String[capacity + 1];
        this.size = 0;                          // index = size = capacity allowed
    }

    // Utility
    public void swap(int idx1, int idx2) {
        int tmp             = this.priority[idx1];
        this.priority[idx1] = this.priority[idx2];
        this.priority[idx2] = tmp;

        String tN = this.taskName[idx1];
        this.taskName[idx1] = this.taskName[idx2];
        this.taskName[idx2] = tN;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        else           return false;
    }




    public void insert(int value, String name) {
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
        this.priority[size] = value;
        this.taskName[size] = name;
        heapifyUp(size);
    }

    public String extractMax() {
        /*
         Steps:
         1. Handle empty heap
         2. Store root
         3. Move last element to root
         4. Reduce size
         5. Heapify down
        */
        
        if (size == 0) return null;

        String name = this.taskName[1];
        this.priority[1] = this.priority[size];
        this.taskName[1] = this.taskName[size];
        size--;

        heapifyDown(1);
        return name;
    }

    public Integer peek() {
        /*
         Steps:
         1. Handle empty heap
         2. Return root value
        */

        if (size == 0) return null;
        else           return this.priority[1];
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

        int x = this.priority[index];
        int p = this.priority[parent];

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
        
        int p = this.priority[index];
        int l = this.priority[index*2];

        if (index*2+1 > size) {
            if (p < l) {
                this.swap(index, index*2);
                heapifyDown(index*2);
                return;
            }
        }

        int r = this.priority[index*2+1];

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



public class t06 {
    public static void main(String[] args) {
        String[] task_names = {"Email", "Meeting", "Code Review", "Lunch", "Debug"};
        int[] priorities = {2, 5, 3, 1, 4};

        String[] sorted = solve(task_names, priorities);

        System.out.println();
        for (int i = 0; i < sorted.length; i++) {
            System.out.println((i+1) + ": " + sorted[i]);
        }
        System.out.println();
    }

    public static String[] solve(String[] task_names, int[] priorities) 
    {
        int len = task_names.length;
        MaxHeap_1 mh = new MaxHeap_1(len);
        for (int i = 0; i < len; i++) {
            mh.insert(priorities[i], task_names[i]);
        }

        String[] ans = new String[len];
        for (int i = 0; i < len; i++) {
            ans[i] = mh.extractMax();
        }

        return ans;
    }
}