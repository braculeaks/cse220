public class Tester {

    static BSTNode insert(BSTNode root, int value) {
        if (root == null) {
            BSTNode n = new BSTNode(value);
            return n;
        }
        if (value < root.elem)
            root.left = insert(root.left, value);
        else if (value > root.elem)
            root.right = insert(root.right, value);
        else
            System.out.println("Duplicate values are not allowed.");
        return root;
    }

    static BSTNode delete(BSTNode root, int value) {
        if (root == null)
            return root;
        if (value < root.elem) {
            root.left = delete(root.left, value);
            return root;
        } else if (value > root.elem) {
            root.right = delete(root.right, value);
            return root;
        } else {
            if (root.left == null && root.right == null) { //Case 1
                return null;
            } else if (root.left != null && root.right == null) { //Case 2
                return root.left;
            } else if (root.left == null && root.right != null) { //Case 3
                return root.right;
            } else {
                BSTNode successorNode = successor(root.right); // You can delete by predecessor as well. Do it yourself.
                root.elem = successorNode.elem;
                root.right = delete(root.right, successorNode.elem);
                return root;
            }
        }
    }

    static BSTNode successor(BSTNode root) { // Function/method to find successor
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    static int countNodes(BSTNode root) { // Function/method to count the number of nodes
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    static BSTNode balanceBST(BSTNode root) {
        if (root == null)
            return null;
        BSTNode[] arr = new BSTNode[countNodes(root)];
        storeInorder(root, arr, 0);
        return sortedArrayToBST(arr, 0, arr.length - 1);
    }

    static void storeInorder(BSTNode root, BSTNode[] arr, int i) {
        if (root == null)
            return;
        storeInorder(root.left, arr, i + 1);
        arr[i] = root;
        storeInorder(root.right, arr, i + 1);
    }

    static BSTNode sortedArrayToBST(BSTNode[] arr, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        BSTNode root = arr[mid];
        root.left = sortedArrayToBST(arr, start, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] arr = { 70, 50, 40, 90, 20, 60, 20, 95, 99, 80, 85, 75 };
        BSTNode root = null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inserting value " + arr[i]);
            root = insert(root, arr[i]);
        }
        BSTPrinter.inorder(root); // Printing the elements of BST
        System.out.println();

        BSTNode r = delete(root, 99); // Case 1
        BSTPrinter.inorder(r);
        System.out.println();

        r = delete(root, 40); // Case 2
        BSTPrinter.inorder(r);
        System.out.println();

        r = delete(root, 70); // Case 3
        BSTPrinter.inorder(r);
        System.out.println();

        int[] unbalancedArr = { 40, 50, 70, 90, 95, 99 };
        BSTNode unbalancedRoot = null;
        for (int i = 0; i < unbalancedArr.length; i++) {
            System.out.println("Inserting value " + unbalancedArr[i]);
            unbalancedRoot = insert(unbalancedRoot, unbalancedArr[i]); // Creating an unbalanced BST
        }
        BSTPrinter.inorder(unbalancedRoot); // Printing the elements of unbalanced BST
        System.out.println();

        r = balanceBST(unbalancedRoot); // Balancing the unbalanced BST
        BSTPrinter.inorder(r);
    }
}
