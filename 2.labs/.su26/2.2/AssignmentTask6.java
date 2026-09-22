public class AssignmentTask6 
{
    public static void pairJoin(DNode dh1, DNode dh2) 
    {
        DNode n10 = dh1;            // input is not CIRCULAR
        DNode n20 = dh2;            // input is not CIRCULAR
        DNode n11 = dh1.next;
        DNode n21 = dh2.next;

        while (n11 != null) {       // input is not CIRCULAR
            DNode n12 = n11.next;   // n10 -> n11 -> n12
            DNode n22 = n21.next;   // n20 -> n21 -> n22

            n11.next = n21;         // n10 -> n11 -> n21 -> n12 -> n22
            n21.next = n12;

            // n12.prev = n21;      // will get done in next iteration
            n21.prev = n11;
            n11.prev = n20;

            n10 = n11;
            n20 = n21;
            n11 = n12;
            n21 = n22;
        }

        n20.next = dh1;
        dh1.prev = n20;
        dh1.next.prev = dh1;        // inside the loop, this was saved to dh2.... which causes error in tester prebuilt helper functions
    }

    // DO NOT SUBMIT THE DRIVER CODE BELOW
    // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
