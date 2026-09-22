/*
    You will have to complete the FruitNode Contrustor first
    then within this class you only have to complete two methods
    hashFunction() and insert()
    the rest of the metods are already written
    DO NOT TOUCH any other methods or codes 
*/

public class HashTable {
    private FruitNode[] ht;

    public HashTable(int size) {            // DONT Change
        this.ht = new FruitNode[size];
    }
    
    public void show() {                    // DONT Change
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    private int hashFunction(String key) {
        int sum = 0;

        int len = key.length();
        int a = len % 2;

        for (int i = a; i < len; i += 2) {
            sum += key.charAt(i);
        }

        return sum % ht.length;
    }





    /*
     * The insert() method will 
            1. create a FruitNode using name(Key) & price(value)
            2. insert it in the proper hashed index
            3. If collision occurs, then, resolve using the steps explained in the question

     * Notes on:     case (2): ==== collision + key matches somewhere ====
            in this case we update the matched node, i.e.:
                n1.fruit[1] = value;
                    - updated value might be higher than the previous nodes.
                    - need to move this updated node backwards
                    - Singly Linked List
                        1. Can't loop backwards (towards head) swapping n0
                        - solution is:
                            1. we delete n1
                            2. add it to the proper place again. a.k.a call insert() again
                                but this time insert will not recursively call another insert
     */
    public void insert(String key, Integer value) {
        FruitNode nk = new FruitNode(key, value);
        int idx = hashFunction(key);

        if (ht[idx] == null) {                  // no collision
            ht[idx] = nk;
            return;
        }

        FruitNode n0 = ht[idx];
        if (key.equals((String)n0.fruit[0])) {  // collision + key matched with head
            n0.fruit[1] = value;

            ht[idx] = n0.next;
            this.insert(key, value);
            return;
        }

        FruitNode n1 = n0.next;
        while (n1 != null) {                    // collision + key matched somewhere
            FruitNode n2 = n1.next;
            
            if (key.equals(n1.fruit[0])) {
                n1.fruit[1] = value;

                n0.next = n2;           
                n1.next = null;
                this.insert(key, value);
                return;
            }

            n0 = n1;
            n1 = n2;
        }




        n0 = ht[idx];
        n1 = n0.next;

        int v = (int)n0.fruit[1];
        if (value > v) {                        // collision + new key (> head)
            ht[idx] = nk;
            nk.next = n0;
            return;
        }

        while (n1 != null) {                    // collision + new key (<= head)
            v = (int)n1.fruit[1];

            if (value > v) {
                n0.next = nk;
                nk.next = n1;
                return;
            }

            n0 = n1;
            n1 = n1.next;
        }

        n0.next = nk;
        nk.next = null;
        return;
    }
}
