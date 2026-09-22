import java.util.Arrays;

public class AssignmentTask2_ALT {
    public static Node swap_with_next(Integer[] arr, int k, Node n) {         // swap k, k+1
        int tmp = arr[k+1];
        arr[k+1] = arr[k];
        arr[k] = tmp;

        Node n0 = n;
        Node n1 = n.next;        // guranteed to exist
        Node n2 = n.next.next;

        n0.next = n2;            // n0 -> n1 -> n2
        n1.next = n0;
        n = n1;

        return n;
    }
    // Swapping Sort (just swap n^2 times)
    public static Node organizeBooks(Node head, Integer[] popularity) 
    {
        Integer[] p = popularity;
        int n = popularity.length;

        for (int i = 0; i < n; i++) 
        {
            if (p[0] < p[1]) {                           // not dummy headed, so we need to do this
                head = swap_with_next(p, 0, head);
            }

            Node n0 = head;
            Node n1 = head.next;

            for (int j = 2; j < n; j++) {
                if (p[j-1] < p[j]) {
                    n1 = swap_with_next(p, j-1, n1);     // swap j-1, j
                    n0.next = n1;
                }

                n0 = n1;
                n1 = n1.next;
            }
        }

        return head;
    }

    // NOTE: if you find any issue with the driver code please inform AIB
    // DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    // DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=================Test Case 1=================");
        Node books = LinkedList.createList(new String[]{"Dune", "IT", "Coraline", "Inferno", "Twlight"});
        Integer[] arr = { 8, 10, 5, 10, 6 };

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("\nExpected Output");
        System.out.println("IT -> Inferno -> Dune -> Twilight -> Coraline");
        
        System.out.println("Your Output");
        books = organizeBooks( books, arr );
        LinkedList.printLL(books);

       
        System.out.println("=================Test Case 2=================");
        Node books2 = LinkedList.createList(new String[]{"Hamlet", "Persuasion", "It", "Dracula", "Beloved"});
        Integer[] arr2 = {7, 9, 9, 6, 7};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("\nExpected Output");
        System.out.println("Persuasion -> It -> Hamlet -> Beloved -> Dracula");

        System.out.println("Your Output");
        books2 = organizeBooks(books2, arr2);
        LinkedList.printLL(books2);


        System.out.println("=================Test Case 3=================");
        Node books3 = LinkedList.createList(new String[]{"Matilda", "Franny", "Foundation", "Carrie", "Misery"});
        Integer[] arr3 = {5, 8, 8, 10, 6};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("\nExpected Output");
        System.out.println("Carrie -> Franny -> Foundation -> Misery -> Matilda");

        System.out.println("Your Output");
        books3 = organizeBooks(books3, arr3);
        LinkedList.printLL(books3);

    }
}
