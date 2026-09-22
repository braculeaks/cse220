public class NodeTester {
    public static void main(String[] args) {
        Node n4 = new Node("python");
        Node n5 = new Node("java");
        Node n2 = new Node(324);
        Node n3 = new Node(8.97);
        Node n1 = new Node("hello");

        n4.next = n5;
        n5.next = n2;
        n2.next = n3;
        n3.next = n1;
        n1.next = n5;

        
        System.out.println( n1 );
        System.out.println( n3.next );
        System.out.println( n3.next.elem );

        Node x = n4.next;
        System.out.println(n1.elem + x.elem);

        x.next = n3;
        System.out.println(n2.next.next + n5.next);

        n5 = null;
        System.out.println( n4.next.elem );

        x.next.next = null;
        n3.next.elem = 321;
        n4.next = 532;

        System.out.println(n4.next.elem);
    }
}
