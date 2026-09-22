public class BTPrinter {

    public static void preorder(BTNode node) {
        if (node == null)
            return;
        System.out.print(node.elem + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(BTNode node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.elem + " ");
        inorder(node.right);
    }

    public static void postorder(BTNode node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.elem + " ");
    }

}