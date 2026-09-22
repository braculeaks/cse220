public class LinearArray {

    public int size;
    public int[] arr;

    public LinearArray(int[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public void printArray() {
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    public void leftShift() {
        for (int i = 1; i < this.arr.length; i++) {
            this.arr[i - 1] = this.arr[i];
        }
        this.arr[this.arr.length - 1] = 0;
    }

    public void rightShift() {
        // Complete by yourself
    }

    public void leftRotate() {
        // Complete by yourself
    }

    public void rightRotate() {
        // Complete by yourself
    }

    public void insertValue(int elem, int index) {
        if (size == 0) {
            System.out.println("Empty array");
        } else if (index < 0 || index >= this.arr.length) {
            System.out.println("Invalid index");
        } else if (index == size) {
            this.arr[index] = elem;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                this.arr[i] = this.arr[i - 1];
            }
            this.arr[index] = elem;
            size++;
        }
    }

    public int[] deleteValue(int index) {
        // Complete by yourself
    }

    public String linearSearch(int key) {
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == key)
                return "Element Found";
        }
        return "Element Not Found";
    }

    public String binarySearch(int key) {
        // Complete by yourself
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        LinearArray l1 = new LinearArray(a, 10);
        l1.printArray(); // This should print 1 2 3 4 5 6 7 8 9 10

        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        LinearArray l2 = new LinearArray(b, 10);
        l2.leftShift();
        l2.printArray(); // This should print 2 3 4 5 6 7 8 9 10 0

        int[] c = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        LinearArray l3 = new LinearArray(c, 10);
        l3.rightShift();
        l3.printArray(); // This should print 0 1 2 3 4 5 6 7 8 9

        int[] d = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        LinearArray l4 = new LinearArray(d, 10);
        l4.leftRotate();
        l4.printArray(); // This should print 2 3 4 5 6 7 8 9 10 1

        int[] e = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        LinearArray l5 = new LinearArray(e, 10);
        l5.rightRotate();
        l5.printArray(); // This should print 10 1 2 3 4 5 6 7 8 9

        int[] f = { 1, 2, 3, 4, 5, 6, 7, 8, 0, 0 };
        LinearArray l6 = new LinearArray(f, 8);
        l6.insertValue(99, 8);
        l6.printArray(); // This should print 1 2 3 4 5 6 7 8 99 0

        l6.insertValue(33, 2);
        l6.printArray(); // This should print 1 2 33 3 4 5 6 7 8 99

        l6.deleteValue(9);
        l6.printArray(); // This should print 1 2 33 3 4 5 6 7 8 0

        l6.deleteValue(3);
        l6.printArray(); // This should print 1 2 33 4 5 6 7 8 0 0

        int[] g = { 33, 1, 2, 4, 5, 12, 6, 31 };
        LinearArray l7 = new LinearArray(g, 8);

        System.out.println(l7.linearSearch(12)); // This should print "Element Found"
        System.out.println(l7.linearSearch(99)); // This should print "Element Not Found"

        System.out.println(l7.binarySearch(12)); // This should print "Element Found"
        System.out.println(l7.binarySearch(99)); // This should print "Element Not Found"

    }
}
