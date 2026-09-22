//LAB TASK NO NEED TO SUBMIT
public class Task3 {

        //===================================TASK#3_1===================================
        // This method takes 1 parameter, the root
        // This method returns the summation
        // No Helper Methods are needed for this task
        public static Integer sumTree( BTNode n ){
            if (n == null) return 0;
            return sumTree(n.right)+sumTree(n.left)+(int)n.elem ;
        }

        //===================================TASK#3_2===================================
        // This method takes 1 parameter, the root
        // This method returns the summation
        // You can use extra helper private static methods as per need
        public static void sumTreePrint( BTNode root ){
            Integer sum = sumTree(root);
            System.out.println(sum);
        }
        //============================================================================


}
