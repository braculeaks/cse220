//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method
public class Task3 {

    //===================================TASK#3===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String

    public static String findPath(BSTNode n, Integer key) {
        String out = "";

        while (true) {
            if (n == null) return "No Path Found";

            out += n.elem + " ";
            
            if      (key == n.elem) break;
            else if (key <  n.elem) n = n.left; 
            else                    n = n.right;
        }

        return out + "\n";
    }

    public static String findPath_v2(BSTNode n, Integer key) {
        String out = "";

        while (true) {
            if (n == null) return "No Path Found";

            out += n.elem + " ";
            
            if      (key == n.elem) break;
            else if (key <  n.elem) n = n.left; 
            else                    n = n.right;
        }

        return out + "\n";
    }
    
    //============================================================================

}
