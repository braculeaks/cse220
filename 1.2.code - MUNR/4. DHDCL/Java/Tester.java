public class Tester {

    public static DoublyNode createList(int[] arr) {
        DoublyNode dh = new DoublyNode(0, null, null);
        dh.next = dh;
        dh.prev = dh;
        DoublyNode tail = dh;

        for (int i = 0; i < arr.length; i++) {
            DoublyNode newNode = new DoublyNode(arr[i], dh, tail);
            tail.next = newNode;
            tail = newNode;
            dh.prev = tail;
        }

        return dh;
    }

    public static void printList(DoublyNode dh) {
        DoublyNode temp = dh.next;
        while (temp != dh) {
            System.out.print(temp.elem + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int countList(DoublyNode dh) {
        // Complete by yourself
    }

    public static DoublyNode nodeAt(DoublyNode dh, int index) {
        DoublyNode temp = dh.next;
        int count = 0;

        while (temp != dh) {
            if (count == index) {
                return temp;
            }
            count++;
            temp = temp.next;
        }
        return null;
    }

    public static DoublyNode insert(DoublyNode dh, int elem, int index) {
        int length = countList(dh);
        if (index < 0 || index >= length) {
            System.out.println("Invalid Index. Insertion Not Possible.");
        } else {
            DoublyNode newNode = new DoublyNode(elem, null, null);
            DoublyNode n1 = nodeAt(dh, index);
            DoublyNode n2 = n1.prev;
            newNode.next = n1;
            newNode.prev = n2;
            n2.next = newNode;
            n1.prev = newNode;
        }
        return dh;
    }

    public static DoublyNode remove(DoublyNode dh, int index) {
        // Complete by yourself
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };

        DoublyNode dh = createList(a);

        System.out.println("The doubly linked list is:");
        printList(dh); // Prints the doubly linked list

        System.out.println("Length of the list is: " + countList(dh)); // Prints the length of doubly linked
                                                                       // list

        System.out.println("Memory address of node at index 2 is: " + nodeAt(dh, 2)); // Prints the memory
                                                                                      // address of node at
                                                                                      // index 2

        System.out.println("---------------------------------------------------");
        System.out.println("The doubly linked list before insertion:");
        printList(dh);
        insert(dh, 99, 2); // Inserts element 99 at index 2
        System.out.println("The doubly linked list after insertion:");
        printList(dh); // Prints the doubly linked list after insertion

        System.out.println("The doubly linked list before insertion:");
        printList(dh);
        insert(dh, 99, 0); // Inserts element 99 at index 0
        System.out.println("The doubly linked list after insertion:");
        printList(dh); // Prints the doubly linked list after insertion

        System.out.println("The doubly linked list before insertion:");
        printList(dh);
        insert(dh, 99, 9); // Inserts element 99 at index 9
        System.out.println("The doubly linked list after removal:");
        printList(dh); // Prints the doubly linked list after insertion
        System.out.println("---------------------------------------------------");
        System.out.println("The doubly linked list before removal:");
        printList(dh);
        remove(dh, 2); // Removes element 99 at index 2
        System.out.println("The doubly linked list after removal:");
        printList(dh); // Prints the doubly linked list after removal

        System.out.println("The doubly linked list before removal:");
        printList(dh);
        remove(dh, 0); // Removes element 99 at index 0
        System.out.println("The doubly linked list after removal:");
        printList(dh); // Prints the doubly linked list after removal

        System.out.println("The doubly linked list before removal:");
        printList(dh);
        remove(dh, 9); // Removes element 99 at index 9
        System.out.println("The doubly linked list after removal:");
        printList(dh); // Prints the doubly linked list after removal
        System.out.println("---------------------------------------------------");
    }
}
