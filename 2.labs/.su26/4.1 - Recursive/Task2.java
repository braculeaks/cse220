//LAB TASK NO NEED TO SUBMIT
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 1 parameters root
    // This method return total count of the nodes in the tree
    public static int countNodes( BTNode n ){
        if (n == null) return 0;
        return 1+countNodes(n.left)+countNodes(n.right);
    }
    //============================================================================

}
