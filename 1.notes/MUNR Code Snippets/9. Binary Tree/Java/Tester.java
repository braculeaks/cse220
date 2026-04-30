public class Tester {

    public static BTNode tree_construction(String[] arr, int i) {
        if (i >= arr.length || arr[i] == null) {
            return null;
        } else {
            BTNode p = new BTNode(arr[i]);
            p.left = tree_construction(arr, 2 * i);
            p.right = tree_construction(arr, 2 * i + 1);
            return p;
        }
    }

    public static void main(String[] args) {
        // Manually linking Binary Tree nodes
        BTNode root = new BTNode("A");
        BTNode n1 = new BTNode("B");
        BTNode n2 = new BTNode("C");
        BTNode n3 = new BTNode("D");
        BTNode n4 = new BTNode("E");
        BTNode n5 = new BTNode("F");
        BTNode n6 = new BTNode("G");

        root.left = n1;
        root.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.left = n5;
        n2.right = n6;

        // Preorder Traversal of Binary Tree
        System.out.print("The preorder sequence is: ");
        BTPrinter.preorder(root);
        System.out.println();

        // Inorder Traversal of Binary Tree
        System.out.print("The inorder sequence is: ");
        BTPrinter.inorder(root);
        System.out.println();

        // Postorder Traversal of Binary Tree
        System.out.print("The postorder sequence is: ");
        BTPrinter.postorder(root);
        System.out.println();

        // Creating Binary Tree nodes using Recursion
        String[] arr = { null, "A", "B", "C", "D", "E", "F", "G" };
        BTNode newRoot = tree_construction(arr, 1);
        System.out.print("The inorder sequence is: ");
        BTPrinter.inorder(newRoot);
        System.out.println();
    }
}