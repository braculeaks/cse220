public class HashTable {
    Node[] hashtable;

    public HashTable(int size) {
        this.hashtable = new Node[size];
    }

    public void insert(int key, String value) {
        int index = this.hashFunction(key);
        Node newNode = new Node(key, value, null);
        if (this.hashtable[index] == null) {
            this.hashtable[index] = newNode;
        } else {
            newNode.next = this.hashtable[index];
            this.hashtable[index] = newNode;
        }
    }

    public String search(int key) {
        int index = this.hashFunction(key);
        Node temp = this.hashtable[index];
        while (temp != null) {
            if (temp.key == key)
                return temp.value;
            temp = temp.next;
        }
        return null;
    }

    public int hashFunction(int key) {
        return key % this.hashtable.length;
    }

    public void printHashTable() {
        for (int i = 0; i < this.hashtable.length; i++) {
            System.out.println("Index: " + i);
            Node temp = this.hashtable[i];
            while (temp != null) {
                System.out.print("(" + temp.key + ", " + temp.value + ") -->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}
