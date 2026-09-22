//LAB TASK NO NEED TO SUBMIT
public class Task1 {

    //======================TASK#1_1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree pre-order
    public static void preOrder( BTNode n ) {
        if (n==null){return;}
        System.out.print(n.elem + " ");
        preOrder(n.left);
        preOrder(n.right);
    }
    //==================================================

    //======================TASK#1_2======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void postOrderLvl( BTNode root ){
        postOrder_1(root, 0);
    }
    public static void postOrder_1(BTNode n, int lvl) {
        if (n == null) return;
        postOrder_1(n.left,  lvl+1);
        postOrder_1(n.right, lvl+1);
        System.out.println(n.elem + ":" + lvl);
    }
    public static void postOrder_2(BTNode n, int lvl) {
        if (n == null) return;
        postOrder_2(n.left,  lvl+1);
        postOrder_2(n.right, lvl+1);
        if (lvl % 2 == 0) System.out.println(n.elem + ":" + lvl);
    }
    //==================================================

    //======================TASK#1_3======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrderEvenLvl(BTNode root) {
        postOrder_2(root, 0);
    }
    //==================================================

}
