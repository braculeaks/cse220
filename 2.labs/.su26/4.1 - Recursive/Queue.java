// Queue Given Code from week 3.2

class Node {
    Object elem;
    Node next;

    //DO NOT CHANGE THIS CONSTRUCTOR
    public Node(Object elem, Node next) {
        this.elem = elem;
        this.next = next;
    }
    public Node(Object elem) {
        this.elem = elem;
    }
}

public class Queue<T> {

    //DO NOT CHANGE THE VARIABLES OR ACCESS MODIFIERS
    private Node front, rear;
    private int n;

    //DO NOT CHANGE THIS CONSTRUCTOR
    public Queue() {
        this.front = this.rear = null;
    }
    public int size() {return n;}

    
    //DO NOT CHANGE THIS METHOD
    public void enqueue(Object elem) {
        Node newNode = new Node(elem);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            n = 1;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
            n++;
        }
    }
    //DO NOT CHANGE THIS METHOD
    public Object dequeue() {
        if (isEmpty()) {
            n = 0;
            return null;
        }

        Object removedElem = this.front.elem;
        this.front = this.front.next;
        n--;

        if (this.front == null) {
            this.rear = null;
            n = 0;
        }

        return removedElem;
    }
    //DO NOT CHANGE THIS METHOD
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.front.elem;
    }
    //DO NOT CHANGE THIS METHOD
    public boolean isEmpty() {
        return this.front == null;
    }
}
