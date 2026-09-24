import java.util.Collections; //DO NOT CHANGE THIS LINE
import java.util.ArrayList; //DO NOT CHANGE THIS LINE
import java.util.List; //DO NOT CHANGE THIS LINE
import java.util.Scanner; //DO NOT CHANGE THIS LINE

public class Solution {

    public static void sumEachSubTree(BTNode n) {
        if (n == null) return;

        sumEachSubTree(n.left);
        sumEachSubTree(n.right);

        if (n.left != null)  n.elem += n.left.elem;
        if (n.right != null) n.elem += n.right.elem;

        // I finished @ 9:43, 10minutes after the quiz started.
    }


    //!!!!!!  WARNING WARNING WARNING !!!!!!
    //DO NOT TOUCH ANY OF THE CODES BELOW
    //IF YOUR CODE STOPS WORKING BECAUSE
    //YOU MODIFIED ANYTHING BELOW YOU WILL GET 0
    //IF INTENTIONAL MODIFICATION IS SUSPECTED
    //YOU'LL BE GIVEN 0 IN ALL LAB QUIZZES
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        
        BTNode root1 = BT.createTree(str1);
        
        sumEachSubTree(root1);

        BT.print( root1 );

        scanner.close();
    }
}






//!!!!!!  WARNING WARNING WARNING !!!!!!
//DO NOT TOUCH ANY OF THE CODES BELOW
//IF YOUR CODE STOPS WORKING BECAUSE
//YOU MODIFIED ANYTHING BELOW YOU WILL GET 0
//IF INTENTIONAL MODIFICATION IS SUSPECTED
//YOU'LL BE GIVEN 0 IN ALL LAB QUIZZES
class BTNode {
    int elem;
    BTNode left;
    BTNode right;

    public BTNode(int e) {
        elem = e;
    }
}
class BT{
  
  public static BTNode createTree(String str) {

        // Remove [ ], spaces, etc.
        str = str.replace("[", "")
                 .replace("]", "")
                 .replace(" ", "");

        String[] values = str.split(",");

        if (values.length == 0 || values[0].equals("null")) {
            return null;
        }

        // Create root
        BTNode root = new BTNode(Integer.parseInt(values[0]));

        // Queue implemented using an array
        BTNode[] queue = new BTNode[values.length];
        int front = 0;
        int rear = 0;

        queue[rear++] = root;

        int i = 1;

        while (i < values.length) {

            BTNode current = queue[front++];

            // Left child
            if (i < values.length && !values[i].equals("null")) {
                current.left = new BTNode(Integer.parseInt(values[i]));
                queue[rear++] = current.left;
            }
            i++;

            // Right child
            if (i < values.length && !values[i].equals("null")) {
                current.right = new BTNode(Integer.parseInt(values[i]));
                queue[rear++] = current.right;
            }
            i++;
        }

        return root;
  }

    public static void print(BTNode root) {
        if (root==null)
            System.out.println("null");
        else {
            int maxLevel = BT.maxLevel(root);
            printNodeInternal(Collections.singletonList(root), 1, maxLevel);
        }
    }

    private static void printNodeInternal(List<BTNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BT.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BT.printWhitespaces(firstSpaces);

        List<BTNode> newNodes = new ArrayList<BTNode>();
        for (BTNode node : nodes) {
            if (node != null) {
                System.out.print(node.elem);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BT.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BT.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BT.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null){
                    int elemLength = String.valueOf(nodes.get(j).left.elem).length();
                    if( elemLength==1 ) System.out.print("/");
                    else System.out.print(" /");
                }
                else
                    BT.printWhitespaces(1);

                BT.printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null){
                    int elemLength = String.valueOf(nodes.get(j).right.elem).length();
                    if( elemLength==1 ) System.out.print("\\");
                    else System.out.print(" \\");
                }
                else
                    BT.printWhitespaces(1);

                BT.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static int maxLevel(BTNode node) {
        if (node == null)
            return 0;

        return Math.max(BT.maxLevel(node.left), BT.maxLevel(node.right)) + 1;
    }

    private static boolean isAllElementsNull(List<?> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }
    
}
