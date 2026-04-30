public class Tester {

    static void addEdgeToMatrix(int source, int destination, int[][] adjMat) {
        adjMat[source][destination] = 1;
        adjMat[destination][source] = 1;
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
        int n = 8;
        int[][] adjMat = new int[n + 1][n + 1];

        addEdgeToMatrix(1, 2, adjMat);
        addEdgeToMatrix(1, 4, adjMat);
        addEdgeToMatrix(2, 3, adjMat);
        addEdgeToMatrix(2, 5, adjMat);
        addEdgeToMatrix(3, 4, adjMat);
        addEdgeToMatrix(3, 6, adjMat);
        addEdgeToMatrix(3, 8, adjMat);
        addEdgeToMatrix(6, 7, adjMat);

        // printMatrix(adjMat);

        System.out.print("BFS Traversal Sequence of the graph is: ");
        GraphTraversal.bfs(adjMat, 1);
        System.out.print("DFS Traversal Sequence of the graph is: ");
        GraphTraversal.dfs(adjMat, 1);
    }
}
