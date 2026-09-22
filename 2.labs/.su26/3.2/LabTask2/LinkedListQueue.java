//DO NOT CHANGE THIS CLASS
package LabTask2;
class LinkedListQueue {

    //DO NOT CHANGE THE VARIABLES OR ACCESS MODIFIERS
    private Node front, rear;

    //DO NOT CHANGE THIS CONSTRUCTOR
    public LinkedListQueue() {
        this.front = this.rear = null;
    }
    //DO NOT CHANGE THIS METHOD
    public void enqueue(Object elem) {
        Node newNode = new Node(elem);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }
    //DO NOT CHANGE THIS METHOD
    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        Object removedElem = this.front.elem;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return removedElem;
    }
    //DO NOT CHANGE THIS METHOD
    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return this.front.elem;
    }
    //DO NOT CHANGE THIS METHOD
    public boolean isEmpty() {
        return this.front == null;
    }
    //DO NOT CHANGE THIS METHOD
    public void displayQueue() {
        System.out.print("Queue (front to rear): ");
        Node current = front;
        while (current != null) {
            System.out.print(current.elem + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
