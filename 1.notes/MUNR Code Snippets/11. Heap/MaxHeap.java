public class MaxHeap {
    int[] heap;
    int size;

    public MaxHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
    }

    public void swap(int i, int j) {
        int temp = this.heap[i];
        this.heap[i] = this.heap[j];
        this.heap[j] = temp;
    }

    public String insert(int val) {
        if (this.size == this.heap.length - 1)
            return "Insertion not possible";
        this.size++;
        this.heap[this.size] = val;
        this.swim();
        return "Insertion successful";
    }

    public void swim() {
        int child = this.size;
        int parent = child / 2;
        while (parent > 0 && this.heap[parent] < this.heap[child]) {
            this.swap(parent, child);
            child = parent;
            parent = child / 2;
        }
    }

    public int delete() {
        // Implement it yourself. You can take help from the class recording.
    }

    public void sink() {
        // Implement it yourself. You can take help from the class recording.
    }

    public void printHeap() {
        for (int i = 0; i < this.heap.length; i++) {
            System.out.print(this.heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 0, 300, 250, 200, 100 };
        MaxHeap maxHeap = new MaxHeap(10);
        for (int i = 1; i < arr.length; i++) {
            maxHeap.insert(arr[i]);
        }
        maxHeap.printHeap();
        maxHeap.insert(400);
        maxHeap.printHeap();

        while (true) {
            int val = maxHeap.delete();
            if (val != -1)
                System.out.println(val);
            else
                break;
        }

    }

}

// Also implement the Min Heap class. Try to solve the problems from lab and
// previous final questions.