public class Node {
    int source, destination, weight;
    Node next;

    public Node(int source, int destination) {
        this.source = source;
        this.destination = destination;
        this.weight = 1;
        this.next = null;
    }

}
