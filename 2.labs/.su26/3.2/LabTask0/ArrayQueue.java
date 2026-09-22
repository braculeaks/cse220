public class ArrayQueue 
{
    private Object[] queue;
    private int front;      // front index
    private int rear;       // rear index
    private int size;       // current size != queue.length

    public ArrayQueue(int arrayLen) {
        this.queue = new Object[arrayLen];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void enqueue(Object element) {
        if (size == queue.length) return;

        queue[rear] = element;
        rear++;     if (rear == queue.length) rear = 0;
        size++;
    }

    public Object dequeue() {
        if (size == 0) return null;

        Object x = queue[front];

        size--;
        front++;    if (front == queue.length) front = 0;

        return x;
    }

    public Object peek() {
        if (size == 0) return null;
        else           return queue[front];
    }

    public boolean isEmpty() {
        return (size == 0) ? true: false;
    }
}
