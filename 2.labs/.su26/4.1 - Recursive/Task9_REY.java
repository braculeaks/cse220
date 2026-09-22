public class Task9_REY {
    public static boolean isString(BTNode n) {return isFull(n);}

    public static boolean isFull(BTNode n) {
        if (n == null) return true;
        if (n.left == null && n.right == null) return true;
        if (n.left == null || n.right == null) return false;

        return isFull(n.left) && isFull(n.right);
    }





    public static boolean isPerfect(BTNode n, int sampleDepth, int level) {
        if (n == null) return true;
        if (n.left == null && n.right == null) return (sampleDepth == level);
        if (n.left == null || n.right == null) return false;

        return isPerfect(n.left, sampleDepth, level+1) && isPerfect(n.right, sampleDepth, level+1);
    }

    public static int leftDepth(BTNode n) {
        int dep = -1;
        while (n != null) {
            dep ++;
            n = n.left;
        }
        return dep;
    }

    public static int getHeight(BTNode n) {
        if (n == null) return -1;

        int l = getHeight(n.left);
        int r = getHeight(n.right);

        return Math.max(l, r)+1;
    }

    public static int findDepthOf(Object e, BTNode n, int depth) {
        if (n == null) return -1;
        if (n.elem == e) return depth;

        int l = findDepthOf(e, n.left, depth+1);
        int r = findDepthOf(e, n.right, depth+1);

        return Math.max(l, r);          // bcz, l/r, one of them should be -1
    }





    public static int countNodes(BTNode n) {
        if (n == null) return 0;
        return 1 + countNodes(n.left) + countNodes(n.right);
    }

    public static void countLevels(BTNode n, int[] out, int level) {
        if (n == null) return;

        out[level]++;
        countLevels(n.left, out, level+1);
        countLevels(n.right, out, level+1);
    }





    public static boolean isComplete(BTNode n) {
        if (n == null) return true;

        Queue q = new Queue();
              q.enqueue(n);

        boolean gn = false;         // got null

        while (q.isEmpty() == false) {
            BTNode x = (BTNode) q.dequeue();

            if (x == null) gn = true;
            else {
                if (gn) return false;

                q.enqueue(x.left);
                q.enqueue(x.right);
            }
        }

        return true;
    }

    public static class Pair {
        BTNode node;
        int level;

        Pair(BTNode n, int l) {node = n; level = l;}
    }

    public static boolean isPerfect(BTNode root) {
        if (root == null) return true;

        Pair p = new Pair(root, 0);

        Queue q = new Queue();
              q.enqueue(p);

        boolean gn = false;         // got null
        int last_level = -1;

        while (q.isEmpty() == false) {
            Pair x = (Pair) q.dequeue();
            BTNode n = x.node;
            int l = x.level;

            if (l != last_level) {
                last_level = l;
                int s = q.size();
                if (s != Math.pow(2, l)) {return false;}
            }

            q.enqueue(new Pair(n.left, l+1));
            q.enqueue(new Pair(n.right, l+1));
        }

        return true;
    }
}
