//LAB TASK NO NEED TO SUBMIT
public class Task5 {

        //===================================TASK#5===================================
        // This method takes 1 parameter, the root
        // This method returns the largest value
        // No Helper Methods are needed for this task
        public static Integer maxTree( BTNode n ){
            if (n == null) return null;

            Integer l = maxTree(n.left);
            Integer r = maxTree(n.right);

            Integer max = (int)n.elem;

            if (l != null && l > max) max = l;
            if (r != null && r > max) max = r;

            return max;
        }
        //============================================================================


}
