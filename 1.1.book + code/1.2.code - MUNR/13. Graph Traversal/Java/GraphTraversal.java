import java.util.Stack; //Importing built-in Stack class
import java.util.Queue; //Importing built-in Queue class
import java.util.LinkedList;

public class GraphTraversal {
    static void bfs(int [][] adjMat, int source){
        int [] visited = new int [adjMat.length]; 
        Queue <Integer> q = new LinkedList<>(); //Initializing empty Queue
        visited[source] = 1;
        q.add(source);
        while (q.isEmpty() != true) {
            int u = q.remove();
            System.out.print(u + " ");
            for (int v = 0; v < adjMat[u].length; v++) {
                if (adjMat[u][v] == 1 && visited[v] == 0) {
                    visited[v] = 1;
                    q.add(v);
                }
            }
        }
        System.out.println();
    }

    static void dfs(int [][] adjMat, int source){
        int [] visited = new int [adjMat.length]; 
        Stack <Integer> s = new Stack<>(); // Initializing empty Stack
        visited[source] = 1;
        s.push(source);
        while (s.isEmpty() != true) {
            int u = s.pop();
            System.out.print(u + " ");
            for (int v = 0; v < adjMat[u].length; v++) {
                if (adjMat[u][v] == 1 && visited[v] == 0) {
                    visited[v] = 1;
                    s.push(v);
                }
            }
        }
        System.out.println();
    }
}
