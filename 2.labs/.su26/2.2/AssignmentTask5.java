public class AssignmentTask5 
{
    public static void sumOddAppend(Node dh) {
        Node n0 = dh;
        Node n1 = dh.next;
        Node n2 = null;

        int sum = 0;
        while (n1 != dh) {
            n2 = n1.next;

            int x = (int) n1.elem;
            if (x % 2 == 1) {
                sum += x;

                n0.next = n2;
                n1.next = null;
            }

            n0 = n1;
            n1 = n2;
        }

        n1 = new Node(sum);
        n0.next = n1;
        n1.next = n2;       // n2 = dh @ this point.
    }

    // DO NOT SUBMIT THE DRIVER CODE BELOW
    // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {11, 22, 33, 44, 55, 66};
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = {22, 44, 66, 99};
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);
        
        //Running the Sum Odd Append
        sumOddAppend(head);
        //Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}
