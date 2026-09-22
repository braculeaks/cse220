public class t01_MinHeap_tester {
    public static void main(String[] args) {

        testInsertAndPeek();
        testExtractMin();
        testMultipleExtract();
        testEdgeCases();
        testCapacity();
        testIsEmpty();
        testSort();
    }

    // --------------------------
    // Test 1: Insert + Peek
    // --------------------------
    private static void testInsertAndPeek() {
        System.out.println("===== Test 1: Insert & Peek =====");

        MinHeap h = new MinHeap(10);

        h.insert(10);
        h.insert(5);
        h.insert(20);
        h.insert(2);

        Integer expected = 2;
        Integer actual = h.peek();

        check("Peek after inserts", expected, actual);
        System.out.println();
    }

    // --------------------------
    // Test 2: Extract Min
    // --------------------------
    private static void testExtractMin() {
        System.out.println("===== Test 2: Extract Min =====");

        MinHeap h = new MinHeap(10);

        h.insert(10);
        h.insert(5);
        h.insert(20);
        h.insert(2);

        check("First extract", 2, h.extractMin());
        check("Second extract", 5, h.extractMin());
        check("Third extract", 10, h.extractMin());
        check("Fourth extract", 20, h.extractMin());

        System.out.println();
    }

    // --------------------------
    // Test 3: Order correctness
    // --------------------------
    private static void testMultipleExtract() {
        System.out.println("===== Test 3: Sorted Order =====");

        MinHeap h = new MinHeap(10);

        Integer[] values = {15, 3, 17, 10, 84, 19, 6, 22, 9};

        for (Integer v : values) {
            h.insert(v);
        }

        Integer[] expected = {3, 6, 9, 10, 15, 17, 19, 22, 84};

        boolean pass = true;

        for (int i = 0; i < expected.length; i++) {
            Integer val = h.extractMin();
            if (!equals(expected[i], val)) {
                pass = false;
                System.out.println("Mismatch at index " + i +
                        " | Expected: " + expected[i] +
                        " | Got: " + val);
            }
        }

        if (pass) {
            System.out.println("PASS: Heap produces sorted order");
        }

        System.out.println();
    }

    // --------------------------
    // Test 4: Edge cases
    // --------------------------
    private static void testEdgeCases() {
        System.out.println("===== Test 4: Edge Cases =====");

        MinHeap h = new MinHeap(5);

        check("Extract from empty", null, h.extractMin());
        check("Peek from empty", null, h.peek());

        h.insert(42);
        check("Single element peek", 42, h.peek());
        check("Single element extract", 42, h.extractMin());
        check("Empty again", null, h.extractMin());

        System.out.println();
    }

    // --------------------------
    // Test 5: Capacity
    // --------------------------
    private static void testCapacity() {
        System.out.println("===== Test 5: Capacity =====");

        MinHeap h = new MinHeap(3);

        h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(1); // should be ignored or handled

        check("Capacity handling", 5, h.peek());

        System.out.println();
    }

    // --------------------------
    // Test 6: isEmpty
    // --------------------------
    private static void testIsEmpty() {
        System.out.println("===== Test 6: isEmpty =====");

        MinHeap h = new MinHeap(5);

        checkBool("Initially empty", true, h.isEmpty());

        h.insert(10);
        checkBool("After one insert", false, h.isEmpty());

        h.extractMin();
        checkBool("After removing all elements", true, h.isEmpty());

        System.out.println();
    }

    // --------------------------
    // Test 7: testSort
    // --------------------------
    private static void testSort() {
        Integer[] arr = {3, 7, 8, 9, 23, 45, 1, 2};
        MinHeap.outOfPlaceHeapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // --------------------------
    // Utility checker
    // --------------------------
    private static void check(String testName, Integer expected, Integer actual) {
        if (equals(expected, actual)) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println("FAIL: " + testName +
                    " | Expected: " + expected +
                    " | Got: " + actual);
        }
    }

    private static void checkBool(String testName, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println("FAIL: " + testName +
                    " | Expected: " + expected +
                    " | Got: " + actual);
        }
    }

    private static boolean equals(Integer a, Integer b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.equals(b);
    }
}