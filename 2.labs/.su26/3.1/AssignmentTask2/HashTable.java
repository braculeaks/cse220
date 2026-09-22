/*
    You will have to 
        1. complete the PairNode Contrustor first

        2. complete two methods
            2.1 hashFunction() and 
            2.2. searchHashtable()
            
    the rest of the metods are already written
    DO NOT TOUCH any other methods or codes
*/
public class HashTable 
{
    private PairNode[] ht;

    public HashTable(int size) {                    // DONT CHANGE
        this.ht = new PairNode[size];
    }

    public void createFromArray(Object[][] arr) {   // DONT CHANGE
        for( Object[] x: arr )
            this.insert( x );
    }

    public void insert(Object[] keyValuePair) {     // DONT CHANGE
        String key = (String)keyValuePair[0];
        Integer value = (Integer)keyValuePair[1];
        String srchResult = this.searchHashtable(keyValuePair);
        if ( srchResult==null ) {
            System.out.println("Incomplete searchHashTable() and hashFunction() method");
        } else if ( srchResult.equals( "Found" ) ){
            System.out.println("("+key+","+value+") already Inserted. Cannot reinsert.");
        } else {
            int hashedIndex = this.hashFunction( key );
            PairNode newPNode = new PairNode( key, value );
            if ( this.ht[hashedIndex] == null ){
                this.ht[hashedIndex] = newPNode;
            } else {
                newPNode.next = this.ht[hashedIndex];
                this.ht[hashedIndex] = newPNode;
            }
        }
    }

    public void printHashTable() {                  // DONT CHANGE
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" : " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("(Key: "+pNode.key+", Value: "+pNode.value+") --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }


    private int hashFunction(String key) {                  // must code this up and submit
        int sum = 0;
        for (int i = 0, lim = key.length(); i < lim; i += 2)
        {
            int x0 = 0, x1 = 0;
            
            if (i   < lim) x0 = key.charAt(i);
            if (i+1 < lim) x1 = key.charAt(i+1);

            int k = x0*1000 + x1;
            sum += k;
        }
        return sum % ht.length;
    }

    public String searchHashtable(Object[] keyValuePair)    // must code this up and submit
    {      
        String  key   = (String) keyValuePair[0];
        Integer value = (Integer) keyValuePair[1];

        int idx = hashFunction(key);
        if (ht[idx] == null) return "Not Found";

        PairNode n0 = ht[idx];
        while (n0 != null) {
            if (key.equals(n0.key)) return "Found";
            
            n0 = n0.next;
        }

        return "Not Found";
    }
}
