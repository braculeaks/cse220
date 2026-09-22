//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST(BSTNode n) {
        if (n == null) return true;

        BSTNode l = n.left;
        BSTNode r = n.right;

        if (l != null && l.elem > n.elem) return false;
        if (r != null && r.elem < n.elem) return false;

        return isBST(n.left) && isBST(n.right);
    }
    //===============================================================


}
