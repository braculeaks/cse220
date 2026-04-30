public class Tester {
    public static void main(String[] args) {
        Queue q = new Queue(); // Creating an empty queue object
        q.enqueue(10); // Inserting 10 into Queue
        q.enqueue(11); // Inserting 11 into Queue
        q.enqueue(12); // Inserting 12 into Queue
        q.enqueue(13); // Inserting 13 into Queue
        q.enqueue(14); // Inserting 14 into Queue
        System.out.println("Dequeued element: " + q.dequeue()); // Removes 10 from Queue
        System.out.println("Dequeued element: " + q.dequeue()); // Removes 11 from Queue
        System.out.println("Peeked Element: " + q.peek()); // Returns 12 from Queue
        System.out.println(q.isEmpty()); // Returns False
        System.out.println("Dequeued element: " + q.dequeue()); // Removes 12 from Queue
        System.out.println("Dequeued element: " + q.dequeue()); // Removes 13 from Queue
        System.out.println("Peeked Element: " + q.peek()); // Returns 14 from Queue
        System.out.println("Dequeued element: " + q.dequeue()); // Removes 14 from Queue
        System.out.println("Dequeued element: " + q.dequeue()); // Returns -1 (Queue Underflow)
        System.out.println("Peeked Element: " + q.peek()); // Returns -1 (Queue Underflow)
        System.out.println(q.isEmpty()); // Will print True
    }
}
