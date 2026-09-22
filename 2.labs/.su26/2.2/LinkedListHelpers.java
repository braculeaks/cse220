//DO NOT MODIFY ANY CODE IN THIS CLASS
public class LinkedListHelpers {

    public static DNode createDummyHeadedDoublyLL(Object[] values, boolean circular) {
        DNode dHead = new DNode(null);
        DNode n = dHead;

        for (int i = 0; i < values.length; i++) {
            DNode newNode = new DNode(values[i]);
            n.next = newNode;
            newNode.prev = n;
            n = newNode;
        }

        if (circular) {
            n.next = dHead;
            dHead.prev = n;
        }

        return dHead;
    }

    public static Node createDummyHeadedSinglyCircularLL(Object[] values, boolean circular) {
        Node dHead = new Node(null);
        Node n = dHead;

        for (int i = 0; i < values.length; i++) {
            Node newNode = new Node(values[i]);
            n.next = newNode;
            n = newNode;
        }

        if (circular) {
            n.next = dHead;
        }

        return dHead;
    }

    public static void printDummyHeadedSinglyCircularLL(Node head) {
        System.out.print("[X] --> ");
        Node n = head.next;

        while (n != head) {
            System.out.print("[" + n.elem + "] --> ");
            n = n.next;
        }

        System.out.println("(back to start)");
    }

    public static void printDummyHeadedDoublyLL(DNode head) {
        System.out.print("Forward: ");
        System.out.print("[X] --> ");
        DNode n = head.next;
        DNode lastNode = null;

        while (n != null) {
            System.out.print("[" + n.elem + "] --> ");
            if (n.next == null) {
                lastNode = n;
            }
            n = n.next;
        }

        System.out.println("(back to start)");

        System.out.print("Backward: ");
        n = lastNode;

        while (n != null && n.elem != null) {
            System.out.print("[" + n.elem + "] --> ");
            n = n.prev;
        }

        System.out.println("[X] --> (back to end)\n");
    }

    public static void printDummyHeadedDoublyCircularLL(DNode head) {
        System.out.print("Forward: ");
        System.out.print("[X] --> ");
        DNode n = head.next;

        while (n != head) {
            if (n == null) {
                System.out.println("\n[ERROR!!] NOT CIRCULAR!!!");
                return;
            }
            System.out.print("[" + n.elem + "] --> ");
            n = n.next;
        }

        System.out.println("(back to start)");

        System.out.print("Backward: ");
        n = head.prev;

        if (n == null) {
            System.out.println("[ERROR!!] No PREV Connection from HEAD");
            return;
        }

        while (n != head) {
            System.out.print("[" + n.elem + "] --> ");
            n = n.prev;
        }

        System.out.println("[X] --> (back to end)\n");
    }
}
