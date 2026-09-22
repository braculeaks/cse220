//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    private static Integer REY1(BSTNode l, BSTNode r) {
        int sum = 0;
        if (l == null || r == null) return 0;

        sum += l.elem + r.elem;
        sum += REY1(l.left, r.right);
        sum += REY1(l.right, r.left);

        return sum;
    }
    public static Integer mirrorSum(BSTNode n) {
        return REY1(n.left, n.right);
    }
    //===============================================================


}
