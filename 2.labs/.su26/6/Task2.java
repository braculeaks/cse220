public class Task2 
{
    public static int Task2A(int[][] adjMatrix) {
        int V = adjMatrix.length;
        int max = 0;

        for (int i = 0; i < V; i++) 
        {
            int t = 0;

            for (int j = 0; j < V; j++) {
                t += adjMatrix[i][j];
            }

            if (max < t)
                max = t;
        }

        return max;
    }
    public static int Task2B(EdgeNode[] adjList) 
    {
        int max = 0;

        for (int i = 0; i < adjList.length; i++) 
        {
            EdgeNode tmp = adjList[i];
            int t = 0;

            while (tmp != null) {
                t += tmp.weight;
                tmp = tmp.next;
            }

            if (max < t)
                max = t;
        }

        return max;
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

        int a1 = Task2B(adjList);
        System.out.println("Task2B: Max EdgeWeight: " + a1);




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

        int a2 = Task2A(adjMatrix);
        System.out.println("Task2A: Max EdgeWeight: " + a2);
        System.out.println("");
    }
}
