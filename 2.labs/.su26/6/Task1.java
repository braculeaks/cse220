public class Task1 
{
    public static int Task1A(int[][] adjMatrix) {
        return GraphUtils.maxDegreeMatrix(adjMatrix);
    }
    public static int Task1B(EdgeNode[] adjList) 
    {
        return GraphUtils.maxDegreeList(adjList);
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

        int a1 = GraphUtils.maxDegreeList(adjList);
        System.out.println("Max Degree: " + a1);




        System.out.println("");
        System.out.println("");
        System.out.println("");
        int[][] adjMatrix = new int[V][V];
        GraphUtils.addEdgeMatrix(adjMatrix, 0, 1, 1, false);
        GraphUtils.addEdgeMatrix(adjMatrix, 0, 3, 1, false);
        GraphUtils.addEdgeMatrix(adjMatrix, 2, 3, 1, false);
        GraphUtils.addEdgeMatrix(adjMatrix, 2, 4, 1, false);

        // Show adjacency Matrix
        System.out.println("");
        System.out.println("Adjacency Matrix Representation:");
        GraphUtils.showAdjMatrix(adjMatrix);
        System.out.println("");

        int a2 = GraphUtils.maxDegreeMatrix(adjMatrix);
        System.out.println("Max Degree: " + a2);
        System.out.println("");
    }
}
