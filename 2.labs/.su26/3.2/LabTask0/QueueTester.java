public class QueueTester 
{
    public static void main(String[] args) 
    {
        ArrayQueue queue = new ArrayQueue(5);

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("\nEnqueuing elements...");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Attempting overflow enqueue:");
        queue.enqueue(60);   // should trigger overflow

        System.out.println("\nFront element: " + queue.peek());

        System.out.println("\nDequeuing elements...");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("\nAttempting underflow dequeue:");
        System.out.println(queue.dequeue());   // should trigger underflow

        System.out.println("\nIs queue empty? " + queue.isEmpty());
    }
}
