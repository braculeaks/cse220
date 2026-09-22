class LinkedList {
    Node head;

    public void append(Integer val) {
        if (head == null) {
            head = new Node(val);
            return;
        }

        Node newNode = new Node(val);
        Node tmp = head;
            while(tmp.next != null) {tmp = tmp.next;}     // iterate until last element
            tmp.next = newNode;                           // tmp = lastNode    [now]
    }

    public void prepend(Integer val) {
        Node newNode = new Node(val);
        newNode.next = head;
        this.head = newNode;
    }


    // 1000058970
    // Amitrakshar Biswas


    public void removeFirst() {
        if (head == null) System.out.println("Error 2");
        head = head.next;
    }

    public void removeLast() {
        if (head == null) System.out.println("Error 2");
        
        Node tmp = head;
        Node last = null;
        while(tmp.next != null) {   // iterate untill last element
            last = tmp;             // save 2nd last node
            tmp = tmp.next;
        }

        last.next = null;
    }





    public void printList() {
        Node tmp = head;

        while (tmp != null) {
            System.out.print(tmp.elem + " -> ");
            tmp = tmp.next;
        }
        System.out.print("null");
        System.out.println("");
    }

    public Node nodeAt(int idx) {
        Node tmp = head;

        if (idx < 0) System.out.println("Error 1");

        int i = 0;
        while(tmp != null) {
            if (i == idx) 
                return tmp;
            
            tmp = tmp.next;
            i++;
        }

        return null;
    }
}