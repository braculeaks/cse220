public class Task4
{
    // We do modify the input
    public static int[][] Task4A(int[][] adjMatrix) {
        int V = adjMatrix.length;

        for (int i = 0; i < V; i++) {
            for (int j = 0; j <= i; j++) {
                int x = adjMatrix[i][j] + adjMatrix[j][i];
                adjMatrix[i][j] = x;
                adjMatrix[j][i] = x;
            }
        }

        return adjMatrix;
    }

    // We do modify the input
    public static EdgeNode[] Task4B(EdgeNode[] adjList) {
        int V = adjList.length;

        boolean[][] bm = new boolean[V][V];
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    bm[i][j] = false;
                }
            }
        
        for (int i = 0; i < V; i++) {
            EdgeNode n = adjList[i];

            while (n != null) {
                int from = i;
                int to = n.toV;
                int weight = n.weight;

                if (bm[from][to] == true) {
                    n = n.next;
                    continue;
                }

                EdgeNode tmp = adjList[to];
                while(tmp != null) {
                    if (tmp.toV == from) {
                        weight += tmp.weight;
                        break;
                    }
                    tmp = tmp.next;
                }

                if (tmp != null) tmp.weight = weight;
                                   n.weight = weight;

                if (tmp == null) GraphUtils.addEdgeList(adjList, to, from, weight, true);

                bm[from][to] = true;
                bm[to][from] = true;
                n = n.next;
            }
        }

        return adjList;
    }

    public static void main(String[] args) {    // Tester
        int V = 5;                              // number of vertices
        EdgeNode[] adjList = new EdgeNode[V];   // array of adjacency lists

        // Add edges (undirected)
        GraphUtils.addEdgeList(adjList, 0, 1, 2, true);
        GraphUtils.addEdgeList(adjList, 0, 3, 6, true);
        GraphUtils.addEdgeList(adjList, 3, 0, 6, true);
        GraphUtils.addEdgeList(adjList, 2, 3, 1, true);
        GraphUtils.addEdgeList(adjList, 2, 4, 4, true);
        GraphUtils.addEdgeList(adjList, 4, 2, 4, true);

        // Show adjacency list
        System.out.println("");
        System.out.println("Adjacency List Representation:");
        GraphUtils.showAdjList(adjList);
        System.out.println("");

        EdgeNode[] a1 = Task4B(adjList);
        System.out.println("Task4B: Convert Directed --> UnDirected: ");
        GraphUtils.showAdjList(a1);




        System.out.println("");
        System.out.println("");
        System.out.println("");
        int[][] adjMatrix = new int[V][V];
        GraphUtils.addEdgeMatrix(adjMatrix, 0, 1, 2, true);
        GraphUtils.addEdgeMatrix(adjMatrix, 1, 0, 2, true);
        GraphUtils.addEdgeMatrix(adjMatrix, 0, 3, 3, true);
        GraphUtils.addEdgeMatrix(adjMatrix, 2, 3, 1, true);
        GraphUtils.addEdgeMatrix(adjMatrix, 3, 2, 1, true);
        GraphUtils.addEdgeMatrix(adjMatrix, 2, 4, 4, true);

        // Show adjacency Matrix
        System.out.println("");
        System.out.println("Adjacency Matrix Representation:");
        GraphUtils.showAdjMatrix(adjMatrix);
        System.out.println("");

        int[][] a2 = Task4A(adjMatrix);
        System.out.println("Task4A: Convert Directed --> UnDirected: ");
        GraphUtils.showAdjMatrix(a2);
        System.out.println("");
    }
}
