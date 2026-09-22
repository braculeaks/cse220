//DO NOT CHANGE THIS CLASS

package HelperDataStructures;

public class Stack {

    private Node top;

    //DO NOT CHANGE THIS CONSTRUCTOR
    public Stack() {
        this.top = null;
    }

    // Push method
    //DO NOT CHANGE THIS METHOD
    public void push(Object elem) {
        Node nn = new Node(elem, top);
        this.top = nn;
    }

    // Pop method
    //DO NOT CHANGE THIS METHOD
    public Object pop() {
        if (top == null) {
            // Stack underflow
            return null; 
        }
        Object e = this.top.elem;
        this.top = this.top.next;
        return e;
    }

    // Peek method
    //DO NOT CHANGE THIS METHOD
    public Object peek() {
        if (top == null) {
            // Stack underflow
            return null; 
        }
        return top.elem;
    }

    // isEmpty method
    //DO NOT CHANGE THIS METHOD
    public boolean isEmpty() {
        return top == null;
    }
}
