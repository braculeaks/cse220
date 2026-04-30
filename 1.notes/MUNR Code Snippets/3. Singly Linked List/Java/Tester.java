public class Tester {
    public static Node createList(int[] arr) {
        Node n1 = new Node(arr[0], null);
        Node head = n1;
        Node tail = n1;
        for (int i = 1; i < arr.length; i++) {
            Node n = new Node(arr[i], null);
            tail.next = n;
            tail = n;
        }
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.elem);
            if (temp.next != null)
                System.out.print("--> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int countList(Node head) {
        // Complete this yourself
    }

    public static Node nodeAt(Node head, int index) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index)
                return temp;
            count++;
            temp = temp.next;
        }
        return null; // means element does not exist
    }

    public static int elemAt(Node head, int index) {
        // Complete this yourself
    }

    public static Node updateValue(Node head, int index, int newValue) {
        // Complete this yourself
    }

    public static int indexOf(Node head, int elem) {
        // Complete this yourself
    }

    public static Node insert(Node head, int elem, int index) {
        int length = countList(head);
        if (index == 0) {
            Node newNode = new Node(elem, head);
            head = newNode;
        } else if (index == length) {
            Node newNode = new Node(elem, null);
            Node p = nodeAt(head, length - 1);
            p.next = newNode;
        } else if (index > 0 && index < length) {
            Node newNode = new Node(elem, null);
            Node p = nodeAt(head, index - 1);
            Node n = p.next;
            p.next = newNode;
            newNode.next = n;
        } else
            System.out.println("Insertion is not possible. Index is valid");
        return head;
    }

    public static Node remove(Node head, int index) {
        // Complete this yourself
    }

    public static Node reverseInPlace(Node head) {
        // Complete this yourself
    }

    public static Node leftRotate(Node head) {
        Node newHead = head.next;
        Node temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        head = newHead;
        return head;
    }

    public static Node rightRotate(Node head) {
        // Complete this yourself
    }

    public static void main(String[] args) {
        int[] a = { 11, 12, 13, 14, 15 };

        // Creates a singly linked list from the array
        Node returned_list = createList(a);
        // Prints the linked list {11--> 12--> 13--> 14--> 15}
        printList(returned_list);
        // Prints the length of linked list
        System.out.println(countList(returned_list));

        // Prints the element at index 2 {13}
        System.out.println(elemAt(returned_list, 2));
        // Prints the address of node at index 2 (13)
        System.out.println(nodeAt(returned_list, 2));
        // Updates the value at index 3 to 16
        returned_list = updateValue(returned_list, 3, 16);
        printList(returned_list); // Prints the updated linked list
        // Prints the index of element 16
        System.out.println(indexOf(returned_list, 16));

        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Node new_list = createList(b);
        printList(new_list);

        // Inserting 99 at start
        new_list = insert(new_list, 99, 0);
        // Prints the new list after insertion {99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        printList(new_list);

        // Inserting 11 at end
        new_list = insert(new_list, 11, 11);
        // Prints the new list after insertion {99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}
        printList(new_list);

        // Inserting 55 at middle
        new_list = insert(new_list, 55, 5);
        // Prints the new list after insertion {99, 1, 2, 3, 4, 55, 5, 6, 7, 8, 9, 10,
        // 11}
        printList(new_list);

        // Deleting the first value
        new_list = remove(new_list, 0);
        // Prints the new list after deletion {1, 2, 3, 4, 55, 5, 6, 7, 8, 9, 10, 11}
        printList(new_list);

        // Deleting a middle value
        new_list = remove(new_list, 4);
        // Prints the new list after deletion {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}
        printList(new_list);

        // Rotates the linked list to left
        new_list = leftRotate(new_list);
        // Prints the new list after left rotation {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1}
        printList(new_list);

        // Rotates the linked list to right
        new_list = rightRotate(new_list);
        // Prints the new list after right rotation {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}
        printList(new_list);

        // Rotates the linked list to right
        new_list = reverseInPlace(new_list);
        // Prints the new list after reversing {11--> 10--> 9--> 8--> 7--> 6-->5--> 4-->
        // 3--> 2--> 1}
        printList(new_list);
    }

}
