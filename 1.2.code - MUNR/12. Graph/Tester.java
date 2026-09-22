public class Tester {

    static void addEdgeToList(int source, int destination, Node[] adjList) {
        Node edge = new Node(source, destination);
        if (adjList[source] == null) {
            adjList[source] = edge;
        } else {
            Node temp = adjList[source];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = edge;
        }
    }

    static void printList(Node[] adjList) {
        for (int i = 0; i < adjList.length; i++) {
            Node temp = adjList[i];
            System.out.print(i + ": ");
            while (temp != null) {
                System.out.print(temp.destination + "->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    static void addEdgeToMatrix(int source, int destination, int[][] adjMat) {
        adjMat[source][destination] = 1;
    }

    static void printMatrix(int[][] adjMat) {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        Node[] adjList = new Node[n + 1];
        addEdgeToList(1, 2, adjList);
        addEdgeToList(2, 4, adjList);
        addEdgeToList(3, 1, adjList);
        addEdgeToList(3, 4, adjList);
        addEdgeToList(3, 2, adjList);
        addEdgeToList(4, 3, adjList);
        printList(adjList);

        int[][] adjMat = new int[n + 1][n + 1];
        addEdgeToMatrix(1, 2, adjMat);
        addEdgeToMatrix(2, 4, adjMat);
        addEdgeToMatrix(3, 1, adjMat);
        addEdgeToMatrix(3, 4, adjMat);
        addEdgeToMatrix(3, 2, adjMat);
        addEdgeToMatrix(4, 3, adjMat);
        printMatrix(adjMat);

    }
}
