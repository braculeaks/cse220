// Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1a======================
    // This method takes only 1 parameter; root of a BST
    // You'll need to find the max of the BST and return it
    public static Integer maxOfBST(BSTNode n) {
        if (n == null) return null;

        while (n.right != null) n = n.right;
        return n.elem;
    }
    public static Integer maxOfBST_1(BSTNode n) {       // redundant, bcz, This was sorted BST
        if (n == null) return null;

        Integer L = maxOfBST_1(n.left);
        Integer R = maxOfBST_1(n.right);

        int max = n.elem;
        if (L != null & L > max) max = L;
        if (R != null & R > max) max = R;

        return max;
    }
    //==================================================

    //======================TASK#1b======================
    // This method takes only 2 parameters
    // root of a BST and the value of which you wanna the predecessor
    // You'll need to find the max of the BST and return it
    public static Integer inOrderPred_v1(BSTNode n, Integer x) {
             if (n == null)  return null;                       // could not find 'x'
        else if (x < n.elem) return inOrderPred_v1(n.left, x);
        else if (x > n.elem) return inOrderPred_v1(n.right, x);

        return maxOfBST(n.left);

        // does not handle the case where, predecessor is not in the left subTree
    }

    public static Integer inOrderPred_v2(BSTNode n, Integer x) {
        while(true) {
            if (n == null) return null;     // could not find 'x'
            if (x == n.elem) break;

            if (x < n.elem) n = n.left;
            else            n = n.right;
        }

        return maxOfBST(n.left);

        // does not handle the case where, predecessor is not in the left subTree
    }



    // Final Working Version
    public static Integer inOrderPred(BSTNode n, Integer x) 
    {
        Integer lsp = null;     // Last Smallest Parent

        while(true) {
            if (n == null) return null;     // could not find 'x'
            if (x == n.elem) break;

            if (x < n.elem)               n = n.left;
            else           {lsp = n.elem; n = n.right;}
        }

        Integer k = maxOfBST(n.left);
        if (k != null) return k;

        return lsp;
    }

    
    public static Integer inOrderPred_v3(BSTNode n, Integer x) 
    {
        Integer lsp = null;     // Last Smallest Parent
        Integer k = null;

             if (n == null)   return null;                       // could not find 'x'
        else if (x < n.elem)  k = inOrderPred_v1(n.left, x);
        else if (x > n.elem) {k = inOrderPred_v1(n.right, x); lsp = n.elem;}
        else if (x == n.elem) k = maxOfBST(n.left);

        if (k != null) return k;

        return lsp;
    }
    //==================================================
}
