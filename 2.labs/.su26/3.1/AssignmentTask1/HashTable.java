/*
    You will have to complete the PairNode Contrustor first
    then within this class you only have to complete two methods
    hashFunction() and remove()
    the rest of the methods are already written
    DO NOT TOUCH any other methods or codes
*/

public class HashTable 
{
    private PairNode[] ht;

    public HashTable(int size) {                        // DONT CHANGE
        this.ht = new PairNode[size];
    }

    public void createFromArray(Object[][] arr) {       // DONT CHANGE
        for(Object[] x : arr)
            this.insert( x );
    }

    public void insert(Object[] keyValuePair) {         // DONT CHANGE
        Integer key = (Integer)keyValuePair[0];
        String value = (String)keyValuePair[1];

        int idx = hashFunction(key); 
        if (idx==-1) {
            //leaving it blank
        } else if ( ht[idx]==null ){
            ht[idx] = new PairNode(key, value);
        } else {
            PairNode pair = new PairNode(key, value);
            pair.next = ht[idx];
            ht[idx] = pair;
        }
    }

    public void printHashTable(){                       // DONT CHANGE
        for(int i=0; i<ht.length; i++){
            System.out.print( i+": " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("("+pNode.key+", '"+pNode.value+"') --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }

    private int hashFunction(Integer key) {             // Submit
        int k = (key + 3) % 6;
        return k;
    }

    public void remove(Integer key) {                   // Submit
        int idx = hashFunction(key);

        if (ht[idx] == null) return;
        
        PairNode n0 = ht[idx];
        PairNode n1 = n0.next;
        if (key == n0.key) {
            ht[idx] = n1;
            return;
        }

        while (n1 != null) {
            PairNode n2 = n1.next;

            if (n1.key == key) {
                n0.next = n2;
                return;
            }

            n0 = n1;
            n1 = n2;
        }
    }
}
