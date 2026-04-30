public class Queue {
    Node front, rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int elem) {
        Node newNode = new Node(elem, null);
        if (this.front == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    public int dequeue() {
        if (this.front == null) {
            return -1;
        } else {
            Node removed = this.front;
            this.front = this.front.next;
            return removed.elem;
        }
    }

    public int peek() {
        if (this.front == null) {
            return -1;
        } else {
            return this.front.elem;
        }
    }

    public boolean isEmpty() {
        if (this.front == null) {
            return true;
        } else {
            return false;
        }
    }
}
