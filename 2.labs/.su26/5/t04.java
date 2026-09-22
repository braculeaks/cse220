public class t04 {
    public static void main(String[] args) {
        int[] tasks = {2, 4, 7, 1, 6, 1, 2, 1, 3, 4, 5, 6, 1, 1, 2, 1, 2, 2, 1};
        int m = 4;

        // 1. Create minHeap, with all elements set to 0
        MinHeap mh = new MinHeap(m);
        for (int i = 0; i < m; i++) {
            mh.insert(0);
        }

        // 2. for each x : tasks
        for (int i = 0; i < tasks.length; i++) {    // n*inside
            Integer x = mh.extractMin();            // logn
            x += tasks[i];
            mh.insert(x);
        }

        // 3. just print
        System.out.println();
        for (int i = 0; i < m; i++) {
            int x = mh.extractMin();               // 0 -> n    small -> big
            System.out.print(x + ", ");
        }
        System.out.println();
    }
}