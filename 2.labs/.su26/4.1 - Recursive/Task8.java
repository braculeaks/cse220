// Complete the swapChild method
//ASSIGNMENT TASK MUST SUBMIT
public class Task8 {

    //===================================TASK#8===================================
    // This method takes only 3 parameters
    // 1st one is root of the given tree
    // 2nd one is there to help you count the levels
    // 3rd one is the level TILL which you need to swap childs
    // All the changes will happen in-place
    // This method doesn't return anything
    // You can use extra helper private static methods as per need
    public static void swapChild( BTNode n, int lvl, int M ){
        if (n == null) return;
        if (lvl >= M) return;

        BTNode tmp = n.left;
        n.left = n.right;
        n.right = tmp;

        swapChild(n.left, lvl+1, M);
        swapChild(n.right, lvl+1, M);
    }
    //============================================================================
}
