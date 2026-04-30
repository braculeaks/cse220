public class BSTPrinter {
    static void inorder(BSTNode root) {
        if (root == null)
            return;
        else {
            inorder(root.left);
            System.out.print(root.elem + " ");
            inorder(root.right);
        }
    }
}
