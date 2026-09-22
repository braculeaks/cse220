
public class LabTask2 
{
    public static int countNode(Node x) {
        int ans = 0;
        while(x != null) {
            ans++;
            x = x.next;
        }
        return ans;
    }

    public static Node wordDecoder(Node head) {
        int c = countNode(head);
        int mul = 13 % c;

        Node newHead = null;

        int i = 1;
        Node tmp = head.next;
        while(tmp != null) {
            if (i % mul == 0) {
                if (newHead == null) {
                    newHead = new Node(tmp.elem);
                }
                else {
                    // prepend
                    Node newNode = new Node(tmp.elem);
                    newNode.next = newHead;
                    newHead = newNode;
                }
            }
            i++;
            tmp = tmp.next;
        }

        Node dHead = new Node(null);
        dHead.next = newHead;
        newHead = dHead;

        return newHead;
        
        // You're suppose to create a new Dummy headed Singly Linked List in this method
        // Dummy head is basically a head Node where the elem is null
        //      Node dHead = new Node(null, null); here the dHead is a Dummy Head
    }


    public static void main(String[] args) {
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);

        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();

        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);

        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
