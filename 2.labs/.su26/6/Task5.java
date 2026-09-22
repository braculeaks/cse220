class Edge {
    int toV, weight;
    Edge next;

    public Edge(int t, int w) {
        this.toV = t;
        this.weight = w;
    }
}

public class Task5 
{
    public static void laughTale(Integer[] warLords, Edge[] adjL, int sSt, int sP, int lSt, int lP){
        // TODO: Implement the laughTale method according to the problem requirements
    }

    public static void main(String[] args) {
        // Adjacency list representation of the graph
        Edge[] adjList = new Edge[11];
        adjList[1] = new Edge(4, 100);
        adjList[2] = new Edge(5, 250);
        adjList[3] = new Edge(6, 550);
        adjList[4] = new Edge(7, 650);
        adjList[5] = new Edge(6, 300);
        adjList[6] = new Edge(7, 50);
        adjList[6].next = new Edge(9, 200);
        adjList[7] = new Edge(8, 10);
        adjList[8] = new Edge(10, 25);
        adjList[9] = new Edge(10, 600);

        // Printing adjacency list
        printAdjacencyList(adjList);
        
        // Driver Code
        Integer[] warLordPowers = { null, 500, 1400, 900, 300, 80, 450, 650, 2000, 650, -1 };
        System.out.println("==============Task1:Test Cases=============");
        System.out.println("====Test Case 1:====");
        System.out.println("Expected Output: Winner is Shanks");
        System.out.print("Your Output: ");
        laughTale(warLordPowers, adjList, 2, 7000, 1, 3000);
        System.out.println("====Test Case 2:====");
        System.out.println("Expected Output: Winner is Luffy");
        System.out.print("Your Output: ");
        laughTale(warLordPowers, adjList, 2, 7000, 3, 6500);
    }

    public static void printAdjacencyList(Edge[] adjList) {
        for (int i = 0; i < adjList.length; i++) {
            System.out.print(i + " : ");
            Edge current = adjList[i];
            while (current != null) {
                System.out.print("<" + current.toV + "," + current.weight + "> -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}
