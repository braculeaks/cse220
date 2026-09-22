public class DoublyNode {
    int elem;
    DoublyNode prev, next;

    public DoublyNode(int elem, DoublyNode next, DoublyNode prev) {
        this.elem = elem;
        this.prev = prev;
        this.next = next;
    }
}
