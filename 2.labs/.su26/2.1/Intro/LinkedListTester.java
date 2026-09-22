public class LinkedListTester {
    public static void main(String[] args) {
        // Tester Code
        // Complete the methods inside the LinkedList class, then run this tester.
        LinkedList list = new LinkedList(); // Create a LinkedList

        System.out.println("===== Append Test =====");
        list.append(10);
        list.append(20);
        list.append(30);
        list.printList(); // Expected: 10 -> 20 -> 30

        System.out.println("\n===== Prepend Test =====");
        list.prepend(5);
        list.printList(); // Expected: 5 -> 10 -> 20 -> 30

        System.out.println("\n===== Node At Index Test =====");
        Node temp = list.nodeAt(0);
        System.out.println(temp.elem);      // Expected: 5
        temp = list.nodeAt(2);
        System.out.println(temp.elem);      // Expected: 20

        System.out.println("\n===== Remove First Test =====");
        list.removeFirst();
        list.printList(); // Expected: 10 -> 20 -> 30

        System.out.println("\n===== Remove Last Test =====");
        list.removeLast();
        list.printList(); // Expected: 10 -> 20
    }
}