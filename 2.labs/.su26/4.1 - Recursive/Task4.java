//LAB TASK NO NEED TO SUBMIT
public class Task4 {

        //===================================TASK#4===================================
        // This method takes 1 parameter, the root
        // This method prints the leaf nodes of the tree
        // This method returns nothing
        // No Helper Methods are needed for this task
        public static void printLeafNodes( BTNode n ){
            if (n == null) return;
            if (n.left == null && n.right == null) System.out.print(n.elem + " ");

            printLeafNodes(n.left);
            printLeafNodes(n.right);
        }
        //============================================================================


}
