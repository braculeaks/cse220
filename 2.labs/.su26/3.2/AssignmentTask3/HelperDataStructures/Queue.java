//DO NOT CHANGE THIS CLASS

package HelperDataStructures;

public class Queue {

    //DO NOT CHANGE THE VARIABLES OR ACCESS MODIFIERS
    private Node front, rear;

    //DO NOT CHANGE THIS CONSTRUCTOR
    public Queue() {
        this.front = this.rear = null;
    }
    //DO NOT CHANGE THIS METHOD
    public void enqueue(Object elem) {
        Node newNode = new Node(elem);
        if (this.rear == null) {
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }
    //DO NOT CHANGE THIS METHOD
    public Object dequeue() {
        if (isEmpty()) {
          return null;
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
            return null;
        }
        return this.front.elem;
    }
    //DO NOT CHANGE THIS METHOD
    public boolean isEmpty() {
        return this.front == null;
    }
}
