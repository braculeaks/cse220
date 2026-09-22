//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task2 {

    //======================TASK#2======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor_v1(BSTNode n, Integer x, Integer y)
    {
        if (x > y) {
            int tmp = x;
            x = y;
            y = tmp;
        }

        while(true) {
            if (n == null) break;
            
            int k = n.elem;

                 if ((x <= k) && (y >= k)) return k;
            else if  (x < k)               n = n.left;
            else                           n = n.right;
        }

        return null;
    }


    public static Integer lowestCommonAncestor(BSTNode n, Integer x, Integer y)
    {
        if (x > y) {            // Swap X, Y
            int tmp = x;
            x = y;
            y = tmp;
        }

        int k = n.elem;

             if ((x <= k) && (y >= k)) return k;
        else if  (x < k)               return lowestCommonAncestor(n.left, x, y);
        else                           return lowestCommonAncestor(n.right, x, y);
    }
    //==================================================

}
