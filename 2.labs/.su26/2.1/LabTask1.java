
public class LabTask1 
{
    public static Boolean assembleCongaLine(Node head) {
        Node tmp = head;

        while(tmp.next != null) {
            int k0 = ((int)tmp.elem);
            int k1 = ((int)tmp.next.elem);
            if (k1 < k0) return false;

            tmp = tmp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("==============Test Case 1=============");
        Node congaLine = LinkedList.createList(new Integer[]{10,15,34,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);

        System.out.println("Expected output: true");
        System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print True
        System.out.println();

        System.out.println("==============Test Case 2=============");
        congaLine = LinkedList.createList(new Integer[]{10,15,44,41,56,72});
        System.out.print("Original Conga Line: ");
        LinkedList.printLL(congaLine);

        System.out.println("Expected output: false");
        System.out.println( "Your output: "+assembleCongaLine(congaLine) ); //This should print False
        System.out.println();
    }
}
