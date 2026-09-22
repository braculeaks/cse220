// Complete the subtractSummation method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================


    private static Integer sumTree( BTNode n ){
        if (n == null) return 0;
        return sumTree(n.right)+sumTree(n.left)+(int)n.elem ;
    }

    public static Integer subtractSummation( BTNode root ){
        Integer l = sumTree(root.left);
        Integer r = sumTree(root.right);

        return l-r;
    }


    //============================================================================

}
