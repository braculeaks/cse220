// EdgeNode.java
public class EdgeNode {
    int toV;
    int weight;
    EdgeNode next;

    public EdgeNode(int toV, int weight) {
        this.toV = toV;
        this.weight = weight;
        this.next = null;
    }
}