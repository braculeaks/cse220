//Assignment Task (must Submit)
// Complete the rangeSum method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only three parameters
    // first one is the root of the given tree
    // second one the low range and third one is high range
    // You can use extra helper private static methods as per need
    public static Integer rangeSum( BSTNode n, Integer low, Integer high ){
        if (n == null) return 0;
        
        int sum = 0;
        if (low <= n.elem)  sum += rangeSum(n.left, low, high);
        if (n.elem <= high) sum += rangeSum(n.right, low, high);

        if (low <= n.elem && n.elem <= high) sum += n.elem;
        return sum;
    }
    //===============================================================


}
