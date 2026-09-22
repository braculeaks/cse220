// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task7 {

    //===================================TASK#7===================================

    private static Integer sum1(BTNode n, int lvl) {
        if (n == null) return 0;

        int L = sum1(n.left,  lvl+1);
        int R = sum1(n.right, lvl+1);

        int sum = L + R;
        if (lvl % 2 == 0) sum += (int)n.elem;
        else              sum -= (int)n.elem;

        return sum;
    }

    public static Integer levelSum( BTNode root ){
        return sum1(root, 1);
    }

    //============================================================================

}
