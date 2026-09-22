// GraphUtils.java
public class GraphUtils 
{
    // Print a single adjacency list (linked list)
    public static void printLL(EdgeNode head) {
        EdgeNode n = head;
        while (n != null) {
            System.out.print(" -> (" + n.toV + "," + n.weight + ")");
            n = n.next;
        }
        System.out.println();
    }

    // Append a new edge node to adjacency list
    public static void appendLL(EdgeNode head, EdgeNode eNode) {
        EdgeNode n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = eNode;
    }







    /*
         █████╗ ██████╗ ██████╗     ███████╗██████╗  ██████╗ ███████╗    ██╗     ██╗███████╗████████╗
        ██╔══██╗██╔══██╗██╔══██╗    ██╔════╝██╔══██╗██╔════╝ ██╔════╝    ██║     ██║██╔════╝╚══██╔══╝
        ███████║██║  ██║██║  ██║    █████╗  ██║  ██║██║  ███╗█████╗      ██║     ██║███████╗   ██║   
        ██╔══██║██║  ██║██║  ██║    ██╔══╝  ██║  ██║██║   ██║██╔══╝      ██║     ██║╚════██║   ██║   
        ██║  ██║██████╔╝██████╔╝    ███████╗██████╔╝╚██████╔╝███████╗    ███████╗██║███████║   ██║   
        ╚═╝  ╚═╝╚═════╝ ╚═════╝     ╚══════╝╚═════╝  ╚═════╝ ╚══════╝    ╚══════╝╚═╝╚══════╝   ╚═╝   
    */                                                                                         
    // Add an edge to adjacency list (undirected graph)
    public static void addEdgeList(EdgeNode[] adjList, int from, int to, int weight, boolean isDirected) {
        EdgeNode newNode = new EdgeNode(to, weight);
        if (adjList[from] == null) {
            adjList[from] = newNode;
        } else {
            GraphUtils.appendLL(adjList[from], newNode);
        }

        if (isDirected) return;
        
        // For undirected graph: also add reverse edge
        EdgeNode reverseNode = new EdgeNode(from, weight);
        if (adjList[to] == null) {
            adjList[to] = reverseNode;
        } else {
            GraphUtils.appendLL(adjList[to], reverseNode);
        }
    }

    // Show adjacency list for all vertices
    public static void showAdjList(EdgeNode[] adjList) {
        for (int i = 0; i < adjList.length; i++) {
            System.out.print("Vertex " + i + ":");
            printLL(adjList[i]);
        }
    }

    public static int maxDegreeList(EdgeNode[] adjList) {
        int max = 0;

        for (int i = 0; i < adjList.length; i++) {
            int c = 0; 
            EdgeNode n = adjList[i];
            while (n != null) {c++; n = n.next;}

            if (max < c)
                max = c;
        }

        return max;
    }


                                                                                                                
                                                                                                                
                                                                                                                
                                                                                                                
                                                                                                                
                                                                                                                
    /*                                                                                                               
         █████╗ ██████╗ ██████╗     ███████╗██████╗  ██████╗ ███████╗    ███╗   ███╗ █████╗ ████████╗██████╗ ██╗██╗  ██╗
        ██╔══██╗██╔══██╗██╔══██╗    ██╔════╝██╔══██╗██╔════╝ ██╔════╝    ████╗ ████║██╔══██╗╚══██╔══╝██╔══██╗██║╚██╗██╔╝
        ███████║██║  ██║██║  ██║    █████╗  ██║  ██║██║  ███╗█████╗      ██╔████╔██║███████║   ██║   ██████╔╝██║ ╚███╔╝ 
        ██╔══██║██║  ██║██║  ██║    ██╔══╝  ██║  ██║██║   ██║██╔══╝      ██║╚██╔╝██║██╔══██║   ██║   ██╔══██╗██║ ██╔██╗ 
        ██║  ██║██████╔╝██████╔╝    ███████╗██████╔╝╚██████╔╝███████╗    ██║ ╚═╝ ██║██║  ██║   ██║   ██║  ██║██║██╔╝ ██╗
        ╚═╝  ╚═╝╚═════╝ ╚═════╝     ╚══════╝╚═════╝  ╚═════╝ ╚══════╝    ╚═╝     ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝
    */                                                                                                            
    public static void addEdgeMatrix(int[][] adjMatrix, int from, int to, int weight, boolean isDirected) {
        adjMatrix[from][to] = weight;
        if (isDirected) return;
        adjMatrix[to][from] = weight;
    }

    public static void showAdjMatrix(int[][] adjMatrix) {
        int V = adjMatrix.length;

        for (int i = 0; i < V; i++) {
            System.out.print("Vertex-" + i + ": ");
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int maxDegreeMatrix(int[][] adjMatrix) 
    {
        int V = adjMatrix.length;
        int max = 0;

        for (int i = 0; i < V; i++) {
            int c = 0;
            for (int j = 0; j < V; j++) {
                if (adjMatrix[i][j] == 1) c++;
            }
            
            if (max < c)
                max = c;
        }

        return max;
    }
}