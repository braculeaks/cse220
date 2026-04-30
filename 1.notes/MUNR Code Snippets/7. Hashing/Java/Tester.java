public class Tester {
    public static void main(String[] args) {
        HashTable ht = new HashTable(5);
        ht.insert(12, "Apple");
        ht.insert(5, "Orange");
        ht.insert(17, "Banana");
        ht.insert(10, "Grapes");
        ht.printHashTable();
        String value = ht.search(13);
        System.out.println(value);
    }

}
