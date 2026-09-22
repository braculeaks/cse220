public class Task3
{
    public static int Task3A(int[][] adjMatrix) {
        return Task2.Task2A(adjMatrix);
        // I've modified addEdge() function so that,
        //      I don't have to solve Task 2 for undirected once & directed once
        //      I've submitted my addEdge() function along with everything else
    }
    public static int Task3B(EdgeNode[] adjList) {
        return Task2.Task2B(adjList);
    }

    public static void main(String[] args) {    // Tester
        int V = 5;                              // number of vertices
        EdgeNode[] adjList = new EdgeNode[V];   // array of adjacency lists

        // Add edges (undirected)
        GraphUtils.addEdgeList(adjList, 0, 1, 2, false);
        GraphUtils.addEdgeList(adjList, 0, 3, 6, false);
        GraphUtils.addEdgeList(adjList, 2, 3, 1, false);
        GraphUtils.addEdgeList(adjList, 2, 4, 4, false);

        // Show adjacency list
        System.out.println("");
        System.out.println("Adjacency List Representation:");
        GraphUtils.showAdjList(adjList);
        System.out.println("");

        int a1 = Task3B(adjList);
        System.out.println("Task3B: Max OutEdgeWeight: " + a1);




        System.out.println("");
        System.out.println("");
        System.out.println("");
        int[][] adjMatrix = new int[V][V];
        GraphUtils.addEdgeMatrix(adjMatrix, 0, 1, 2, false);
        GraphUtils.addEdgeMatrix(adjMatrix, 0, 3, 6, false);
        GraphUtils.addEdgeMatrix(adjMatrix, 2, 3, 1, false);
        GraphUtils.addEdgeMatrix(adjMatrix, 2, 4, 4, false);

        // Show adjacency Matrix
        System.out.println("");
        System.out.println("Adjacency Matrix Representation:");
        GraphUtils.showAdjMatrix(adjMatrix);
        System.out.println("");

        int a2 = Task3A(adjMatrix);
        System.out.println("Task3A: Max OutEdgeWeight: " + a2);
        System.out.println("");
    }
}
