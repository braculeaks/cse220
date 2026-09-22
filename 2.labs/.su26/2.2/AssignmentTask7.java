public class AssignmentTask7 
{
    public static void rangeMove(DNode dh, int start, int end) {
        DNode n0 = dh;
        DNode n1 = dh.next;

        DNode lh = null;
        DNode l0 = lh;

        while (n1 != dh) {
            DNode n2 = n1.next;

            int x = (int) n1.elem;
            if (start <= x && x <= end) 
            {
                if (lh == null) {lh = n1; l0 = lh;}
                else {
                    DNode l1 = n1;

                    l0.next = l1;
                    l1.prev = l0;
                    l1.next = null;

                    l0 = l1;
                }

                n0.next = n2;
                n2.prev = n0;
                n0 = n0;
                n1 = n2;
            }
            else {
                n0 = n1;
                n1 = n2;
            }
        }

        n0.next = lh;       // patch up
        lh.prev = n0;
        l0.next = dh;
        dh.prev = l0;
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
