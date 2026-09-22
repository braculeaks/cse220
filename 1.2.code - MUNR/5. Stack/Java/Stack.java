public class Stack {
    Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int elem) {
        Node n = new Node(elem, this.top);
        this.top = n;
    }

    public int pop() {
        if (this.top == null)
            return -1;
        else {
            Node removed = this.top;
            this.top = this.top.next;
            return removed.elem;
        }
    }

    public int peek() {
        if (this.top == null)
            return -1;
        else
            return this.top.elem;
    }

    public boolean isEmpty() {
        if (this.top == null)
            return true;
        else
            return false;
    }
}
